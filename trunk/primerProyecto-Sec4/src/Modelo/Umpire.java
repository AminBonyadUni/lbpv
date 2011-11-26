package Modelo;

import java.util.Date;

public class Umpire extends Persona{
	protected int JuegosArbitrados;

	public Umpire(String cedula, String nombre, String apellido, Date fechaNac) {
		super(cedula, nombre, apellido, fechaNac);
		// TODO Auto-generated constructor stub
	}

	public Umpire(String cedula, String nombre, String apellido, Date fechaNac,
			int juegosArbitrados) {
		super(cedula, nombre, apellido, fechaNac);
		JuegosArbitrados = juegosArbitrados;
	}

	public int getJuegosArbitrados() {
		return JuegosArbitrados;
	}

	public void setJuegosArbitrados(int juegosArbitrados) {
		JuegosArbitrados = juegosArbitrados;
	}
	
	
	
	
}
