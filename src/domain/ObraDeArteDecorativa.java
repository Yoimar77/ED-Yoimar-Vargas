package domain;

public abstract class ObraDeArteDecorativa extends ObraDeArte {
    private String estilo;

    protected ObraDeArteDecorativa(String titulo, String autor, String estilo) {
        super(titulo, autor);
        this.estilo = estilo;
    }

    protected String getEstilo() {
        return estilo;
    }

    protected void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public abstract void exhibir(); // No necesita redefinir `obtenerValor` porque es abstracta
}
