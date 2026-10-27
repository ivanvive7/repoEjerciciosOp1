package com.app.Patrones.Observer.Ejercicio2;

public class Marcador implements ObservadorPuntuacion {

    @Override
    public void actualizar(String nombreJugador, String motivo, int puntosObtenidos, int puntuacionTotal) {
        System.out.println("Marcador - " + nombreJugador + ", total: " + puntuacionTotal);
    }
}
