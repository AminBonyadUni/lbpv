package Modelo;
import java.io.*;
import java.math.*;
import java.util.Vector;
	

public class Equipo {
		private String CodEquipo;
		private String Nombre;
		private String fundacion;
		private String NombreEstadio;
		private String Ciudad;
		
		private int JuegosJ;
		private int JuegosG;
		private int JuegosP;
		private Vector<Jugador> jugadores = new Vector<Jugador>();
		Equipo equipo;
		
		public Equipo() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Equipo(String codEquipo, String nombre, String fundacion,
				String nombreEstadio, String ciudad, int juegosJ, int juegosG,
				int juegosP) {
			super();
			CodEquipo = codEquipo;
			Nombre = nombre;
			this.fundacion = fundacion;
			NombreEstadio = nombreEstadio;
			Ciudad = ciudad;
			JuegosJ = juegosJ;
			JuegosG = juegosG;
			JuegosP = juegosP;
		}
		public void setJugadores(Vector<Jugador> jugadores) {
			this.jugadores = jugadores;
		}
		public Vector<Jugador> getJugadores() {
			return jugadores;
		}
		public String getCodEquipo() {
			return CodEquipo;
		}
		public void setCodEquipo(String codEquipo) {
			CodEquipo = codEquipo;
		}
		public String getNombre() {
			return Nombre;
		}
		public void setNombre(String nombre) {
			Nombre = nombre;
		}
		public String getFundacion() {
			return fundacion;
		}
		public void setFundacion(String fundacion) {
			this.fundacion = fundacion;
		}
		public String getNombreEstadio() {
			return NombreEstadio;
		}
		public void setNombreEstadio(String nombreEstadio) {
			NombreEstadio = nombreEstadio;
		}
		public String getCiudad() {
			return Ciudad;
		}
		public void setCiudad(String ciudad) {
			Ciudad = ciudad;
		}
		public int getJuegosJ() {
			return JuegosJ;
		}
		public void setJuegosJ(int juegosJ) {
			JuegosJ = juegosJ;
		}
		public int getJuegosG() {
			return JuegosG;
		}
		public void setJuegosG(int juegosG) {
			JuegosG = juegosG;
		}
		public int getJuegosP() {
			return JuegosP;
		}
		public void setJuegosP(int juegosP) {
			JuegosP = juegosP;
		}






}
