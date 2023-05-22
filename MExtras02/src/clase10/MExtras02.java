/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase10;

import Torneo.Equipo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * En este ejercicio vamos a mostrar la tabla de posiciones final de un torneo del deporte que deseen. Para ello deberán
 * crear una clase llamada "EquipoDe…" que represente a un equipo del deporte seleccionado. La clase debe tener los
 * siguientes atributos: nombre del equipo, ciudad, cantidad de partidos jugados, ganados, perdidos y empatados, y puntos
 * totales. En el programa principal, crear una lista de tipo "EquipoDe…" y agregar 10 objetos de tipo equipo a la lista.
 * Luego, mostrar por pantalla de forma ordenada según cantidad de puntos los nombres de cada equipo, su cantidad de puntos,
 * partidos jugados, ganados, perdidos y empatados. Una vez finalizado el torneo, determinar el equipo ganador, eliminar al
 * último equipo de la tabla por haber descendido, sumar al nuevo equipo que ascendió de la división inferior, reiniciar los
 * valores de partidos y puntos a 0 para el inicio del siguiente campeonato y mostrar la lista en orden alfabético de los
 * equipos.
 *
 * @author pc
 */
public class MExtras02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear lista de equipos
        List<Equipo> equipos = new ArrayList<>();

        // Agregar equipos a la lista
        equipos.add(new Equipo("Equipo A", "Ciudad 01"));
        equipos.add(new Equipo("Equipo B", "Ciudad 02"));
        equipos.add(new Equipo("Equipo C", "Ciudad 03"));
        equipos.add(new Equipo("Equipo D", "Ciudad 04"));
        equipos.add(new Equipo("Equipo E", "Ciudad 05"));
        equipos.add(new Equipo("Equipo F", "Ciudad 06"));
        equipos.add(new Equipo("Equipo G", "Ciudad 07"));
        equipos.add(new Equipo("Equipo H", "Ciudad 08"));
        equipos.add(new Equipo("Equipo I", "Ciudad 09"));
        equipos.add(new Equipo("Equipo J", "Ciudad 10"));

        // Mostrar tabla de posiciones inicial
        System.out.println("Tabla de Posiciones Inicial:");
        mostrarTablaPosiciones(equipos);

        // Simular resultados del torneo
        equipos.get(0).incrementarPartidoGanado();
        equipos.get(1).incrementarPartidoGanado();
        equipos.get(2).incrementarPartidoPerdido();
        equipos.get(3).incrementarPartidoEmpatado();
        equipos.get(4).incrementarPartidoPerdido();
        equipos.get(5).incrementarPartidoEmpatado();
        equipos.get(6).incrementarPartidoGanado();
        equipos.get(7).incrementarPartidoPerdido();
        equipos.get(8).incrementarPartidoGanado();
        equipos.get(9).incrementarPartidoGanado();

        // Mostrar tabla de posiciones final
        System.out.println("\nTabla de Posiciones Final:");
        mostrarTablaPosiciones(equipos);

        // Determinar equipo ganador (con más puntos)
        Equipo equipoGanador = obtenerEquipoGanador(equipos);
        System.out.println("\nEquipo Ganador: " + equipoGanador.getNombreEquipo());

        // Eliminar último equipo por descenso
        System.out.println("\nEquipo Eliminado del final de la lista:");
        equipos.remove(equipos.size() - 1);
        mostrarTablaPosiciones(equipos);

        // Sumar nuevo equipo ascendido
        System.out.println("\nEquipo Ascendido: ");
        equipos.add(new Equipo("Equipo K", "Ciudad 09"));
        mostrarTablaPosiciones(equipos);

        // Reiniciar valores para el siguiente campeonato
        System.out.println("Se borró la lista de posiciones");
        reiniciarValoresEquipos(equipos);

        // Mostrar tabla de posiciones ordenada alfabéticamente
        System.out.println("\nTabla de Posiciones Ordenada Alfabéticamente:");
        ordenarEquiposAlfabeticamente(equipos);
        mostrarTablaPosiciones(equipos);
    }

    private static void mostrarTablaPosiciones(List<Equipo> equipos) {
        for (Equipo equipo : equipos) {
            System.out.println(equipo);
        }
    }

    private static Equipo obtenerEquipoGanador(List<Equipo> equipos) {
        return Collections.max(equipos, Comparator.comparingInt(Equipo::getPuntosTotales));
    }

    private static void reiniciarValoresEquipos(List<Equipo> equipos) {
        for (Equipo equipo : equipos) {
            equipo.reiniciarValores();
        }
    }

    private static void ordenarEquiposAlfabeticamente(List<Equipo> equipos) {
        equipos.sort(Comparator.comparing(Equipo::getNombreEquipo));
    }
}
