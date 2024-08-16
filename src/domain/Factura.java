package domain;

public class Factura {
	private double precioTotal;
	
	

	public Factura(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	public Factura() {
		precioTotal=0;
	}

	public double getPrecioFinal() {
		return precioTotal;
	}

	public void setPrecioFinal(double precioFinal) {
		this.precioTotal = precioFinal;
	}
	
}
