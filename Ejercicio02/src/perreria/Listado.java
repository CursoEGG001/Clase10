/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perreria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Listado {

    Scanner sc = new Scanner(System.in);
    private ArrayList<String> razasPerros;

    public ArrayList<String> getRazasPerros() {
        return razasPerros;
    }

    public void setRazasPerros(ArrayList<String> razasPerros) {
        this.razasPerros = razasPerros;
    }

    public Listado() {
    }

    public void Listado(ArrayList<String> razasPerros) {

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
        this.borraPerro(razasPerros);
    }

    public void borraPerro(ArrayList<String> laLista) {

        System.out.print("\nIngrese una raza de perro a buscar y eliminar: ");
        String razaEliminar = sc.nextLine();
        Iterator<String> iterador = laLista.iterator();
        boolean encontrado = false;
        while (iterador.hasNext()) {
            String raza = iterador.next();
            if (raza.equalsIgnoreCase(razaEliminar)) {
                iterador.remove();
                encontrado = true;
            }
        }
        
        Collections.sort(laLista);
        
        System.out.println("\nRazas restantes de la lista:");
        for (String raza : laLista) {
            System.out.println(raza);
            
        }
        
        if (encontrado) {
            System.out.println("Estaba " + razaEliminar + " en la lista y se funó");
        } else {
            System.out.println(razaEliminar +" no estaba ahí.");
        }
        sc.close();
    }

}
