package ejecutables;

import java.util.Iterator;

import domain.Factura;

public class EjecutableFactura {
	public static void main(String[] args) {
		Factura [][] matrizFacturas = new Factura [2][2];
		double total =0;
				
		for (int i = 0; i < matrizFacturas.length; i++) {
			for (int j = 0; j < matrizFacturas.length; j++) {
				matrizFacturas[i][j]=new Factura(10);
				total =total + matrizFacturas[i][j].getPrecioFinal();
			}
		}
		double promedio=total /(matrizFacturas.length*2);
		System.out.println("El total es : "+total);
		System.out.println("El promedio es : "+promedio);
	}
	
}
