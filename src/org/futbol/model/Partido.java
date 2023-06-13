package org.futbol.model;

import  java.util.Date;
import java.util.List;

public class Partido {
    //Enumeradores
    private Estado estado;

    //Atributos
    private Date fechaHora;
    private List<Fecha>  fechaList;
    private List<EquipoInscrito> equipoInscritoList;


    //Relaciones
    private EquipoInscrito equipoInscritoLocal;
    private EquipoInscrito equipoInscritoVisitante;
    private Fecha fecha;
    private Marcador marcador;

    //COMPOSICIÓN
    private class Marcador {

    }

    //constructor
    public Partido(EquipoInscrito equipoInscritoLocal, EquipoInscrito equipoInscritoVisitante) {
        estado = Estado.NO_INICIADO;
        marcador = new Marcador();
        this.equipoInscritoLocal = equipoInscritoLocal;
        this.equipoInscritoVisitante = equipoInscritoVisitante;
    }
    //ToString
    @Override
    public String toString() {
        return "Partido{" + "estado=" + estado + ", fecha=" + fecha + ", equipoInscritoLocal=" + equipoInscritoLocal + ", equipoInscritoVisitante=" + equipoInscritoVisitante + '}';
    }
}
