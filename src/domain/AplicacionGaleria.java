package domain;

public class AplicacionGaleria{
    public static void main(String[] args) {
        // Crear una galería
        Galeria galeria = new Galeria("Galería Universidad Del Quindío");

        // Crear algunas obras de arte decorativas
        Pintura pintura1 = new Pintura("El Grito", "Edvard Munch", "Expresionismo", "Óleo sobre lienzo");
        Escultura escultura1 = new Escultura("El Pensador", "Auguste Rodin", "Realismo", "Bronce");
        
        // Crear algunas obras de arte históricas
        ManuscritoAntiguo manuscrito = new ManuscritoAntiguo("La Biblia de Gutenberg", "Johann Gutenberg", "Siglo XV", "Latín");
        ReliquiaAntigua reliquia = new ReliquiaAntigua("Cáliz de San Pedro", "Desconocido", "Siglo IV", "Oro");

        // Agregar obras a la galería
        galeria.agregarObra(pintura1);
        galeria.agregarObra(escultura1);
        galeria.agregarObra(manuscrito);
        galeria.agregarObra(reliquia);

        // Exhibir las obras en la galería
        galeria.exhibirObras();
    }
}
