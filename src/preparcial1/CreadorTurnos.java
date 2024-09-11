package preparcial1;

import java.util.PriorityQueue;
import java.util.Queue;

public class CreadorTurnos {

    public Queue<Turno> obtenerTurnosVuelosNacio() {
        // Crea una PriorityQueue para los turnos nacionales
        PriorityQueue<Turno> turnosNacionales = new PriorityQueue<>();
        
        // Añadir turnos nacionales a la cola de prioridad
        turnosNacionales.add(new Turno(5, false));
        turnosNacionales.add(new Turno(3, false));
        turnosNacionales.add(new Turno(1, false));

        return turnosNacionales;
    }

    public Queue<Turno> obtenerTurnosVuelosInter() {
        // Crea una PriorityQueue para los turnos internacionales
        PriorityQueue<Turno> turnosInternacionales = new PriorityQueue<>();
        
        // Añadir turnos internacionales a la cola de prioridad
        turnosInternacionales.add(new Turno(6, false));
        turnosInternacionales.add(new Turno(4, false));
        turnosInternacionales.add(new Turno(2, false));

        return turnosInternacionales;
    }
}
