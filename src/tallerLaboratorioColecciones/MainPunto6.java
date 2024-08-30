package tallerLaboratorioColecciones;

import java.util.PriorityQueue;

public class MainPunto6 {
	public static void main(String[] args) {
		
        PriorityQueue<Tarea> colaDeTareas = new PriorityQueue<>();

        colaDeTareas.add(new Tarea("Finalizar informe", 3));
        colaDeTareas.add(new Tarea("Reuni�n con el equipo", 1));
        colaDeTareas.add(new Tarea("Responder correos electr�nicos", 4));
        colaDeTareas.add(new Tarea("Preparar presentaci�n", 2));

       
        while (!colaDeTareas.isEmpty()) {
            Tarea tarea = colaDeTareas.poll(); 
            System.out.println("Procesando: " + tarea);
        }
	}
}
