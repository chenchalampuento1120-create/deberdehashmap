/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComprasView;

/**
 *
 * @author PC
 */
import java.util.Scanner;
import compras_controller.ComprasController;
import ComprasModel.ComprasModel;

/**
 *
 * @author Estudiante
 */
public class ComprasView {

    Scanner sc = new Scanner(System.in);
    ComprasController controlador = new ComprasController();

    public void menu() {
        while (true) {

            System.out.println("===== MENU DE COMPRAS =====");
            System.out.println("1. Agregar compra");
            System.out.println("2. Mostrar compras");
            System.out.println("3. Actualizar compra");
            System.out.println("4. Eliminar compra");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error ingrese solo numeros");
                sc.next();
            }

            int opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Ingrese el codigo:");
                    int codigo = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Nombre de la compra:");
                    String nombre = sc.nextLine();

                    System.out.println("Precio:");
                    double precio = sc.nextDouble();

                    System.out.println("Cantidad:");
                    int cantidad = sc.nextInt();

                    ComprasModel compra = new ComprasModel(codigo, nombre, precio, cantidad);
                    controlador.agregarCompra(compra);
                    break;

                case 2:
                    controlador.listarCompras();
                    break;

                case 3:
                    System.out.println("Codigo de compra:");
                    codigo = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Nuevo nombre:");
                    nombre = sc.nextLine();

                    System.out.println("Nuevo precio:");
                    precio = sc.nextDouble();

                    System.out.println("Nueva cantidad:");
                    cantidad = sc.nextInt();

                    if (controlador.actualizarCompra(codigo, nombre, precio, cantidad)) {
                        System.out.println("Compra actualizada");
                    } else {
                        System.out.println("Compra no encontrada");
                    }
                    break;

                case 4:
                    System.out.println("Codigo de compra:");
                    codigo = sc.nextInt();

                    if (controlador.eliminarCompra(codigo)) {
                        System.out.println("Compra eliminada con exito");
                    } else {
                        System.out.println("Compra no encontrada");
                    }
                    break;

                case 5:
                    System.out.println("Hasta luego");
                    return;

                default:
                    System.out.println("Opcion incorrecta");
            }
        } 
    }
}