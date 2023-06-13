package org.futbol.model;


import java.util.List;
import java.util.LinkedList;
public class Inscripcion {

    //relaciones
    private EquipoInscrito equipoInscrito;
    private List <JugadorInscrito> jugadorInscritoList;

    //Constructor
    public Inscripcion(EquipoInscrito equipoInscrito) {
            this.equipoInscrito = equipoInscrito;
            this.jugadorInscritoList = new LinkedList<>();
    }
    //Metodos
    public boolean InscribirJugador(Jugador jugador){
            jugadorInscritoList.add(new JugadorInscrito(this, jugador));
            return true;
    }

    public boolean validarJugador(Jugador jugador){
        for (JugadorInscrito jugadorInscrito : jugadorInscritoList) {
            if (jugadorInscrito.getJugador().equals(jugador)){
                return true;
            }
        }
        return false;
    }


    //Getters y Setters

    public EquipoInscrito getEquipoInscrito() {
        return equipoInscrito;
    }

    public void setEquipoInscrito(EquipoInscrito equipoInscrito) {
        this.equipoInscrito = equipoInscrito;
    }

    public List<JugadorInscrito> getJugadorInscritoList() {
        return jugadorInscritoList;
    }

    public void setJugadorInscritoList(List<JugadorInscrito> jugadorInscritoList) {
        this.jugadorInscritoList = jugadorInscritoList;
    }
}
