package Patrones.Factory.Ejercicio2;

public class Main {

    public static void main(String[] args) {
        Pago pago = PagoFactory.crear("tarjeta");

        pago.realizarPago();
    }
}
