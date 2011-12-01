package Modelo;
import java.io.*;
import java.util.ArrayList;

import java.util.*;
public class LigadeBeisbol {
		public String nombre;
		public String Descripcion;
		private ArrayList<Equipo> equipos;
		private ArrayList<Partido> partidos;
		private ArrayList<Umpire> arbitros;

		
		public LigadeBeisbol() {
			super();
			// TODO Auto-generated constructor stub
			arbitros = new  ArrayList<Umpire>();
			partidos = new ArrayList<Partido>();
			equipos = new ArrayList<Equipo>();
			
		}
		
		
		public void generarCalendario(){
			// FUNCION QUE GENERA EL CALENDARIO DEL TORNEO
		}
		
		public void generarTablaPos(){
			// USAR FORMULA DE LA DIFERENCIA
		}


		public void registrarUmpire(Umpire umpire){
			this.arbitros.add(umpire);
		}
		
		public void registrarEquipo(Equipo equipo){
			this.equipos.add(equipo);
		}
		
		public void GenerarPartido(){
			
		}
}
