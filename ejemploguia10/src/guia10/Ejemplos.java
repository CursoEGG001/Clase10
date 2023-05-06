/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeSet;

/**
 *
 * @author pc
 */
public class Ejemplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Integer> NumerosA = new ArrayList<>();
        NumerosA.add(Integer.SIZE);
        NumerosA.add(Integer.MAX_VALUE);

        LinkedList<Integer> NumerosB = new LinkedList<>();
        NumerosB.add(Integer.MIN_VALUE);
        NumerosB.add(Integer.BYTES);
        NumerosB.add(NumerosA.size());

        System.out.println("Muestrate! :");
        System.out.println(NumerosA);
        System.out.println(NumerosB);

        ArrayList<Integer> listado = new ArrayList();
        TreeSet<String> ConjuntoArbol = new TreeSet();
        HashMap<Integer, String> personas = new HashMap<>();
        System.out.println("Gracias!");

        //Listas
        ArrayList<Integer> numerosA = new ArrayList(); //Lista de Tipo Integer
        int x = 20;
        numerosA.add(x); //Agregamos el número 20 a la lista, en la posición 0

        //Conjuntos:
        HashSet<Integer> numerosB = new HashSet();
        Integer y = 28;
        numerosB.add(y);

        //Mapas:
        HashMap<Integer, String> alumnos = new HashMap();
        int dni = 34576189;
        String nombreAlumno = "Pepe";
        alumnos.put(dni, nombreAlumno);

        System.out.println(numerosA + " despues está " + numerosB + " y al final " + alumnos);

        numerosA.remove(0);

        System.out.println(numerosA + " despues está " + numerosB + " y al final " + alumnos);

        numerosB.add(30);

        System.out.println(numerosA + " despues está " + numerosB + " y al final " + alumnos);

        numerosB.remove(30);
        System.out.println(numerosA + " despues está " + numerosB + " y al final " + alumnos);

        HashSet<Integer> numeros = new HashSet();
        int num = 50;
        numeros.add(num);
        System.out.println("Tenemos en numeros: " + numeros);
        numeros.remove(50);
        System.out.println("No tenemos en numeros: " + numeros);

        HashMap<Integer, String> estudiante = new HashMap();
        estudiante.remove(123); //Borramos la llave 123

        for (Integer numero : numeros) {

            System.out.println(numero);

        }

        for (Integer integer : NumerosA) {
            System.out.println(integer);

        }

        for (Integer integer : NumerosB) {

            System.out.println(integer);

        }

        //Para Mapas
        alumnos.put(y, nombreAlumno);

        for (Map.Entry<Integer, String> entry : alumnos.entrySet()) {
            System.out.println("Doc=" + entry.getKey() + ", Nombre=" + entry.getValue());

        }

        //Sin Map.Entry:
        //Mostrar solo las llaves
        for (Integer Dni : alumnos.keySet()) {
            System.out.println("Documento: " + Dni);

        }

        //mostrar solo los valores
        for (String value : alumnos.values()) {
            System.out.println("Nombres: " + value);

        }

        HashMap<Integer, String> Personas = new HashMap<>();
        String n1 = "Albus";
        String n2 = "Severus";
        Personas.put(0,n1);
        Personas.put(10,n2);
        
        System.out.println(Personas);
    }

}
