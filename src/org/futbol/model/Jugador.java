package org.futbol.model;

import java.util.List;

public class Jugador extends Persona{ //extends es para heredar de la clase Persona

    //relaciones
    private List<JugadorInscrito> jugadorInscritoList;

    //constructor
     public Jugador(String nombre, String apellido) {
         super(nombre, apellido);// súper es para llamar al constructor de la clase padre
     }
     //ToString
    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + super.getNombre() + ", apellido=" + super.getApellido() + '}';
    }

}
