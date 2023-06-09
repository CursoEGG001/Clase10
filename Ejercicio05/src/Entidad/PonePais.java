/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;
import java.util.TreeSet;

public class PonePais {

    public static void Cargar() {
        Scanner sc = new Scanner(System.in);
        TreeSet<String> paises = new TreeSet<>();

        // Bucle para pedir países al usuario
        boolean seguir = true;
        while (seguir) {
            System.out.print("Ingrese un país: ");
            String pais = sc.nextLine();

            // Verificar si el país ya está en el conjunto
            if (paises.contains(pais)) {
                System.out.println("El país ya se encuentra en el conjunto.");
            } else {
                paises.add(pais);
            }

            // Preguntar si desea agregar otro país o salir
            System.out.print("¿Desea agregar otro país? (s/n): ");
            String opcion = sc.nextLine();
            if (opcion.equalsIgnoreCase("n")) {
                seguir = false;
            }
        }

        // Mostrar todos los países
        System.out.println("Países guardados en el conjunto: ");
        for (String pais : paises) {
            System.out.println("- " + pais);
        }

        // Ordenar el conjunto alfabéticamente y mostrarlo
        System.out.println("Países ordenados alfabéticamente: ");
        for (String pais : paises) {
            System.out.println("- " + pais);
        }

        // Pedir al usuario un país para eliminarlo del conjunto
        System.out.print("Ingrese un país para eliminar del conjunto: ");
        String paisAEliminar = sc.nextLine();

        // Buscar el país en el conjunto y eliminarlo si se encuentra
        boolean encontrado = false;
        for (String pais : paises) {
            if (pais.equalsIgnoreCase(paisAEliminar)) {
                paises.remove(pais);
                encontrado = true;
                break;
            }
        }

        // Mostrar el conjunto actualizado si se eliminó el país
        if (encontrado) {
            System.out.println("Países en el conjunto después de eliminar " + paisAEliminar + ":");
            for (String pais : paises) {
                System.out.println("- " + pais);
            }
        } else {
            System.out.println("El país ingresado no se encuentra en el conjunto.");
        }

        sc.close();
    }
}

