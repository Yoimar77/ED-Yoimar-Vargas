package domain;

public abstract class ObraDeArte implements Exhibible, Avaluable {
    private String titulo;
    private String autor;

    protected ObraDeArte(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    protected String getTitulo() {
        return titulo;
    }

    protected void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    protected String getAutor() {
        return autor;
    }

    protected void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public abstract void exhibir(); // Métodos abstractos que deben ser implementados por subclases

    @Override
    public abstract double obtenerValor();
}
