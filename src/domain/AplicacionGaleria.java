package domain;

public class AplicacionGaleria{
    public static void main(String[] args) {
        // Crear una galer�a
        Galeria galeria = new Galeria("Galer�a Universidad Del Quind�o");

        // Crear algunas obras de arte decorativas
        Pintura pintura1 = new Pintura("El Grito", "Edvard Munch", "Expresionismo", "�leo sobre lienzo");
        Escultura escultura1 = new Escultura("El Pensador", "Auguste Rodin", "Realismo", "Bronce");
        
        // Crear algunas obras de arte hist�ricas
        ManuscritoAntiguo manuscrito = new ManuscritoAntiguo("La Biblia de Gutenberg", "Johann Gutenberg", "Siglo XV", "Lat�n");
        ReliquiaAntigua reliquia = new ReliquiaAntigua("C�liz de San Pedro", "Desconocido", "Siglo IV", "Oro");

        // Agregar obras a la galer�a
        galeria.agregarObra(pintura1);
        galeria.agregarObra(escultura1);
        galeria.agregarObra(manuscrito);
        galeria.agregarObra(reliquia);

        // Exhibir las obras en la galer�a
        galeria.exhibirObras();
    }
}
