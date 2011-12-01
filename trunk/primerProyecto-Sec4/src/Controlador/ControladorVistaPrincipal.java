package Controlador;
import Modelo.LigadeBeisbol;
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.VistaPrincipal;


import Modelo.LigadeBeisbol;

public class ControladorVistaPrincipal implements ActionListener {
	private VistaPrincipal principal;
	private LigadeBeisbol liga;

	public ControladorVistaPrincipal() {
		super();
		
		LigadeBeisbol liga = new LigadeBeisbol();
		principal= new VistaPrincipal();
		principal.setLocationRelativeTo(null);
		principal.setVisible(true);	
		principal.agregarListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Registrar Umpire")){
			 new ControladorUmpire(liga);
		}
		else if(e.getActionCommand().equals("Registrar Equipos")){
			new ControladorEquipo(liga);
				 
			 }
		}
			
		
	}

