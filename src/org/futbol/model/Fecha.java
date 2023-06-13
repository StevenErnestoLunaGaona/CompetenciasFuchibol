package org.futbol.model;

import java.util.List;
import java.util.LinkedList;

public class Fecha {
    //Atributos
    private int numero;

    //Relaciones
    private Asignacion asignacion;
    private List<Partido> partidoList;

    //Constructor
    public Fecha(int numero, Asignacion asignacion) {
        this.numero = numero;
        this.asignacion = asignacion;
        this.partidoList = new LinkedList<>();
    }
    //Getters y Setters

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Asignacion getAsignacion() {
        return asignacion;
    }

    public void setAsignacion(Asignacion asignacion) {
        this.asignacion = asignacion;
    }

    public List<Partido> getPartidoList() {
        return partidoList;
    }

    public void setPartidoList(List<Partido> partidoList) {
        this.partidoList = partidoList;
    }
    //ToString
    @Override
    public String toString() {
        return "Fecha{" + "numero=" + numero + '}';
    }

}
