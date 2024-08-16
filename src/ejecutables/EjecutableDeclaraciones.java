package ejecutables;

public class EjecutableDeclaraciones {
	public static void main(String[] args) {
		declararArreglos();
		declararNumerosDecimales();
		declararNumerosEnteros();
		declararTextos();	
	}
	public static void declararNumerosEnteros() {
		int num1=1;
		int num2=1;
		int num3=1;
		int num4=1;
		int resultado = num1 * num2 * num3 * num4;
		System.out.println("el resultado de la multiplicación es: "+resultado);
	}
	public static void declararNumerosDecimales() {
		double num1=1;
		double num2=1;
		float num3=1;
		float num4=1;
		double resultado = num1 * num2 * num3 * num4;
		System.out.println("el resultado de la multiplicación es: "+resultado);

	}
	public static void declararTextos() {
		char character1 = 'j';
		char character2= 'k';
		System.out.println("los caracteres son : "+character1+","+character2);
		String chain1 = "hola";
		String chain2 = "mundo";
		System.out.println("las cadenas son : "+chain1+","+chain2);
	}
	public static void declararArreglos() {
		int []arregloEnteros = new int [5];
		long []arregloLongs = new long [5];
		char [] arregloChars = new char [5];
		String []arregloStrings = new String [5];
		for(int i =0; i<arregloEnteros.length;i++) {
			System.out.println("El arreglo de enteros en la posicion "+i+" es "+arregloEnteros[i]);
		}
		for(int i =0; i<arregloLongs.length;i++) {
			System.out.println("El arreglo de longs en la posicion "+i+" es "+arregloLongs[i]);
		}
		for(int i =0; i<arregloChars.length;i++) {
			System.out.println("El arreglo de chars en la posicion "+i+" es "+arregloChars[i]);
		}
		for(int i =0; i<arregloStrings.length;i++) {
			System.out.println("El arreglo de strings en la posicion "+i+" es "+arregloStrings[i]);
		}
	}
}
