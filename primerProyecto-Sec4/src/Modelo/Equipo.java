package Modelo;
import java.io.*;
import java.math.*;
	

public class Equipo {
		private String CodEquipo;
		public String Nombre;
		public String Ciudad;
		public int JuegosJ;
		public int JuegosG;
		public int JuegosP;
		Jugador Jugador;
public Equipo() {
		super();
		// TODO Auto-generated constructor stub
	}
public Equipo(String codEquipo, String nombre, String ciudad, int juegosJ,
		int juegosG, int juegosP, Modelo.Jugador jugador) {
		super();
		CodEquipo = codEquipo;
		Nombre = nombre;
		Ciudad = ciudad;
		JuegosJ = juegosJ;
		JuegosG = juegosG;
		JuegosP = juegosP;
		Jugador = jugador;
	}
//cargar del txt BASE DE DATOS
	public void cargarEquipo(){
		//PENDIENTE
	}





}
