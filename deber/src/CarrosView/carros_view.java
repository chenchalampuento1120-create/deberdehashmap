/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarrosView;
import java.util.Scanner;
import CarrosController.carros_controller;
import CarrosModel.carros_model;

public class carros_view {
     Scanner sc = new Scanner(System.in);
    carros_controller controlador = new carros_controller();
 public void menu() {
    while (true) {

    System.out.println("===== CONCESIONARIO =====");
    System.out.println("1. Agregar carro");
    System.out.println("2. Mostrar carros");
    System.out.println("3. Actualizar carro");
    System.out.println("4. Eliminar carro");
    System.out.println("5. Salir");
    System.out.print("Seleccione: ");
        int opcion = sc.nextInt();

    switch (opcion) {

        case 1:
        System.out.println("Codigo:");
            int codigo = sc.nextInt();
            sc.nextLine();

        System.out.println("Marca:");
            String marca = sc.nextLine();

        System.out.println("Modelo:");
            String modelo = sc.nextLine();

        System.out.println("Precio:");
            double precio = sc.nextDouble();

            carros_model carro = new carros_model(codigo, marca, modelo, precio);
            controlador.agregarCarro(carro);
            break;
        case 2:
            controlador.listarCarros();
               break;

        case 3:
           System.out.println("Codigo:");
               codigo = sc.nextInt();
               sc.nextLine();

           System.out.println("Nueva marca:");
                    marca = sc.nextLine();

           System.out.println("Nuevo modelo:");
                    modelo = sc.nextLine();

            System.out.println("Nuevo precio:");
               precio = sc.nextDouble();

                if (controlador.actualizarCarro(codigo, marca, modelo, precio)) {
            System.out.println("Carro actualizado");
                } else {
            System.out.println("Carro no encontrado");
                    }
                break;
        case 4:
             System.out.println("Codigo:");
               codigo = sc.nextInt();

               if (controlador.eliminarCarro(codigo)) {
                   System.out.println("Carro eliminado");
                } else {
               System.out.println("Carro no encontrado");
                }
               break;

        case 5:
            System.out.println("Hasta luego");
            System.exit(0);
            break;

        default:
            System.out.println("Opcion incorrecta");
        }
    }
     }
}

             

               
