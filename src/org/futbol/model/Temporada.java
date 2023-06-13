package org.futbol.model;

import java.util.LinkedList;
import java.util.List;

public class Temporada {

    //Atributos
    private String nombre;

    //relaciones
    private List<Asignacion> asignacionList;
    private Competencia competencia;

    private List <EquipoInscrito> equipoInscritoList;

    //Constructor
    public Temporada(Competencia competencia, String nombre) {
        this.competencia = competencia;
        this.nombre = nombre;
        this.asignacionList = new LinkedList<>();
        this.equipoInscritoList = new LinkedList<>();
    }

    //Metodos
    public boolean validarJugador(Jugador jugador){
        for (EquipoInscrito equipoInscrito : equipoInscritoList) {
            if (equipoInscrito.validarJugador(jugador)){
                return true;
            }
        }
        return false;
    }
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<EquipoInscrito> getEquipoInscritoList() {
        return equipoInscritoList;
    }

    public void setEquipoInscritoList(List<EquipoInscrito> equipoInscritoList) {
        this.equipoInscritoList = equipoInscritoList;
    }

    public String getCompetencia() {
        return competencia.getNombre();
    }
    public void setCompetencia(Competencia competencia) {
        this.competencia = competencia;
    }

    public List<Asignacion> getAsignacionList() {
        return asignacionList;
    }
    public void setAsignacionList(List<Asignacion> asignacionList) {
        this.asignacionList = asignacionList;
    }


    //ToString
    @Override
    public String toString() {
        if (asignacionList.isEmpty()){
            return "Temporada{" + "nombre=" + nombre + ", competencia=" + competencia + '}';
        } else {
            return "Temporada{" + "nombre=" + nombre + ", competencia=" + competencia + ", asignacionList=" + asignacionList + '}';
        }
    }
}
