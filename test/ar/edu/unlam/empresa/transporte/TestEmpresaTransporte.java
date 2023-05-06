package ar.edu.unlam.empresa.transporte;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEmpresaTransporte {

	@Test
	public void queSePuedaAgregarUnaMoto(){
		Empresa empresa;
		
		Moto moto;
		String marca;
		String patente;
		
		empresa = new Empresa();
		
		moto = new Moto(marca, patente);
		
		empresa.agregarMoto(moto);
		
		assertNotNull(empresa.listaMotos.isEmpty());
		
	}
	@Test
	public void queSePuedaAgregarUnAutobus(){
		
	}
	@Test
	public void queSePuedaAgregarUnaCoche(){
		
	}
	@Test
	public void queSePuedaAgregarUnChofer(){
		
	}
	@Test
	public void queSePuedaAsignarUnChoferAUnVehiculo() {
		
	}
	@Test
	public void queSePuedaCambiarUnChoferAUnVehiculo(){
		
	}
	@Test
	public void queNoSePuedaSubirMasDeTresPasajerosAUnCoche(){
		
	}
	@Test
	public void queNoSePuedaSubirMasDeVeintePasajerosAUnAutobus(){
		
	}
	@Test
	public void queNoSePuedaSubirMasDeUnPasajerosAUnaMoto(){
		
	}
		
	@Test
	public void queSePuedaConocerLosKilometrosRecorridosDeUnVehiculo(){
		
	}

	
}
