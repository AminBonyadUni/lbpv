package Controlador;
import java.util.*;
import java.io.*;

import Modelo.Equipo;
import Modelo.LigadeBeisbol;
import Modelo.Umpire;
import Vista.VistaRegistrarEquipo;
import Vista.VistaRegistrarUmpire;
import Modelo.Jugador;
import java.awt.event.*;
import java.awt.*;
import javax.swing.filechooser.*;


import java.io.BufferedReader;

public class ControladorEquipo implements ActionListener{
		private VistaRegistrarEquipo vistaequipo;
		Equipo equipo;
		private LigadeBeisbol liga;
		
		
	public ControladorEquipo(LigadeBeisbol liga) {
			super();
			vistaequipo= new VistaRegistrarEquipo();
			vistaequipo.setLocationRelativeTo(null);
			vistaequipo.setVisible(true);
			vistaequipo.agregarListener(this);
			this.liga= liga;
			// TODO Auto-generated constructor stub
		}



	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
	 if(actionCommand.equals("Registrar")){
		  registrar();
            
    }
	 else if(actionCommand.equals("Cargar Jugadores")){
		try {
			cargarjugadores();
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	 }
    else if(actionCommand.equals("Cancelar")){
    	vistaequipo.limpiarCampos();
    }
        else if(actionCommand.equals("Salir")){
        	vistaequipo.setVisible(false);
        }
		
		// TODO Auto-generated method stub
		
	}
	public void cargarjugadores() throws NumberFormatException, IOException {
		File f;
	javax.swing.JFileChooser j= new javax.swing.JFileChooser();
	j.showOpenDialog(j); 
	String ruta=j.getSelectedFile().getAbsolutePath();
	 String lectura="";
	  f= new File(ruta);
	  	FileReader fr = new FileReader(f);
		BufferedReader bf = new BufferedReader(fr);
		String aux = "";
			String cedula;
	     	String nombre;
	     	String apellido;
	     	String fechaNac;
	     	String posicion;
	     	int CarreraImp;
	     	int homeruns;
	     	Jugador jugador;
	     
	     	Vector<Jugador> vectorJugador = new Vector<Jugador>();
	     
	     	while ((aux = bf.readLine())!=null )
	     	{
	     		cedula = bf.readLine();
	     		nombre = bf.readLine();
	        	apellido = bf.readLine();
	        	fechaNac= bf.readLine();
	        	CarreraImp= Integer.parseInt(bf.readLine());
	        	homeruns= Integer.parseInt(bf.readLine());
	        	posicion= bf.readLine();
	        	
	        
	       jugador = new Jugador(cedula, nombre, apellido, fechaNac, CarreraImp,homeruns, posicion);
	        
	       vectorJugador.addElement(jugador);
	     	}
	     	bf.close();
 
	}
	private void registrar(){
		try
		{
			if(vistaequipo.gettxtCodigo().getText().equals("")|| 
					vistaequipo.gettxtNombreEquipo().getText().equals("") || 
					vistaequipo.gettxtFundacion().getText().equals("")|| 
					vistaequipo.gettxtCiudad().getText().equals("")||
					vistaequipo.gettxtEstadio().getText().equals(""))
				vistaequipo.mostrarMensaje("Debe llenar todos los datos para poder registrar un Umpire");
			else
	    	{
				
				String codigo =vistaequipo.gettxtCodigo().getText();
	    		String nombre = vistaequipo.gettxtNombreEquipo().getText();
	    		String fundacion = vistaequipo.gettxtFundacion().getText();
	    		String Estadio= vistaequipo.gettxtEstadio().getText();
	    		String ciudad= vistaequipo.gettxtCiudad().getText();
	    		
	    		
	    		Equipo equipo = new Equipo(codigo, nombre, fundacion,Estadio,ciudad,0,0,0,null); 
	    	
	    		liga.registrarEquipo(equipo);
	    		
		        
	    		vistaequipo.mostrarMensaje("se ha registrado el umpire exitosamente");
	    		vistaequipo.limpiarCampos();
				
	    	}
		
		}catch(Exception e)
		{
			e.printStackTrace();
			vistaequipo.mostrarMensaje("No se pudo registrar el equipo, verifique que los datos sean correctos");
			vistaequipo.limpiarCampos();
		}
	
	    	
		}
	}
	
		

	

//en el constructor se instancia la ventana


