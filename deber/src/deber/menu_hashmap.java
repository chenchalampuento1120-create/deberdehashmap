/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deber;

/**
 *
 * @author PC
 */
import java.util.Scanner;
import java.util.HashMap;

public class menu_hashmap {

    static HashMap<String, String> peliculas = new HashMap<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {

            System.out.println("==== MENU DE PELICULAS ====");
            System.out.println("1. Agregar pelicula");
            System.out.println("2. Listar peliculas");
            System.out.println("3. Actualizar pelicula");
            System.out.println("4. Eliminar pelicula");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opcion: ");

            while (!sc.hasNextInt()) {
                System.out.println("Error ingrese solo numeros");
                sc.next();
            }

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    insertar_pelicula();
                    break;

                case 2:
                    listar_peliculas();
                    break;

                case 3:
                    actualizar_pelicula();
                    break;

                case 4:
                    eliminar_pelicula();
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }

        } while (opcion != 5);

    }

    public static void insertar_pelicula() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el codigo de la pelicula: ");
        String codigo = sc.nextLine();

        System.out.print("Ingrese el nombre de la pelicula: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese el genero: ");
