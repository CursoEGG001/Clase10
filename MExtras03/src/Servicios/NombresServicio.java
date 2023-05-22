/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Persona;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author pc
 */
public class NombresServicio {

    public static HashSet<String> getNombres(ArrayList<Persona> personas) {
        HashSet<String> nombres = new HashSet<>();
        for (Persona persona : personas) {
            nombres.add(persona.getNombre());
        }
        return nombres;
    }

    public static TreeSet<String> getNombresOrdenados(HashSet<String> nombres) {
        TreeSet<String> nombresOrdenados = new TreeSet<>();
        nombresOrdenados.addAll(nombres);
        return nombresOrdenados;
    }
}