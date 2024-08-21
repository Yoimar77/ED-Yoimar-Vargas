package domain;

public class ReliquiaAntigua extends ObraDeArteHistorica {
    private String material;

    protected ReliquiaAntigua(String titulo, String autor, String periodo, String material) {
        super(titulo, autor, periodo);
        this.material = material;
    }

    protected String getMaterial() {
        return material;
    }

    protected void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void exhibir() {
        System.out.println("Exhibiendo la reliquia antigua '" + getTitulo() + "' de " + getAutor() +
                           ", hecha de " + material + " del periodo " + getPeriodo() + ".");
    }

    @Override
    public double obtenerValor() {
        
        return 10000.00; // Valor
    }
}
