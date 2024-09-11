package preparcial1;

public class Turno implements Comparable<Turno> {
    private int secuencia;
    private boolean despachado;

    public Turno(int secuencia, boolean despachado) {
        this.secuencia = secuencia;
        this.despachado = despachado;
    }

    public int getSecuencia() {
        return secuencia;
    }

    public boolean isDespachado() {
        return despachado;
    }

    public void setDespachado(boolean despachado) {
        this.despachado = despachado;
    }

    @Override
    public int compareTo(Turno otroTurno) {
        return Integer.compare(this.secuencia, otroTurno.secuencia);
    }

    @Override
    public String toString() {
        return "Turno{" +
                "secuencia=" + secuencia +
                ", despachado=" + despachado +
                '}';
    }
}
