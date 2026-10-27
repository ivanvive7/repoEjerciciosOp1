package Patrones.Observer.Ejercicio1;

public class Main {

    public static void main(String[] args) {
        Termometro termometro = new Termometro();
        termometro.suscribir(new Pantalla());
        termometro.suscribir(new Alarma());

        termometro.cambiarTemperatura(25);
        termometro.cambiarTemperatura(32);
    }

}
