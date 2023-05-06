package ar.edu.unlam.empresa.transporte;

public abstract class Vehiculo {

	protected String patente;
	protected String marca;
	protected Integer kilometros;
	
	
	public Vehiculo(String patente, String marca, Integer kilometros) {
		
		this.patente = patente;
		this.marca = marca;
		this.kilometros = kilometros;
	}
	
	
	
}
