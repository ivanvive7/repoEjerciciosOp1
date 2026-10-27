package com.app.Patrones.Observer.Ejercicio1;

public class Alarma implements Observador {

    @Override
    public void actualizar(double temperatura) {
        if (temperatura > 30) {
            System.out.println("Alarma: temperatura alta (" + temperatura + " ºC)");
        }
    }

}
