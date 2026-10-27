package com.app.Patrones.Observer.Ejercicio1;

public class Pantalla implements Observador {

    @Override
    public void actualizar(double temperatura) {
        System.out.println("Temperatura actual: " + temperatura + " ºC");
    }
}
