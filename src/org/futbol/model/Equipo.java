package org.futbol.model;

import java.util.List;
import java.util.LinkedList;

public class Equipo {
    //Atributos
    private String nombre;

    //relaciones
    private List<EquipoInscrito> equipoInscritoList;
    //Constructor
    public Equipo(String nombre) {
        this.nombre = nombre;
        equipoInscritoList = new LinkedList<>();
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

    public void setEquipoInscritoList(List<EquipoInscrito> equipoInscrito) {
        this.equipoInscritoList = equipoInscritoList;
    }

    //ToString
    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + '}';
    }
}
