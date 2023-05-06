/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

/**
 *
 * @author pc
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ListaRazaPerros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> razasPerros = new ArrayList<>();

        boolean continuar = true;
        while (continuar) {
            System.out.print("Ingrese una raza de perro: ");
            String raza = sc.nextLine();
            razasPerros.add(raza);

            System.out.print("¿Desea ingresar otra raza de perro? (S/N): ");
            String opcion = sc.nextLine();
            if (opcion.equalsIgnoreCase("N")) {
                continuar = false;
            }
        }

        System.out.println("Razas de perros guardadas:");
        for (String raza : razasPerros) {
            System.out.println(raza);
        }
    }
}
