/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agenda;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author pc
 */
public class AgendaTelefonica {
    private Map<String, Integer> contactos;

    public AgendaTelefonica() {
        contactos = new HashMap<>();
    }

    public void agregarContacto(String nombre, int numeroTelefono) {
        contactos.put(nombre, numeroTelefono);
    }

    public void buscarContacto(String nombre) {
        Integer numeroTelefono = contactos.get(nombre);
        if (numeroTelefono != null) {
            System.out.println("Nombre: " + nombre + ", Teléfono: " + numeroTelefono);
        } else {
            System.out.println("No se encontró el contacto con el nombre '" + nombre + "'.");
        }
    }

    public void mostrarContactos() {
        System.out.println("Lista de contactos:");
        for (Map.Entry<String, Integer> entry : contactos.entrySet()) {
            String nombre = entry.getKey();
            Integer numeroTelefono = entry.getValue();
            System.out.println("Nombre: " + nombre + ", Teléfono: " + numeroTelefono);
        }
    }

    public void mostrarContactosOrdenados() {
        System.out.println("Lista de contactos ordenados alfabéticamente:");
        Map<String, Integer> contactosOrdenados = new TreeMap<>(contactos);
        for (Map.Entry<String, Integer> entry : contactosOrdenados.entrySet()) {
            String nombre = entry.getKey();
            Integer numeroTelefono = entry.getValue();
            System.out.println("Nombre: " + nombre + ", Teléfono: " + numeroTelefono);
        }
    }
}