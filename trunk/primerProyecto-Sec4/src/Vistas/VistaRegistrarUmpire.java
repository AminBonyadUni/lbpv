package Vistas;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

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
public class VistaRegistrarUmpire extends javax.swing.JFrame {
	private JButton btnRegistrarUmpire;
	private JButton btnSalir;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JButton btnCancelar;
	private JTextField txtNombre;
	private JTextField txtJuegos;
	private JTextField jTextField1;
	private JTextField txtCedula;
	private JTextField txtApellido;
	private JLabel jLabel6;
	private JLabel jLabel1;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				VistaRegistrarUmpire inst = new VistaRegistrarUmpire();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public VistaRegistrarUmpire() {
		super();
		initGUI();
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
				btnRegistrarUmpire.setBounds(59, 324, 80, 28);
			}
			{
				btnSalir = new JButton();
				getContentPane().add(btnSalir);
				btnSalir.setText("Salir");
				btnSalir.setBounds(241, 324, 80, 25);
				btnSalir.setSize(80, 28);
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
				jLabel2.setBounds(47, 60, 97, 16);
			}
			{
				jLabel3 = new JLabel();
				getContentPane().add(jLabel3);
				jLabel3.setText("Apellido:");
				jLabel3.setBounds(47, 109, 97, 16);
			}
			{
				jLabel4 = new JLabel();
				getContentPane().add(jLabel4);
				jLabel4.setText("Cedula:");
				jLabel4.setBounds(48, 159, 97, 16);
			}
			{
				jLabel5 = new JLabel();
				getContentPane().add(jLabel5);
				jLabel5.setText("Fecha de Nacimiento:");
				jLabel5.setBounds(49, 209, 127, 16);
			}
			{
				jLabel6 = new JLabel();
				BoxLayout jLabel6Layout = new BoxLayout(jLabel6, javax.swing.BoxLayout.X_AXIS);
				jLabel6.setLayout(jLabel6Layout);
				getContentPane().add(jLabel6);
				jLabel6.setText("Juegos Arbitrados:");
				jLabel6.setBounds(50, 259, 97, 16);
			}
			{
				txtNombre = new JTextField();
				getContentPane().add(txtNombre);
				txtNombre.setBounds(162, 58, 130, 20);
			}
			{
				txtApellido = new JTextField();
				getContentPane().add(txtApellido);
				txtApellido.setBounds(162, 107, 130, 20);
			}
			{
				txtCedula = new JTextField();
				getContentPane().add(txtCedula);
				txtCedula.setBounds(163, 157, 130, 20);
			}
			{
				jTextField1 = new JTextField();
				getContentPane().add(jTextField1);
				jTextField1.setText("fechanacimiento");
				jTextField1.setBounds(175, 207, 95, 20);
			}
			{
				txtJuegos = new JTextField();
				getContentPane().add(txtJuegos);
				txtJuegos.setBounds(165, 257, 130, 20);
			}
			{
				btnCancelar = new JButton();
				getContentPane().add(btnCancelar);
				btnCancelar.setText("Cancelar");
				btnCancelar.setBounds(150, 324, 80, 28);
			}
			pack();
			this.setSize(375, 420);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
