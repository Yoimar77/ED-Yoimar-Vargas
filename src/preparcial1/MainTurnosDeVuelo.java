package preparcial1;

import java.util.*;

public class MainTurnosDeVuelo {

    public static void main(String[] args) {
        // Creación de turnos de ejemplo
        CreadorTurnos creadorTurnos = new CreadorTurnos();
        Queue<Turno> turnosNacionales = creadorTurnos.obtenerTurnosVuelosNacio();
        Queue<Turno> turnosInternacionales = creadorTurnos.obtenerTurnosVuelosInter();

        // Imprimir turnos ordenados
        imprimirTurnosOrdenados(turnosNacionales, turnosInternacionales);
        
        System.out.println("--------------------------------------------------");

        // Simulación de turnos atendidos
        Collection<Turno> turnosAtendidos = new ArrayList<>(turnosNacionales);  // Asumimos que ya se han atendido
        LinkedList<Turno> listaTurnosAtendidos = imprimirTurnosAtendidos(turnosAtendidos);
        
        System.out.println("------------------------------------------------------");

        // Atender turnos por las puntas
        Turno[] turnosRecienAtendidos = atenderTurnosPorLasPuntas(listaTurnosAtendidos);
        
        // Imprimir turnos recientemente atendidos
        imprimirTurnosRecienAtendidos(turnosRecienAtendidos);
    }

    // 1. Método para imprimir turnos ordenados usando un iterator
    public static Set<Turno> imprimirTurnosOrdenados(Queue<Turno> turnosNacio, Queue<Turno> turnosInter) {
        Set<Turno> turnosOrdenados = new TreeSet<>();
        turnosOrdenados.addAll(turnosNacio);
        turnosOrdenados.addAll(turnosInter);

        // Creamos el iterador para recorrer el set ordenado
        Iterator<Turno> iterador = turnosOrdenados.iterator();

        // Iteramos sobre los elementos usando el iterador
        while (iterador.hasNext()) {
            Turno turno = iterador.next();
            System.out.println(turno);  // Imprimir el turno actual
        }

        return turnosOrdenados;
    }

    // 2. Método para imprimir turnos atendidos y remover los despachados
    public static LinkedList<Turno> imprimirTurnosAtendidos(Collection<Turno> turnosAtendidos) {

        LinkedList<Turno> listaTurnos = new LinkedList<>(turnosAtendidos);  // Convertir a LinkedList
        
        // Crear un iterador para eliminar los turnos despachados
        ListIterator<Turno> iterador = listaTurnos.listIterator();
        while (iterador.hasNext()) {
            Turno turno = iterador.next();
            if (turno.isDespachado()) {
                iterador.remove();  // Eliminamos si el turno ya está despachado
            }
        }

        // Retornamos la lista actualizada sin los turnos despachados
        return listaTurnos;
    }

    // 3. Método para atender turnos por las puntas (primero y último)
    public static Turno[] atenderTurnosPorLasPuntas(LinkedList<Turno> turnos) {
        Turno primero = turnos.pollFirst();  // Atender el primer turno (remueve el primero)
        Turno ultimo = turnos.pollLast();    // Atender el último turno (remueve el último)

        // Retornamos ambos turnos atendidos
        return new Turno[]{primero, ultimo};
    }

    // 4. Método para imprimir los turnos recién atendidos
    public static void imprimirTurnosRecienAtendidos(Turno[] turnos) {
        for (Turno turno : turnos) {
            if (turno != null) {  // Verificamos que no sean nulos
                System.out.println(turno);  // Imprimimos cada turno atendido
            }
        }
    }
}

