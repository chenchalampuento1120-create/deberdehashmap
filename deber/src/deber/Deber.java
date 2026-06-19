/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deber;

/**
 *
 * @author PC
 */
import CarrosView.carros_view;
import ComprasView.ComprasView;
import deber.menu_hashmap;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Deber{

    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);

        ComprasView compras = new ComprasView();
        carros_view carros = new carros_view();
        menu_hashmap hashmap = new menu_hashmap();

        int opcion;

        do {
            System.out.println("===== MENU PRINCIPAL =====");
            System.out.println("1. CRUD Compras");
            System.out.println("2. CRUD Carros");
            System.out.println("3. Menu Hashmap");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    compras.menu();
                    break;

                case 2:
                    carros.menu();
                    break;

                case 3:
                    menu_hashmap.main(null);
                    break;
                    
                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion incorrecta");
            }

        } while (opcion != 4);
    }
}