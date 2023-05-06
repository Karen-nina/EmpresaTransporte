package ar.edu.unlam.empresa.transporte;

import java.util.Objects;

public class Chofer {
	String nombre;
	Integer id;
	
	public Chofer (String nombre, Integer id) {
		this.nombre = nombre;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chofer other = (Chofer) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
