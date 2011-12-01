package Controlador;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import Modelo.LigadeBeisbol;
import Modelo.Umpire;
import Vista.VistaRegistrarUmpire;
import Vista.VistaPrincipal;
import Controlador.ControladorVistaPrincipal;
public class ControladorUmpire implements ActionListener {

		private VistaRegistrarUmpire Vistaarbitro;
		Umpire umpire;
		//OJ0
		private LigadeBeisbol liga;
		

	public ControladorUmpire(LigadeBeisbol liga) {
			super();
			Vistaarbitro= new VistaRegistrarUmpire();
			Vistaarbitro.setLocationRelativeTo(null);
			Vistaarbitro.setVisible(true);
			Vistaarbitro.agregarListener(this);
			this.liga=liga;
		}
	
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		  if(actionCommand.equals("Registrar")){
			  registrar();
              
      }
      else if(actionCommand.equals("Cancelar")){
          Vistaarbitro.limpiarCampos();
      }
          else if(actionCommand.equals("Salir")){
    	  Vistaarbitro.setVisible(false);
          }
		
	
		
	}
	private void registrar(){
		try
		{
			if(Vistaarbitro.gettxtCedula().getText().equals("")|| 
					Vistaarbitro.gettxtNombre().getText().equals("") || 
					Vistaarbitro.gettxtApellido().getText().equals("")|| 
					Vistaarbitro.gettxtFecha().getText().equals(""))
				Vistaarbitro.mostrarMensaje("Debe llenar todos los datos para poder registrar un Umpire");
			else
	    	{
	    		String cedula =Vistaarbitro.gettxtCedula().getText();
	    		String nombre = Vistaarbitro.gettxtNombre().getText();
	    		String apellido = Vistaarbitro.gettxtApellido().getText();
	    		String fecha= Vistaarbitro.gettxtFecha().getText();
	    	
	    		
	    		Umpire umpire = new Umpire(cedula, nombre, apellido,fecha,0); 
	    	
	    		liga.registrarUmpire(umpire);
	    		
		        
	    		Vistaarbitro.mostrarMensaje("se ha registrado el umpire exitosamente");
	    		Vistaarbitro.limpiarCampos();
				
	    	}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Vistaarbitro.mostrarMensaje("No se pudo registrar el umpire, verifique que los datos sean correctos");
			Vistaarbitro.limpiarCampos();
		}
	}



	


	
	
	
	
	

}
