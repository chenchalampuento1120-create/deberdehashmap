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
        String genero = sc.nextLine();

        System.out.print("Ingrese el año: ");
        String anio = sc.nextLine();

        peliculas.put(codigo, nombre + " " + genero + " " + anio);

        System.out.println("Pelicula registrada con exito");
    }

    public static void listar_peliculas() {

        if (peliculas.isEmpty()) {
            System.out.println("No existen peliculas registradas");
            return;
        }

        for (String codigo : peliculas.keySet()) {

            String[] datos = peliculas.get(codigo).split(" ");

            System.out.println("======================");
            System.out.println("Codigo: " + codigo);
            System.out.println("Nombre: " + datos[0]);
            System.out.println("Genero: " + datos[1]);
            System.out.println("Año: " + datos[2]);
            System.out.println("======================");
        }
    }

    public static void actualizar_pelicula() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el codigo de la pelicula: ");
        String codigo = sc.nextLine();

        if (peliculas.containsKey(codigo)) {
