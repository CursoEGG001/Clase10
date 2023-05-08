/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase10;

import Entidad.Peliculas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
        
    Scanner sc = new Scanner(System.in);
        List<Peliculas> peliculas = new ArrayList<>();

        boolean crearOtraPelicula = true;
        while (crearOtraPelicula) {
            System.out.print("Ingrese el título de la película: ");
            String titulo = sc.nextLine();

            System.out.print("Ingrese el director de la película: ");
            String director = sc.nextLine();

            System.out.print("Ingrese la duración de la película en horas: ");
            double duracion = Double.parseDouble(sc.nextLine());

            Peliculas pelicula = new Peliculas(titulo, director, duracion);
            peliculas.add(pelicula);

            System.out.print("¿Desea crear otra película? (s/n): ");
            String opcion = sc.nextLine();
            crearOtraPelicula = opcion.equalsIgnoreCase("s");
        }

        System.out.println("\nTodas las películas:");
        for (Peliculas pelicula : peliculas) {
            System.out.println(pelicula);
        }

        System.out.println("\nPelículas con duración mayor a 1 hora:");
        for (Peliculas pelicula : peliculas) {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula);
            }
        }

        System.out.println("\nPelículas ordenadas por duración (de mayor a menor):");
        Collections.sort(peliculas, Comparator.comparingDouble(Peliculas::getDuracion).reversed());
        for (Peliculas pelicula : peliculas) {
            System.out.println(pelicula);
        }

        System.out.println("\nPelículas ordenadas por duración (de menor a mayor):");
        Collections.sort(peliculas, Comparator.comparingDouble(Peliculas::getDuracion));
        for (Peliculas pelicula : peliculas) {
            System.out.println(pelicula);
        }

        System.out.println("\nPelículas ordenadas por título:");
        Collections.sort(peliculas, Comparator.comparing(Peliculas::getTitulo));
        for (Peliculas pelicula : peliculas) {
            System.out.println(pelicula);
        }

        System.out.println("\nPelículas ordenadas por director:");
        Collections.sort(peliculas, Comparator.comparing(Peliculas::getDirector));
        for (Peliculas pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }
}