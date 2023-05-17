/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Agenda.AgendaTelefonica;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Crear una clase llamada "AgendaTelefónica" que permita almacenar contactos con su nombre y número de teléfono. La clase
 * debe tener métodos para agregar un contacto nuevo, buscar un contacto por nombre, mostrar todos los contactos y mostrar
 * los contactos ordenados alfabéticamente por nombre. En el programa principal, crear un mapa (HashMap) de tipo "String"
 * (nombre del contacto) y "Integer" (número de teléfono). Luego, mostrar un menú que le dé al usuario la opción de agregar
 * un contacto, buscar un contacto por nombre, mostrar todos los contactos o mostrar los contactos ordenados alfabéticamente.
 *
 * @author pc
 */
public class AgendaServicio {

    public void buscaContacto(String nomBuscado) {

    }

    public void muestraContactos(String opcion, HashMap<String, Integer> laAgenda) {
        switch (opcion) {
            case "nom":
                TreeMap<String,Integer> ordenado = new TreeMap<>(laAgenda);
                for (Map.Entry<String,Integer> aux : ordenado.entrySet()) {
                    System.out.println(aux.toString());
                }
                break;
            case "num":
                TreeMap<String,Integer> ordenado2 = new TreeMap<>(laAgenda);
                for (int aux2 : ordenado2.values()) {
                    System.out.println(aux2);
                }
                break;
            default:
                System.out.println("Esta es la lista:");
            for (Map.Entry<String, Integer> aux : laAgenda.entrySet()) {
                System.out.println(aux.toString());
            }

        }
    }

    public AgendaTelefonica agregaContacto(HashMap<String, Integer> laAgenda) {

        AgendaTelefonica unContacto = new AgendaTelefonica();
        unContacto.creaAgTel();
        laAgenda.put(unContacto.getNomContacto(), unContacto.getNumContacto());

        return (unContacto);

    }

}
