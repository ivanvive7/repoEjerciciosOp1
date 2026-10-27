package Patrones.Factory.Ejercicio1;

public class NotificacionFactory {
    public static Notificacion crear(String tipo) {
        if (tipo.equalsIgnoreCase("email")) {
            return new Email();
        } else if (tipo.equalsIgnoreCase("sms")) {
            return new Sms();
        }

        return null;
    }
}