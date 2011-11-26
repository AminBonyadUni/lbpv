package Modelo;
import java.util.*;
public class Persona {
	protected  String cedula;
	protected String nombre;
	protected String Apellido;
	protected Date fechaNac;
	public Persona(String cedula, String nombre, String apellido, Date fechaNac) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		Apellido = apellido;
		this.fechaNac = fechaNac;
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
	public Date getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	
	
	
	







}
	