/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase10;

import Entidades.Persona;
import Servicios.NombresServicio;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author pc
 */
public class MExtras03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan Pérez"));
        personas.add(new Persona("María López"));
        personas.add(new Persona("Antonio Cachi"));
        personas.add(new Persona("Zetulio Vargas"));

        HashSet<String> nombres = NombresServicio.getNombres(personas);
        System.out.println(nombres); // Imprime [Juan Pérez, María López]

        TreeSet<String> nombresOrdenados = NombresServicio.getNombresOrdenados(nombres);
        System.out.println(nombresOrdenados); // Imprime [María López, Juan Pérez]

    }

}
