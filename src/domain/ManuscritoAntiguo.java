package domain;

public class ManuscritoAntiguo extends ObraDeArteHistorica {
    private String idioma;

    public ManuscritoAntiguo(String titulo, String autor, String periodo, String idioma) {
        super(titulo, autor, periodo);
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Override
    public void exhibir() {
        System.out.println("Exhibiendo el manuscrito antiguo '" + getTitulo() + "' de " + getAutor() +
                           ", escrito en el idioma " + idioma + " del periodo " + getPeriodo() + ".");
    }

    @Override
    public double obtenerValor() {
      
        return 5000.00; // Valor ficticio para el ejemplo
    }
}
