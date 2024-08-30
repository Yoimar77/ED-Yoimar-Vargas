package tallerLaboratorioColecciones;

import java.util.PriorityQueue;

public class MainPunto6 {
	public static void main(String[] args) {
		
        PriorityQueue<Tarea> colaDeTareas = new PriorityQueue<>();

        colaDeTareas.add(new Tarea("Finalizar informe", 3));
        colaDeTareas.add(new Tarea("Reunión con el equipo", 1));
        colaDeTareas.add(new Tarea("Responder correos electrónicos", 4));
        colaDeTareas.add(new Tarea("Preparar presentación", 2));

       
        while (!colaDeTareas.isEmpty()) {
            Tarea tarea = colaDeTareas.poll(); 
            System.out.println("Procesando: " + tarea);
        }
	}
}
