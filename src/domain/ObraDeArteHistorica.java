package domain;

public abstract class ObraDeArteHistorica extends ObraDeArte {
    private String periodo;

    public ObraDeArteHistorica(String titulo, String autor, String periodo) {
        super(titulo, autor);
        this.periodo = periodo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    @Override
    public abstract void exhibir(); // Método abstracto que debe ser implementado por subclases

    @Override
    public abstract double obtenerValor(); // Método abstracto que debe ser implementado por subclases
}