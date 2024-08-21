package domain;

public class Pintura extends ObraDeArteDecorativa {
    private String tecnica;

    public Pintura(String titulo, String autor, String estilo, String tecnica) {
        super(titulo, autor, estilo);
        this.tecnica = tecnica;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    @Override
    public void exhibir() {
        System.out.println("Exhibiendo la pintura '" + getTitulo() + "' de " + getAutor() + " en la técnica de " + tecnica + ".");
    }

    @Override
    public double obtenerValor() {
        return 1000.00; // Valor
    }
}
