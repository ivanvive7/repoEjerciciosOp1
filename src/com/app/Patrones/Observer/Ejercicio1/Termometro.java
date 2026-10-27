package com.app.Patrones.Observer.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Termometro {

    private final List<Observador> observadores = new ArrayList<>();
    private double temperatura;

    public void suscribir(Observador observador) {
        observadores.add(observador);
    }

    public void cambiarTemperatura(double nuevaTemperatura) {
        if (Double.compare(temperatura, nuevaTemperatura) == 0) {
            return;
        }

        temperatura = nuevaTemperatura;
        for (Observador observador : observadores) {
            observador.actualizar(temperatura);
        }
    }
}
