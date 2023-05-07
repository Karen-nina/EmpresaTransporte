package ar.edu.unlam.empresa.transporte;

import java.util.HashSet;

public class Empresa {

	public HashSet<Moto> listaMotos;
	public HashSet<Coche> listaCoches;
	public HashSet<Autobus> listaAutobuses;
	public HashSet<Chofer> listaChoferes;
	public HashSet<Vehiculo> listaVehiculos;
	
	public Empresa() {
		listaMotos = new HashSet<Moto>();
		listaCoches = new HashSet<Coche>();
		listaAutobuses = new HashSet<Autobus>();
		listaChoferes = new HashSet<Chofer>();
		listaVehiculos = new HashSet<Vehiculo>();
	}

	public void agregarMoto(Moto moto) {
		listaMotos.add(moto);
		listaVehiculos.add(moto);
	}

	public void agregarAutobus(Autobus autobus) {
		listaAutobuses.add(autobus);
		listaVehiculos.add(autobus);
	}

	public void agregarCoche(Coche coche) {
		listaCoches.add(coche);
		listaVehiculos.add(coche);
	}

	public void agregarChofer(Chofer chofer) {
		listaChoferes.add(chofer);
		
	}
	
	public void asignarChoferAUnVehiculo(Integer idBuscado, String patenteBuscada) {
		Vehiculo v = buscarVehiculo(patenteBuscada);
		Chofer c = buscarChofer(idBuscado);
		
		v.setChofer(c);
	}

	public Vehiculo buscarVehiculo(String patente) {
		for(Vehiculo vehiculo: listaVehiculos) {
			if(vehiculo.getPatente().equals(patente)) {
				return vehiculo;
			}
		}
		return null;
	}
	
	public Chofer buscarChofer(Integer id) {
		for(Chofer chofer: listaChoferes) {
			if(chofer.getId()==id) {
				return chofer;
			}
		}
		return null;
	}
}
