/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clase10;

import Agenda.AgendaTelefonica;
import Servicio.AgendaServicio;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Crear una clase llamada "AgendaTelefónica" que permita almacenar contactos con su nombre y número de teléfono. La clase
 * debe tener métodos para agregar un contacto nuevo, buscar un contacto por nombre, mostrar todos los contactos y mostrar
 * los contactos ordenados alfabéticamente por nombre. En el programa principal, crear un mapa (HashMap) de tipo "String"
 * (nombre del contacto) y "Integer" (número de teléfono). Luego, mostrar un menú que le dé al usuario la opción de agregar
 * un contacto, buscar un contacto por nombre, mostrar todos los contactos o mostrar los contactos ordenados alfabéticamente.
 *
 * @author pc
 */
public class MExtras01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner opc = new Scanner(System.in).useDelimiter("\n");

        AgendaServicio as2 = new AgendaServicio();
        HashMap<String, Integer> hm1 = new HashMap();

        System.out.println("Escriba una opcion(o 5 para salir):");
        System.out.println("1. Agregar contacto");
        System.out.println("2. Buscar un Contacto");
        System.out.println("3. Mostrar los Contactos:");

        int vale = opc.nextInt();
        do {

            switch (vale) {
                case 1:
                    as2.agregaContacto(hm1);

                    break;
                case 2:
                    String laBusca = opc.next();
                    as2.buscaContacto(laBusca);

                    break;
                case 3:
                    System.out.println("Lista por nombres:");
                    as2.muestraContactos("nom", hm1);
                    System.out.println("Lista por numeros:");
                    as2.muestraContactos("num", hm1);
                    System.out.println("La lista asi nomas:");
                    as2.muestraContactos("", hm1);

                    break;
                default:
                    System.out.println("Saliendo");
            }
            vale = opc.nextInt();
        } while (vale != 5);

    }

}
