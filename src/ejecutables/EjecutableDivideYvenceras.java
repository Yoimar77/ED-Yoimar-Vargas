package ejecutables;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import domain.Persona;

public class EjecutableDivideYvenceras {

    private List<Persona> personas;

    public EjecutableDivideYvenceras() {
        // Inicializar la lista con 7 personas con edades ordenadas ascendentemente
        personas = new ArrayList<>();
        personas.add(new Persona("Ana", 20));
        personas.add(new Persona("Luis", 25));
        personas.add(new Persona("María", 30));
        personas.add(new Persona("Pedro", 35));
        personas.add(new Persona("Sofía", 40));
        personas.add(new Persona("Carlos", 45));
        personas.add(new Persona("Laura", 50));
    }

    // Método para buscar una edad de manera recursiva usando búsqueda binaria
    public int buscarEdadRecursivo(int edad, int inicio, int fin) {
        if (inicio > fin) {
            return -1; // Edad no encontrada
        }

        int medio = inicio + (fin - inicio) / 2;
        Persona personaEnMedio = personas.get(medio);

        if (personaEnMedio.getEdad() == edad) {
            return medio; // Encontrada la edad en el índice medio
        } else if (personaEnMedio.getEdad() > edad) {
            // Buscar en la mitad izquierda
            return buscarEdadRecursivo(edad, inicio, medio - 1);
        } else {
            // Buscar en la mitad derecha
            return buscarEdadRecursivo(edad, medio + 1, fin);
        }
    }

    public static void main(String[] args) {
        EjecutableDivideYvenceras ejecutable = new EjecutableDivideYvenceras();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la edad a buscar: ");
        int edadBuscada = scanner.nextInt();

        int resultado = ejecutable.buscarEdadRecursivo(edadBuscada, 0, ejecutable.personas.size() - 1);

        if (resultado == -1) {
            System.out.println("La edad " + edadBuscada + " no se encuentra en la lista.");
        } else {
            System.out.println("La edad " + edadBuscada + " se encuentra en la posición " + resultado + ".");
        }

        scanner.close();
    }
}
