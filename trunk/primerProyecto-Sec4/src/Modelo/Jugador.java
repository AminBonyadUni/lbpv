package Modelo;
import java.util.*;
public class Jugador extends Persona  {
	
	protected int CarrImpulsada;
	protected int Homeruns;
	protected String Posicion;
	Equipo equipo;
	public Jugador(String cedula, String nombre, String apellido, String fechaNac) {
		super(cedula, nombre, apellido, fechaNac);
		// TODO Auto-generated constructor stub
	}
	public Jugador(String cedula, String nombre, String apellido,
			String fechaNac, int carrImpulsada, int homeruns, String posicion) {
		super(cedula, nombre, apellido, fechaNac);
		CarrImpulsada = carrImpulsada;
		Homeruns = homeruns;
		Posicion = posicion;
		this.equipo = equipo;
	}
	public int getCarrImpulsada() {
		return CarrImpulsada;
	}
	public void setCarrImpulsada(int carrImpulsada) {
		CarrImpulsada = carrImpulsada;
	}
	public int getHomeruns() {
		return Homeruns;
	}
	public void setHomeruns(int homeruns) {
		Homeruns = homeruns;
	}
	public String getPosicion() {
		return Posicion;
	}
	public void setPosicion(String posicion) {
		Posicion = posicion;
	}
	
	
	
}
