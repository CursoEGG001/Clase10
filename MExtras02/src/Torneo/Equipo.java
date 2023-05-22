/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Torneo;

/**
 *
 * @author pc
 */
public class Equipo {

    private String nombreEquipo;
    private String ciudad;
    private int partidosJugados;
    private int partidosGanados;
    private int partidosPerdidos;
    private int partidosEmpatados;
    private int puntosTotales;

    public Equipo(String nombreEquipo, String ciudad) {
        this.nombreEquipo = nombreEquipo;
        this.ciudad = ciudad;
    }

    // Getters y setters
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getPartidosGanados() {
        return partidosGanados;
    }

    public void setPartidosGanados(int partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    public int getPartidosPerdidos() {
        return partidosPerdidos;
    }

    public void setPartidosPerdidos(int partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }

    public int getPartidosEmpatados() {
        return partidosEmpatados;
    }

    public void setPartidosEmpatados(int partidosEmpatados) {
        this.partidosEmpatados = partidosEmpatados;
    }

    public int getPuntosTotales() {
        return puntosTotales;
    }

    public void setPuntosTotales(int puntosTotales) {
        this.puntosTotales = puntosTotales;
    }

    // Incrementar los partidos jugados, ganados, perdidos o empatados
    public void incrementarPartidoGanado() {
        partidosJugados++;
        partidosGanados++;
        puntosTotales += 3;
    }

    public void incrementarPartidoPerdido() {
        partidosJugados++;
        partidosPerdidos++;
    }

    public void incrementarPartidoEmpatado() {
        partidosJugados++;
        partidosEmpatados++;
        puntosTotales += 1;
    }

    // Reiniciar valores para el siguiente campeonato
    public void reiniciarValores() {
        partidosJugados = 0;
        partidosGanados = 0;
        partidosPerdidos = 0;
        partidosEmpatados = 0;
        puntosTotales = 0;
    }

    @Override
    public String toString() {
        return "Equipo: " + nombreEquipo
                + ", Ciudad: " + ciudad
                + ", Puntos: " + puntosTotales
                + ", Partidos Jugados: " + partidosJugados
                + ", Ganados: " + partidosGanados
                + ", Perdidos: " + partidosPerdidos
                + ", Empatados: " + partidosEmpatados;
    }
}
