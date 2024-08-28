package tallerLaboratorioColecciones;

import java.util.HashMap;

public class MainPunto3 {
	public static void main(String[] args) {
        // Crear el mapa que asocia la matrícula con el estudiante
        HashMap<String, Estudiante> mapaEstudiantes = new HashMap<>();

        // Crea algunos estudiantes
        Estudiante e1 = new Estudiante("Carlos", 20, "M", "001");
        Estudiante e2 = new Estudiante("Ana", 22, "F", "002");
        Estudiante e3 = new Estudiante("Beatriz", 21, "F", "003");

        // Asocia los estudiantes con sus matrículas en el mapa
        mapaEstudiantes.put(e1.getTuition(), e1);
        mapaEstudiantes.put(e2.getTuition(), e2);
        mapaEstudiantes.put(e3.getTuition(), e3);

        // Buscar un estudiante por su matrícula
        String matriculaBuscar = "002";
        Estudiante estudianteBuscado = mapaEstudiantes.get(matriculaBuscar);

        if (estudianteBuscado != null) {
            System.out.println("Estudiante encontrado: " + estudianteBuscado.toString());
        } else {
            System.out.println("Estudiante no encontrado con la matrícula: " + matriculaBuscar);
        }
    }
}
