package Vista;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
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
	private JTextField txtEstadio;
	private JComboBox Combo;
	private JTextField txtFundacion;
	private JTextField txtNombreEquipo;
	private JTextField txtCodigo;
	private JButton btnSalirEquipo;
	private JButton btnCancelarEquipo;
	private JButton btnRegistrarEquipo;
	private JLabel jLabel6;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				VistaRegistrarEquipo inst = new VistaRegistrarEquipo();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public VistaRegistrarEquipo() {
		super();
		initGUI();
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
				jLabel1.setBounds(105, 12, 144, 19);
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
				jLabel5.setText("Año de Fundacion:");
				jLabel5.setBounds(45, 163, 107, 16);
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
				btnRegistrarEquipo.setBounds(57, 329, 80, 28);
			}
			{
				btnCancelarEquipo = new JButton();
				getContentPane().add(btnCancelarEquipo);
				btnCancelarEquipo.setText("Cancelar");
				btnCancelarEquipo.setBounds(140, 329, 80, 28);
			}
			{
				btnSalirEquipo = new JButton();
				getContentPane().add(btnSalirEquipo);
				btnSalirEquipo.setText("Salir");
				btnSalirEquipo.setBounds(223, 329, 80, 28);
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
				ComboBoxModel ComboModel = 
					new DefaultComboBoxModel(
							new String[] { "Item One", "Item Two" });
				Combo = new JComboBox();
				getContentPane().add(Combo);
				Combo.setModel(ComboModel);
				Combo.setBounds(152, 207, 130, 20);
			}
			{
				txtEstadio = new JTextField();
				getContentPane().add(txtEstadio);
				txtEstadio.setBounds(152, 256, 130, 20);
			}
			pack();
			this.setSize(375, 420);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
