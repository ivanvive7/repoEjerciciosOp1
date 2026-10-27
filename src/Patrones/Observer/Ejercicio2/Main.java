package Patrones.Observer.Ejercicio2;

public class Main {

    public static void main(String[] args) {
        Marcador marcador = new Marcador();
        EstadisticasArchivo estadisticas = new EstadisticasArchivo();

        Jugador alicia = new Jugador("Alicia");
        alicia.personaje(estadisticas);
        alicia.personaje(marcador);

        Jugador bruno = new Jugador("Bruno");
        bruno.personaje(estadisticas);
        bruno.personaje(marcador);
        
        alicia.completarMision(100);
        bruno.derrotarEnemigo(50);
        alicia.recogerObjeto(25);
        bruno.completarMision(120);
        alicia.derrotarEnemigo(75);

    }
}
