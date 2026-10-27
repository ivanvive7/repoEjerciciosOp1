package com.app.Patrones.Observer.Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Jugador {

    private final String nombre;
    private final List<ObservadorPuntuacion> observadores = new ArrayList<>();
    private int puntuacion;

    public Jugador(String nombre) {
        this.nombre = Objects.requireNonNull(nombre, "El nombre del jugador no puede ser null");
    }

    public void personaje(ObservadorPuntuacion observador) {
        observadores.add(Objects.requireNonNull(observador, "El observador no puede ser null"));
    }

    public void completarMision(int puntos) {
        sumarPuntos(puntos, "ha completado una misión");
    }

    public void derrotarEnemigo(int puntos) {
        sumarPuntos(puntos, "ha derrotado a un enemigo");
    }

    public void recogerObjeto(int puntos) {
        sumarPuntos(puntos, "ha recogido un objeto");
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void sumarPuntos(int puntos) {
        sumarPuntos(puntos, "ha conseguido puntos");
    }

    private void sumarPuntos(int puntos, String motivo) {
        if (puntos <= 0) {
            throw new IllegalArgumentException("Los puntos que se suman deben ser positivos");
        }

        puntuacion += puntos;
        for (ObservadorPuntuacion observador : observadores) {
            observador.actualizar(nombre, motivo, puntos, puntuacion);
        }
    }
}
