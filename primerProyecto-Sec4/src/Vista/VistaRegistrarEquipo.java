package Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListModel;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;




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
public class VistaRegistrarEquipo extends javax.swing.JFrame {
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JFileChooser cargarListaJug;
	private JButton btnCargarJugadores;
	private JTextField txtCiudad;
	private JTextField txtEstadio;
	private JTextField txtFundacion;
	private JTextField txtNombreEquipo;
	private JTextField txtCodigo;
	private JButton btnSalirEquipo;
	private JButton btnCancelarEquipo;
	private JButton btnRegistrarEquipo;
	private JLabel jLabel6;

	
	
	public VistaRegistrarEquipo() {
		super();
		initGUI();
	}
	
	  public JTextField gettxtCodigo() {
	        return txtCodigo;
	    }
	  public JTextField gettxtNombreEquipo() {
	        return txtNombreEquipo;
	    }
	  public JTextField gettxtFundacion() {
	        return txtFundacion;
	    }
	  public JTextField gettxtCiudad() {
	        return txtCiudad;
	    }
	  public JTextField gettxtEstadio(){
		  return txtEstadio;
		  
	  }
	  
	
		public void mostrarMensaje(String mensaje){
		JOptionPane.showMessageDialog(this, mensaje);
	}
	
	
	public void agregarListener(ActionListener accion){
	 btnRegistrarEquipo.addActionListener(accion);  
	 btnCancelarEquipo.addActionListener(accion);
	 btnCargarJugadores.addActionListener(accion);  
	 btnSalirEquipo.addActionListener(accion);
	   btnRegistrarEquipo.setActionCommand("Registrar");
	  btnCargarJugadores.setActionCommand("Cargar Jugadores");
	   btnCancelarEquipo.setActionCommand("Cancelar");
	   btnSalirEquipo.setActionCommand("Salir");
	}
	
	public void limpiarCampos(){
		txtCodigo.setText("");
		txtNombreEquipo.setText("");
		txtFundacion.setText("");
		txtCiudad.setText("");
		txtEstadio.setText("");
	}
	
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("Registrar Equipos");
			getContentPane().setLayout(null);
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("Informacion Equipo");
				jLabel1.setBounds(89, 12, 180, 19);
				jLabel1.setFont(new java.awt.Font("Segoe UI",0,16));
			}
			{
				jLabel2 = new JLabel();
				getContentPane().add(jLabel2);
				jLabel2.setText("Codigo:");
				jLabel2.setBounds(45, 67, 53, 16);
			}
			{
				jLabel3 = new JLabel();
				getContentPane().add(jLabel3);
				jLabel3.setText("Nombre:");
				jLabel3.setBounds(45, 115, 53, 16);
			}
			{
				jLabel4 = new JLabel();
				getContentPane().add(jLabel4);
				jLabel4.setText("Estadio:");
				jLabel4.setBounds(45, 260, 53, 16);
			}
			{
				jLabel5 = new JLabel();
				getContentPane().add(jLabel5);
				jLabel5.setText("Ano de Fundacion:");
				jLabel5.setBounds(7, 162, 120, 16);
			}
			{
				jLabel6 = new JLabel();
				getContentPane().add(jLabel6);
				jLabel6.setText("Ciudad:");
				jLabel6.setBounds(45, 211, 53, 16);
			}
			{
				btnRegistrarEquipo = new JButton();
				getContentPane().add(btnRegistrarEquipo);
				btnRegistrarEquipo.setText("Registrar");
				btnRegistrarEquipo.setBounds(24, 329, 80, 28);
			}
			{
				btnCancelarEquipo = new JButton();
				getContentPane().add(btnCancelarEquipo);
				btnCancelarEquipo.setText("Cancelar");
				btnCancelarEquipo.setBounds(249, 329, 80, 28);
			}
			{
				btnSalirEquipo = new JButton();
				getContentPane().add(btnSalirEquipo);
				btnSalirEquipo.setText("Salir");
				btnSalirEquipo.setBounds(351, 329, 80, 28);
			}
			{
				txtCodigo = new JTextField();
				getContentPane().add(txtCodigo);
				txtCodigo.setBounds(152, 63, 130, 20);
			}
			{
				txtNombreEquipo = new JTextField();
				getContentPane().add(txtNombreEquipo);
				txtNombreEquipo.setBounds(152, 111, 130, 20);
			}
			{
				txtFundacion = new JTextField();
				getContentPane().add(txtFundacion);
				txtFundacion.setBounds(152, 161, 130, 20);
			}
			{
				txtEstadio = new JTextField();
				getContentPane().add(txtEstadio);
				txtEstadio.setBounds(152, 256, 130, 20);
			}
			{
				txtCiudad = new JTextField();
				getContentPane().add(txtCiudad);
				txtCiudad.setBounds(152, 205, 125, 22);
			}
			{
				btnCargarJugadores = new JButton();
				getContentPane().add(btnCargarJugadores);
				btnCargarJugadores.setText("Cargar Jugadores");
				btnCargarJugadores.setBounds(115, 329, 123, 28);
				btnCargarJugadores.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.out.println("btnCargarJugadores.actionPerformed, event="+evt);
						
					}
				});
			}
			{
				cargarListaJug = new JFileChooser();
				getContentPane().add(cargarListaJug);
				
				cargarListaJug.setBounds(-49, 13, 547, 326);
			}
			pack();
			this.setSize(459, 422);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
