package Vista;
import Modelo.Umpire;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import Modelo.Umpire;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class VistaRegistrarUmpire extends javax.swing.JFrame {
	private JButton btnRegistrarUmpire;
	private JButton btnSalir;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JButton btnBuscar;
	private JTextField txtFecha;
	private JButton btnCancelar;
	private JTextField txtNombre;
	private JTextField txtCedula;
	private JTextField txtApellido;
	private JLabel jLabel1;


	
	public VistaRegistrarUmpire() {
		super();
		initGUI();
	}
	  public JTextField gettxtCedula() {
	        return txtCedula;
	    }
	  public JTextField gettxtNombre() {
	        return txtNombre;
	    }
	  public JTextField gettxtApellido() {
	        return txtApellido;
	    }
	  public JTextField gettxtFecha() {
	        return txtFecha;
	    }
	  
	
		public void mostrarMensaje(String mensaje){
		JOptionPane.showMessageDialog(this, mensaje);
	}
	
	
	public void agregarListener(ActionListener accion){
	 btnRegistrarUmpire.addActionListener(accion);  
	 btnCancelar.addActionListener(accion);
	   btnSalir.addActionListener(accion);
	   btnRegistrarUmpire.setActionCommand("Registrar");
	   btnCancelar.setActionCommand("Cancelar");
	   btnSalir.setActionCommand("Salir");
	}
	
	public void limpiarCampos(){
		txtCedula.setText("");
		txtNombre.setText("");
		txtApellido.setText("");
		txtFecha.setText("");
		
	}
	
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("Registrar Umpire");
			{
				btnRegistrarUmpire = new JButton();
				getContentPane().add(btnRegistrarUmpire);
				btnRegistrarUmpire.setText("Registrar");
				btnRegistrarUmpire.setBounds(36, 324, 80, 28);
			}
			{
				btnSalir = new JButton();
				getContentPane().add(btnSalir);
				btnSalir.setText("Salir");
				btnSalir.setBounds(255, 324, 80, 28);
			}
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("Informacion Umpires");
				jLabel1.setBounds(104, 12, 166, 24);
				jLabel1.setFont(new java.awt.Font("Segoe UI",0,16));
			}
			{
				jLabel2 = new JLabel();
				getContentPane().add(jLabel2);
				jLabel2.setText("Nombre:");
				jLabel2.setBounds(42, 113, 97, 16);
			}
			{
				jLabel3 = new JLabel();
				getContentPane().add(jLabel3);
				jLabel3.setText("Apellido:");
				jLabel3.setBounds(42, 159, 97, 16);
			}
			{
				jLabel4 = new JLabel();
				getContentPane().add(jLabel4);
				jLabel4.setText("Cedula:");
				jLabel4.setBounds(48, 64, 97, 16);
			}
			{
				jLabel5 = new JLabel();
				getContentPane().add(jLabel5);
				jLabel5.setText("Fecha de Nacimiento:");
				jLabel5.setBounds(12, 209, 147, 16);
			}
			{
				txtNombre = new JTextField();
				getContentPane().add(txtNombre);
				txtNombre.setBounds(165, 111, 130, 20);
			}
			{
				txtApellido = new JTextField();
				getContentPane().add(txtApellido);
				txtApellido.setBounds(165, 157, 130, 20);
			}
			{
				txtCedula = new JTextField();
				getContentPane().add(txtCedula);
				txtCedula.setBounds(165, 62, 130, 20);
			}
			{
				btnCancelar = new JButton();
				getContentPane().add(btnCancelar);
				btnCancelar.setText("Cancelar");
				btnCancelar.setBounds(151, 324, 80, 28);
			}
			{
				txtFecha = new JTextField();
				getContentPane().add(txtFecha);
				txtFecha.setBounds(171, 207, 128, 23);
			}
			{
				btnBuscar = new JButton();
				getContentPane().add(btnBuscar);
				btnBuscar.setText("Buscar");
				btnBuscar.setBounds(343, 57, 88, 23);
			}
			pack();
			this.setSize(465, 462);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	
}
