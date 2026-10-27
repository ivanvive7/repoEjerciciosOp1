package Patrones.Factory.Ejercicio2;

public class PagoFactory {
    public static Pago crear(String tipo) {
        if (tipo.equalsIgnoreCase("tarjeta")) {
            return new Tarjeta();
        } else if (tipo.equalsIgnoreCase("paypal")) {
            return new PayPal();
        }

        return null;
    }
}