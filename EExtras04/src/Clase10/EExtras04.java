/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clase10;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class EExtras04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<Integer, String> códigosPostales = new HashMap<>();

        // Añade 10 códigos postales de la página web
        códigosPostales.put(48000, "Barcelona");
        códigosPostales.put(41001, "Tarragona");
        códigosPostales.put(8001, "Girona");
        códigosPostales.put(17001, "Lleida");
        códigosPostales.put(12001, "València");
        códigosPostales.put(03001, "Alacant");
        códigosPostales.put(07001, "Palma de Mallorca");
        códigosPostales.put(35001, "Las Palmas de Gran Canaria");
        códigosPostales.put(38001, "Santa Cruz de Tenerife");

        // Pide al usuario que introduzca 10 códigos postales y sus ciudades
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduzca un código postal y su ciudad: ");
            String códigoPostal = scanner.next();
            String ciudad = scanner.next();
            códigosPostales.put(Integer.parseInt(códigoPostal), ciudad);
        }

        // Muestra los datos introducidos en la pantalla
        System.out.println("Los datos introducidos son: ");
        for (Integer códigoPostal : códigosPostales.keySet()) {
            System.out.println(códigoPostal + " - " + códigosPostales.get(códigoPostal));
        }

        // Pide un código postal y muestra la ciudad asociada si existe, pero notifica al usuario
        System.out.println("Introduzca un código postal para buscar: ");
        int códigoPostalBuscado = scanner.nextInt();
        if (códigosPostales.containsKey(códigoPostalBuscado)) {
            System.out.println("La ciudad asociada con el código postal " + códigoPostalBuscado + " es " + códigosPostales.get(códigoPostalBuscado));
        } else {
            System.out.println("El código postal " + códigoPostalBuscado + " no existe.");
        }

        // Muestra los datos en la pantalla
        System.out.println("Los datos son: ");
        for (Integer códigoPostal : códigosPostales.keySet()) {
            System.out.println(códigoPostal + " - " + códigosPostales.get(códigoPostal));
        }

        // Añade una ciudad con su código postal correspondiente al HashMap
        System.out.println("Introduzca un nuevo código postal y su ciudad para añadir al HashMap: ");
        int nuevoCódigoPostal = scanner.nextInt();
        String nuevaCiudad = scanner.next();
        códigosPostales.put(nuevoCódigoPostal, nuevaCiudad);

        // Muestra los datos en la pantalla
        System.out.println("Los datos son: ");
        for (Integer códigoPostal : códigosPostales.keySet()) {
            System.out.println(códigoPostal + " - " + códigosPostales.get(códigoPostal));
        }

        // Elimina 3 ciudades existentes dentro del HashMap
        System.out.println("Introduzca 3 códigos postales para eliminar del HashMap: ");
        int códigoPostalEliminar1 = scanner.nextInt();
        int códigoPostalEliminar2 = scanner.nextInt();
        int códigoPostalEliminar3 = scanner.nextInt();
        códigosPostales.remove(códigoPostalEliminar1);
        códigosPostales.remove(códigoPostalEliminar2);
        códigosPostales.remove(códigoPostalEliminar3);

        // Muestra los datos en la pantalla
        System.out.println("Los datos son: ");
        for (Integer códigoPostal : códigosPostales.keySet()) {
            System.out.println(códigoPostal + " - " + códigosPostales.get(códigoPostal));
        }
    }
}
