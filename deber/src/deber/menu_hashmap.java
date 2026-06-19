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
