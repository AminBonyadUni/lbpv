package Modelo;
import java.util.*;
public class Persona {
	protected  String cedula;
	protected String nombre;
	protected String Apellido;
	protected String fechaNac;
	public Persona(String cedula, String nombre, String apellido,
			String fechaNac) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		Apellido = apellido;
		this.fechaNac = fechaNac;
	}
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}
		
	
	
	







}
	