package ar.edu.unlam.empresa.transporte;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEmpresaTransporte {

	@Test
	public void queSePuedaAgregarUnaMoto(){
		Empresa empresa;
		Moto moto;
		String marca = "zanella";
		String patente = "ab123";
		Integer kilometros = 123;
		
		empresa = new Empresa();
		moto = new Moto(marca, patente, kilometros);
		empresa.agregarMoto(moto);
		
		assertFalse(empresa.listaMotos.isEmpty());
		assertFalse(empresa.listaVehiculos.isEmpty());
		
	}
	@Test
	public void queSePuedaAgregarUnAutobus(){
		Empresa empresa;
		Autobus autobus;
		String marca = "mercedes";
		String patente = "ds323";
		Integer kilometros = 1223;
		
		empresa = new Empresa();
		autobus = new Autobus(marca, patente, kilometros);
		empresa.agregarAutobus(autobus);
		
		assertFalse(empresa.listaAutobuses.isEmpty());
		assertFalse(empresa.listaVehiculos.isEmpty());
	}
	@Test
	public void queSePuedaAgregarUnaCoche(){
		Empresa empresa;
		Coche coche;
		String marca = "audi";
		String patente = "yt218";
		Integer kilometros = 0;
		
		empresa = new Empresa();
		coche = new Coche(marca, patente, kilometros);
		empresa.agregarCoche(coche);
		
		assertFalse(empresa.listaCoches.isEmpty());
		assertFalse(empresa.listaVehiculos.isEmpty());
	}
	
	@Test
	public void queSePuedaAgregarUnChofer(){
		Empresa empresa;
		Chofer chofer;
		String nombre = "mario";
		Integer id = 1;
		
		
		empresa = new Empresa();
		chofer = new Chofer(nombre, id);
		
		empresa.agregarChofer(chofer);
		
		assertFalse(empresa.listaChoferes.isEmpty());
	}
	
	@Test
	public void queSePuedaBuscarUnVehiculo(){
		Empresa empresa; Coche coche; Vehiculo vehiculoBuscado;
		String marca = "audi";
		String patente = "yt218";
		Integer kilometros = 0;
		String patenteBuscada = "yt218";
		
		empresa = new Empresa();
		coche = new Coche(patente, marca, kilometros);
		empresa.agregarCoche(coche);
		vehiculoBuscado = empresa.buscarVehiculo("yt218");
		
		assertEquals(patenteBuscada, vehiculoBuscado.getPatente());
	}
	
	@Test
	public void queSePuedaBuscarUnChofer(){
		Empresa empresa;
		Chofer chofer, choferBuscado;
		String nombre = "mario"; Integer id = 1;
		Integer idBuscada = 1;
		
		empresa = new Empresa();
		chofer = new Chofer(nombre, id);
		empresa.agregarChofer(chofer);
		choferBuscado = empresa.buscarChofer(1);
		
		assertEquals(idBuscada, choferBuscado.getId());
	}
	
	@Test
	public void queSePuedaAsignarUnChoferAUnCoche(){
		Empresa empresa;
		Chofer chofer, choferBuscado;
		String nombre = "mario"; Integer id = 1;
		Coche coche;
		Vehiculo vehiculoBuscado;
		String marca = "audi";
		String patente = "yt218";
		Integer kilometros = 0;
		Integer idBuscado = 1;
		String patenteBuscada = "yt218";
		
		empresa = new Empresa();
		chofer = new Chofer(nombre, id);
		coche = new Coche(marca, patente, kilometros);
		empresa.agregarCoche(coche); empresa.agregarChofer(chofer);
		vehiculoBuscado = empresa.buscarVehiculo(patenteBuscada);
		empresa.asignarChoferAUnVehiculo(idBuscado, patenteBuscada);
		
		assertEquals(idBuscado, vehiculoBuscado.chofer.getId());
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
