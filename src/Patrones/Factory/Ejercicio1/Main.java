package Patrones.Factory.Ejercicio1;

public class Main {

    public static void main(String[] args) {
        Notificacion notificacion = NotificacionFactory.crear("email");

        notificacion.enviar();
    }
}
