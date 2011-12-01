package Modelo;
import java.util.*;


import Modelo.LigadeBeisbol;

public class Umpire extends Persona{
 protected Integer JuegosArbitrados;

	public Umpire() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Umpire(String cedula, String nombre, String apellido, String fechaNac) {
		super(cedula, nombre, apellido, fechaNac);
		// TODO Auto-generated constructor stub
	}

	public Umpire(String cedula, String nombre, String apellido,
			String fechaNac, Integer juegosArbitrados) {
		super(cedula, nombre, apellido, fechaNac);
		JuegosArbitrados = juegosArbitrados;
	}

	

	public Integer getJuegosArbitrados() {
		return JuegosArbitrados;
	}

	public void setJuegosArbitrados(Integer juegosArbitrados) {
		JuegosArbitrados = juegosArbitrados;
	}

	
	
	
	
}
