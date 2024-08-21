package domain;

public class Escultura extends ObraDeArteDecorativa {
    private String material;

    public Escultura(String titulo, String autor, String estilo, String material) {
        super(titulo, autor, estilo);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void exhibir() {
        System.out.println("Exhibiendo la escultura '" + getTitulo() + "' de " + getAutor() + " hecha de " + material + ".");
    }

    @Override
    public double obtenerValor() {
        return 2000.00; // Valor
    }
}
