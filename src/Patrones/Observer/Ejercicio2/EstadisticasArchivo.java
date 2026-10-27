package Patrones.Observer.Ejercicio2;

public class EstadisticasArchivo implements ObservadorPuntuacion {

    @Override
    public void actualizar(String nombreJugador, String motivo, int puntosObtenidos, int puntuacionTotal) {
        System.out.println("Estadísticas - " + nombreJugador + " " + motivo + ": +"
                + puntosObtenidos + " puntos");
    }
}
