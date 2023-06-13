
import org.futbol.model.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        boolean validar = false;
        Competencia competencia = new Competencia("Liga Pro");
        System.out.println(competencia);
        Jugador jugador = new Jugador("Leonel", "Messi");
        Jugador jugador2 = new Jugador("Cristiano", "Ronaldo");
        System.out.println(jugador);
        Equipo equipo = new Equipo("Barcelona");
        System.out.println(equipo);
        Equipo equipo2 = new Equipo("Real Madrid");
        Modalidad modalidad = new Modalidad("Liga");
        System.out.println(modalidad);
        Temporada temporada = new Temporada(competencia, "2023");
        System.out.println(temporada);
        Asignacion asignacion = new Asignacion(modalidad, temporada);
        modalidad.getAsignacionList().add(asignacion);
        temporada.getAsignacionList().add(asignacion);
        System.out.println(temporada);
        EquipoInscrito equipoInscrito = new EquipoInscrito(temporada, equipo);
        temporada.getEquipoInscritoList().add(equipoInscrito);
        equipo.getEquipoInscritoList().add(equipoInscrito);
        EquipoInscrito equipoInscrito2 = new EquipoInscrito(temporada, equipo2);
        temporada.getEquipoInscritoList().add(equipoInscrito2);
        equipo2.getEquipoInscritoList().add(equipoInscrito2);
        System.out.println(temporada.getEquipoInscritoList());
        equipoInscrito.InscribirJugador(jugador);
        equipoInscrito2.InscribirJugador(jugador2);
        equipoInscrito2.InscribirJugador(jugador);
        asignacion.generarFechas();
        System.out.println(asignacion.getFechaList());
        Partido partido = new Partido(equipoInscrito, equipoInscrito2);
        System.out.println(partido);
    }
}