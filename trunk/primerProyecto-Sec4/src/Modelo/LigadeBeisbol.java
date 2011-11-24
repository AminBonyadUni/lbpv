package Modelo;
import java.io.*;
public class LigadeBeisbol {
		public String nombre;
		public String Descripcion;
		int equipos[]= new int[4];
		int partido[]= new int[4];
		int umpire[] = new int[4];
		public LigadeBeisbol() {
			super();
			// TODO Auto-generated constructor stub
		}
		public LigadeBeisbol(String nombre, String descripcion, int[] equipos,
				int[] partido, int[] umpire) {
			super();
			this.nombre = nombre;
			Descripcion = descripcion;
			this.equipos = equipos;
			this.partido = partido;
			this.umpire = umpire;
		}
		
		public void generarCalendario(){
			// FUNCION QUE GENERA EL CALENDARIO DEL TORNEO
		}
		
		public void generarTablaPos(){
			// USAR FORMULA DE LA DIFERENCIA
		}



}
