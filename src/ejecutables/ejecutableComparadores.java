package ejecutables;

import java.util.PriorityQueue;

import domain.Turno;

public class ejecutableComparadores {
	public static void main(String[] args) {
		PriorityQueue<Turno> turnos = new PriorityQueue<>();
		turnos.add(new Turno(10));
		turnos.add(new Turno(5));
		turnos.add(new Turno(4));
		turnos.add(new Turno(5));
		turnos.add(new Turno(20));
		turnos.add(new Turno(34));
		turnos.add(new Turno(1));
		while(!turnos.isEmpty()) {
			System.out.println(turnos.poll().getSecuencia());
		}
	}
}
