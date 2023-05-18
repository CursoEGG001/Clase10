/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Agenda.AgendaTelefonica;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

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

    public void buscaContacto(String nomBuscado, HashMap<String, Integer> dondeBuscar) {
        Iterator<Entry<String, Integer>> paraNombre = dondeBuscar.entrySet().iterator();
        while (paraNombre.hasNext()) {
            Entry<String, Integer> esteDato = paraNombre.next();
            if (esteDato.getKey().equals(nomBuscado)) {
                System.out.println(esteDato.getKey() + " tiene el número " + esteDato.getValue());
            }
        }
        System.out.println("");
    }

    public void muestraContactos(String opcion, HashMap<String, Integer> laAgenda) {
        switch (opcion) {
            case "nom":
                LinkedHashMap<String, Integer> agendaOrdenada = new LinkedHashMap<>();
                laAgenda.forEach((nombre, numero) -> agendaOrdenada.put(nombre, numero));
                ArrayList<String> ordenPorNom = new ArrayList<>();
                laAgenda.forEach((nombre, numero) -> ordenPorNom.add(nombre));
                Collections.sort(ordenPorNom, (String str1, String str2) -> (str1).compareTo(str2));
                ordenPorNom.forEach((nombre1) -> {
                    if (laAgenda.containsKey(nombre1)) {
                        System.out.println(nombre1 + " tiene el numero " + laAgenda.get(nombre1));
                    }
                });
                System.out.println("hecho");
                break;
            case "num":
                LinkedHashMap<String, Integer> agendaOrdenadaNum = new LinkedHashMap<>();
                for (Entry<String, Integer> unDato : laAgenda.entrySet()) {
                    agendaOrdenadaNum.put(unDato.getKey(), unDato.getValue());
                }
                ArrayList<Integer> ordenPorNum = new ArrayList<>();
                for (Entry<String, Integer> porElNum : laAgenda.entrySet()) {
                    ordenPorNum.add(porElNum.getValue());
                }
                System.out.println(agendaOrdenadaNum);
                Collections.sort(ordenPorNum, (Integer num1, Integer num2) -> (num1).compareTo(num2));
                for (Integer esteNumero : ordenPorNum) {
                    for (Entry<String, Integer> esteDeAqui : laAgenda.entrySet()) {
                        if (!esteDeAqui.getValue().equals(esteNumero)) {
                            //System.out.println("No tiene número...");
                        } else {
                            System.out.println(esteDeAqui);
                            agendaOrdenadaNum.put(esteDeAqui.getKey(), esteDeAqui.getValue());
                        }
                    }
                }
                System.out.println(agendaOrdenadaNum.toString());
                break;
            default:
                System.out.println("Esta es la lista:");
                for (Map.Entry<String, Integer> aux : laAgenda.entrySet()) {
                    System.out.println(aux.getKey() + "," + aux.getValue());
                }

        }
    }

    public AgendaTelefonica agregaContacto(HashMap<String, Integer> laAgenda) {
        AgendaTelefonica unContacto = new AgendaTelefonica();
        AgendaTelefonica dato = unContacto.creaAgTel();
        laAgenda.put(dato.getNomContacto(), dato.getNumContacto());

        return (dato);

    }

}
