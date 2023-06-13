package org.futbol.model;

public class JugadorInscrito {

    //Relaciones
    private Inscripcion inscripcion;
    private Jugador jugador;

    //Constructor
    public JugadorInscrito(Inscripcion inscripcion, Jugador jugador) {
        this.inscripcion = inscripcion;
        this.jugador = jugador;
    }
    //Getters y Setters

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }


    //ToString
    @Override
    public String toString() {
        return "JugadorInscrito{" +
                "inscripcion=" + inscripcion +
                ", jugador=" + jugador +
                '}';
    }



}
