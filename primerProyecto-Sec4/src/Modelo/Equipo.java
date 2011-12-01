package Modelo;
import java.io.*;
import java.math.*;
	

public class Equipo {
		private String CodEquipo;
		private String Nombre;
		private String fundacion;
		private String NombreEstadio;
		private String Ciudad;
		
		private int JuegosJ;
		private int JuegosG;
		private int JuegosP;
		Jugador Jugador;
		public Equipo() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Equipo(String codEquipo, String nombre, String fundacion,
				String nombreEstadio, String ciudad, int juegosJ, int juegosG,
				int juegosP, Modelo.Jugador jugador) {
			super();
			CodEquipo = codEquipo;
			Nombre = nombre;
			this.fundacion = fundacion;
			NombreEstadio = nombreEstadio;
			Ciudad = ciudad;
			JuegosJ = juegosJ;
			JuegosG = juegosG;
			JuegosP = juegosP;
			Jugador = jugador;
		}






}
