package org.futbol.model;

import java.util.List;

public class EquipoInscrito {

    //relaciones

    private Temporada temporada;
    private Inscripcion inscripcion;
    private List <Partido> partidoLocalList;
    private List <Partido> partidoVisitanteList;
    private Equipo equipo;

    //Constructor
    public EquipoInscrito(Temporada temporada, Equipo equipo) {
        this.temporada = temporada;
        this.equipo = equipo;
        this.inscripcion = new Inscripcion(this);
    }

    //Getters y Setters
    public Temporada getTemporada() {
        return temporada;
    }
    public void setTemporada(Temporada temporada) {
        this.temporada = temporada;
    }

    public Equipo getEquipo() {
        return equipo;
    }


    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
    //Metodos
    public boolean InscribirJugador(Jugador jugador){
        if (temporada.validarJugador(jugador) == false){
            inscripcion.InscribirJugador(jugador);
            return true;
        }
        System.out.println("El jugador %s ya esta inscrito en otro equipo");
        return false;
    }
    public boolean validarJugador(Jugador jugador){
        return inscripcion.validarJugador(jugador);
    }


    //ToString
    @Override
    public String toString() {
        return equipo.toString();
    }

}
