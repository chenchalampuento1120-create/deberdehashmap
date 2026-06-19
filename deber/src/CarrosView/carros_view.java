/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarrosView;
    import java.util.Scanner;
import CarrosController.carros_controller;
import CarrosModel.carros_model;

/**
 *
 * @author PC
 */
public class carros_view {
    
}
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
    }
    }
    
