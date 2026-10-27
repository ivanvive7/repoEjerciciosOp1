package Patrones.Factory.Ejercicio2;

public class PayPal implements Pago {
    @Override
    public void realizarPago() {
        System.out.println("Pagando con PayPal");
    }
}