package domain;

public class Turno implements Comparable<Turno> {
	private int secuencia;
	
	public Turno(int secuencia) {
		super();
		this.secuencia = secuencia;
	}
	public int getSecuencia() {
		return this.secuencia;
	}
	public void setSecuencia(int secuencia) {
		 this.secuencia=secuencia;
	}

	@Override
	public int compareTo(Turno o) {
		
		return this.secuencia-o.getSecuencia();
	}

}
