package org.futbol.model;

import java.util.List;

public class Competencia {
    //Atributos
    private String nombre;

    //Relaciones
    private List <Temporada> temporadaList;

    //Constructor
    public Competencia(String nombre) {
        this.nombre = nombre;
    }
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Temporada> getTemporadaList() {
        return temporadaList;
    }

    public void setTemporadaList(List<Temporada> temporadaList) {
        this.temporadaList = temporadaList;
    }

    //ToString
    @Override
    public String toString() {
        return "Competencia{" + "nombre=" + nombre + '}';
    }
}
