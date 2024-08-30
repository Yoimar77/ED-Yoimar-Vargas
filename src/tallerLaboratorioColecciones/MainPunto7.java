package tallerLaboratorioColecciones;

import java.util.ArrayList;
import java.util.List;

public class MainPunto7 {
	public static void main(String[] args) {
		
		List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", 16, "Masculino"));
        personas.add(new Persona("María", 21, "Femenino"));
        personas.add(new Persona("Pedro", 17, "Masculino"));
        personas.add(new Persona("Ana", 18, "Femenino"));

        // Obtiene la lista de personas mayores de edad
        List<Persona> mayoresDeEdad = filtrarMayoresDeEdad(personas);

        // Imprime la lista de personas mayores de edad
        for (Persona persona : mayoresDeEdad) {
            System.out.println(persona);
        }
    }

    public static List<Persona> filtrarMayoresDeEdad(List<Persona> personas) {
        // Condición base: si la lista está vacía, devuelve una lista vacía
        if (personas.isEmpty()) {
            return new ArrayList<>();
        }

        // Obtener la primera persona de la lista
        Persona primeraPersona = personas.get(0);

        // Crear una nueva lista para almacenar las personas mayores de edad
        List<Persona> resultado = new ArrayList<>();

        // Verificar si la primera persona es mayor de edad
        if (primeraPersona.getAge() >= 18) {
            // Si es mayor de edad, añadirla a la lista de resultado
            resultado.add(primeraPersona);
        }

        // Llamada recursiva para procesar el resto de la lista
        resultado.addAll(filtrarMayoresDeEdad(personas.subList(1, personas.size())));

        return resultado;

	}
}
	

