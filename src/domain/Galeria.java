package domain;

import java.util.ArrayList;
import java.util.List;

public class Galeria {
    private String nombre;
    private List<ObraDeArte> obrasDeArte;

    public Galeria(String nombre) {
        this.nombre = nombre;
        this.obrasDeArte = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarObra(ObraDeArte obra) {
        obrasDeArte.add(obra);
    }

    public void exhibirObras() {
        System.out.println("Exhibiendo obras en la galería '" + nombre + "':");
        System.out.println("----------------------------------------");
        for (ObraDeArte obra : obrasDeArte) {
            obra.exhibir();
            double valor = obra.obtenerValor();
            System.out.println("El valor de la obra : "+obra.getTitulo()+" es de "+valor);
            System.out.println("------------------------------------------------------------------");
        }
        System.out.println("La exhibición de obras en la "+nombre+" culminó");
    }
}
