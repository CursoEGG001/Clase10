/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase10;

import Establecimiento.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Alumno> alumnos = new ArrayList<>();

        boolean seguirAgregando = true;

        while (seguirAgregando) {

            System.out.println("Ingrese el nombre del alumno:");
            String nombre = scanner.nextLine();

            List<Integer> notas = new ArrayList<>();
            for (int i = 1; i <= 3; i++) {

                System.out.println("Ingrese la nota " + i + " del alumno:");
                int nota = Integer.parseInt(scanner.nextLine());
                notas.add(nota);

            }

            Alumno alumnoA = new Alumno(nombre, notas);
            alumnos.add(alumnoA);
            System.out.println(alumnoA);

            System.out.println("¿Desea agregar otro alumno? (s/n)");
            String respuesta = scanner.nextLine();
            seguirAgregando = respuesta.equalsIgnoreCase("s");
        }

        System.out.println("Ingrese el nombre del alumno que desea calcular su nota final:");
        String nombreBuscado = scanner.nextLine();

        boolean encontrado = false;
        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombreBuscado)) {
                System.out.println("La nota final de " + alumno.getNombre() + " es: " + alumno.notaFinal());
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró al alumno con nombre " + nombreBuscado);
        }
    }
}
