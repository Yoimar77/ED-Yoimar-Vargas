package tallerLaboratorioColecciones;

import java.util.ArrayList;
import java.util.Collections;

public class MainPunto1 {
	public static void main(String[] args) {
		ArrayList <Persona> personas = new ArrayList<>();
		personas.add(new Persona("Juan",15,"Masculino"));
		personas.add(new Persona("camilo",10,"Masculino"));
		personas.add(new Persona("Juana",35,"Femenino"));
		
		Collections.sort(personas);
		
		for(Persona persona : personas) {
			String mensajePersona =persona.toString();
			System.out.println(mensajePersona);
		}
		
	}
}
