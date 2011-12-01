package Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

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
public class VistaPrincipal extends javax.swing.JFrame {
	private JMenuBar jMenuBar1;
	private JMenu jMenu5;
	private JMenuItem GenerarPartido;
	private JMenuItem jMenuItem7;
	private JMenuItem jMenuItem6;
	private JMenuItem jMenuItem5;
	private JMenuItem jMenuItem4;
	private JMenuItem jMenuItem3;
	private JMenuItem jMenuItem2;
	private JMenuItem jMenuItem1;
	private JMenu jMenu4;
	private JMenu jMenu3;
	private JMenu jMenu2;
	private JMenu jMenu1;

	
	public VistaPrincipal() {
		super();
		initGUI();
	}
	
	
	public void agregarListener(ActionListener accion){
		jMenuItem1.addActionListener(accion);
		jMenuItem2.addActionListener(accion);
		jMenuItem5.addActionListener(accion);
		jMenuItem1.setActionCommand("Registrar Umpire");
		jMenuItem2.setActionCommand("Registrar Equipos");
		jMenuItem5.setActionCommand("Salir");
	}
	
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				jMenuBar1 = new JMenuBar();
				setJMenuBar(jMenuBar1);
				{
					jMenu1 = new JMenu();
					jMenuBar1.add(jMenu1);
					jMenu1.setText("Gestionar Registros");
					{
						jMenuItem1 = new JMenuItem();
						jMenu1.add(jMenuItem1);
						jMenuItem1.setText("Registrar Umpire");
					}
					{
						jMenuItem2 = new JMenuItem();
						jMenu1.add(jMenuItem2);
						jMenuItem2.setText("Registrar Equipos");
					}
					{
						GenerarPartido = new JMenuItem();
						jMenu1.add(GenerarPartido);
						GenerarPartido.setText("Generar Partidos");
						GenerarPartido.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								System.out.println("GenerarPartido.actionPerformed, event="+evt);
								//TODO add your code for GenerarPartido.actionPerformed
							}
						});
					}
				}
				{
					jMenu2 = new JMenu();
					jMenuBar1.add(jMenu2);
					jMenu2.setText("Partidos");
				}
				{
					jMenu3 = new JMenu();
					jMenuBar1.add(jMenu3);
					jMenu3.setText("Liga");
					{
						jMenuItem3 = new JMenuItem();
						jMenu3.add(jMenuItem3);
						jMenuItem3.setText("Clasificacion");
					}
					{
						jMenuItem4 = new JMenuItem();
						jMenu3.add(jMenuItem4);
						jMenuItem4.setText("Calendario");
					}
				}
				{
					jMenu4 = new JMenu();
					jMenuBar1.add(jMenu4);
					jMenu4.setText("Estadisticas");
					{
						jMenuItem6 = new JMenuItem();
						jMenu4.add(jMenuItem6);
						jMenuItem6.setText("Por Equipos");
					}
					{
						jMenuItem7 = new JMenuItem();
						jMenu4.add(jMenuItem7);
						jMenuItem7.setText("Jugadores");
					}
				}
				{
					jMenu5 = new JMenu();
					jMenuBar1.add(jMenu5);
					jMenu5.setText("Finalizar");
					{
						jMenuItem5 = new JMenuItem();
						jMenu5.add(jMenuItem5);
						jMenuItem5.setText("Salir");
						jMenuItem5.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								System.out.println("jMenuItem5.actionPerformed, event="+evt);
								//TODO add your code for jMenuItem5.actionPerformed
							}
						});
					}
				}
			}
			pack();
			this.setSize(638, 291);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
