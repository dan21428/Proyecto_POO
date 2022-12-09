package Proyect;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JFormattedTextField;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuUsuario extends JFrame {

	private JPanel contentPane;
	private JLabel lblAmount;
	private JPanel panel;
	private JPanel panel_1;
	private JTextField txtApuesta;
	private JPanel panel_4;
	private JLabel lblWinner;
	private JTextField txtWINNER;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuUsuario frame = new MenuUsuario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 730, 528);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BETTING MENU");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setForeground(new Color(128, 0, 64));
		lblNewLabel.setFont(new Font("Copperplate Gothic Bold", Font.ITALIC, 18));
		lblNewLabel.setBounds(187, 29, 170, 40);
		contentPane.add(lblNewLabel);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(180, 37, 178, 20);
		contentPane.add(panel_1);
		
		lblAmount = new JLabel("AMOUNT:");
		lblAmount.setForeground(new Color(128, 0, 64));
		lblAmount.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAmount.setBounds(239, 307, 86, 53);
		contentPane.add(lblAmount);
		
		panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(239, 321, 78, 26);
		contentPane.add(panel);
		
		txtApuesta = new JTextField();
		txtApuesta.setBounds(226, 358, 109, 20);
		contentPane.add(txtApuesta);
		txtApuesta.setColumns(10);
		
		lblWinner = new JLabel("WINNER");
		lblWinner.setBounds(239, 245, 78, 20);
		contentPane.add(lblWinner);
		lblWinner.setForeground(new Color(128, 0, 64));
		lblWinner.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(239, 245, 72, 20);
		contentPane.add(panel_4);
		
		JButton Salir = new JButton("EXIT");
		Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainCasaApuestas MenuCasa = new MainCasaApuestas();
				MenuCasa.show();
				dispose();
			}
		});
		Salir.setForeground(new Color(255, 255, 255));
		Salir.setBackground(new Color(128, 0, 64));
		Salir.setBounds(31, 434, 89, 23);
		contentPane.add(Salir);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(new Color(255, 255, 255));
		comboBox.setBackground(new Color(128, 0, 64));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"SELECT MATCH", "ARG VS NED", "CRO VS BRA", "ING VS FRA", "MAR VS POR", "ARG VS BRA", "FRA VS POR", "BRA VS POR", "ARG VS FRA"}));
		comboBox.setBounds(215, 99, 120, 31);
		contentPane.add(comboBox);
		
		txtWINNER = new JTextField();
		txtWINNER.setBounds(226, 276, 99, 20);
		contentPane.add(txtWINNER);
		txtWINNER.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\kolfa\\OneDrive\\Desktop\\Proyecto_POO\\src\\Proyect\\tabla.png"));
		lblNewLabel_1.setBounds(450, 62, 208, 339);
		contentPane.add(lblNewLabel_1);
		
		JButton btnVerApuesta = new JButton("SEE RESULT");
		btnVerApuesta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Persona persona = new Persona(getName(), getName(), null, getTitle(), getWarningString(), getName())
				Apuesta apuesta = new Apuesta();
						
				String select;
				String ganador;
				double CantApuesta = persona.getAmount();
				select = comboBox.getSelectedItem().toString();
				
				if(select.equals("SELECT MATCH"))
				{
					JOptionPane.showMessageDialog(null, "Please select a match.");										
				}
				if(txtWINNER.getText().isEmpty() || txtApuesta.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please select Winner and Insert Coin");
				}
			
				
				else if(select.equals("ARG VS NED")){
					ganador = txtWINNER.getText().toString();
					CantApuesta = Double.parseDouble(txtApuesta.getText());
					if(ganador.equals("ARGENTINA") && CantApuesta == 0)
					{
						JOptionPane.showMessageDialog(null, "Complete the data before continuing, please.");
					}
					
					else if(ganador.equals("ARGENTINA")) {
						
						JOptionPane.showMessageDialog(null, "MARCADOR FINAL: ARG (2)-(1)NED \nGanancia: " + ((CantApuesta * 1.35)- CantApuesta) + "\nApostado: " + CantApuesta + "\nTotal: " + (CantApuesta * 1.35));
					}
					else
					JOptionPane.showMessageDialog(null, "MARCADOR FINAL: ARG (2)-(1)NED \nGanancia: -" + CantApuesta);
				}
			
				
				else if(select.equals("CRO VS BRA")){
					ganador = txtWINNER.getText().toString();
					CantApuesta = Double.parseDouble(txtApuesta.getText());
					if(ganador.equals("BRASIL")) {
						
						JOptionPane.showMessageDialog(null, "MARCADOR FINAL: BRA (5)-(1)CRO \nGanancia: " + ((CantApuesta * 1.19)- CantApuesta) + "\nApostado: " + CantApuesta + "\nTotal: " + (CantApuesta * 1.19));
					}
					else
					JOptionPane.showMessageDialog(null, "MARCADOR FINAL: BRA (5)-(1)CRO \nGanancia: -" + CantApuesta);
				}
			
				else if(select.equals("ING VS FRA")){
					ganador = txtWINNER.getText().toString();
					CantApuesta = Double.parseDouble(txtApuesta.getText());
					if(ganador.equals("FRANCIA")) {
						
						JOptionPane.showMessageDialog(null, "MARCADOR FINAL: ING (1)-(4)FRA \nGanancia: " + ((CantApuesta * 1.79)- CantApuesta) + "\nApostado: " + CantApuesta + "\nTotal: " + (CantApuesta * 1.79));
					}
					else
					JOptionPane.showMessageDialog(null, "MARCADOR FINAL: ING (1)-(4)FRA \nGanancia: -" + CantApuesta);
				}
			
				else if(select.equals("MAR VS POR")){
					ganador = txtWINNER.getText().toString();
					CantApuesta = Double.parseDouble(txtApuesta.getText());
					if(ganador.equals("PORTUGAL")) {
						
						JOptionPane.showMessageDialog(null, "MARCADOR FINAL: MAR (1)-(3)POR \nGanancia: " + ((CantApuesta * 1.54)- CantApuesta) + "\nApostado: " + CantApuesta + "\nTotal: " + (CantApuesta * 1.54));
					}
					else
					JOptionPane.showMessageDialog(null, "MARCADOR FINAL: MAR(1)-(3)POR \nGanancia: -" + CantApuesta);
				}
	
				else if(select.equals("ARG VS BRA")){
					ganador = txtWINNER.getText().toString();
					CantApuesta = Double.parseDouble(txtApuesta.getText());
					if(ganador.equals("ARGENTINA")) {
						
						JOptionPane.showMessageDialog(null, "MARCADOR FINAL: ARG (1)-(0)BRA \nGanancia: " + ((CantApuesta * 2.22)- CantApuesta) + "\nApostado: " + CantApuesta + "\nTotal: " + (CantApuesta * 2.22));
					}
					else
					JOptionPane.showMessageDialog(null, "MARCADOR FINAL: ARG (1)-(0)BRA \nGanancia: -" + CantApuesta);
				}
	
				else if(select.equals("FRA VS POR")){
					ganador = txtWINNER.getText().toString();
					CantApuesta = Double.parseDouble(txtApuesta.getText());
					if(ganador.equals("FRANCIA")) {
						
						JOptionPane.showMessageDialog(null, "MARCADOR FINAL: FRA (1)-(0)POR \nGanancia: " + ((CantApuesta * 3.13)- CantApuesta) + "\nApostado: " + CantApuesta + "\nTotal: " + (CantApuesta * 3.13));
					}
					else
					JOptionPane.showMessageDialog(null, "MARCADOR FINAL: FRA (1)-(0)POR \nGanancia: -" + CantApuesta);
				}
	
				else if(select.equals("BRA VS POR")){
					ganador = txtWINNER.getText().toString();
					CantApuesta = Double.parseDouble(txtApuesta.getText());
					if(ganador.equals("PORTUGAL")) {
						
						JOptionPane.showMessageDialog(null, "MARCADOR FINAL: BRA (1)-(2)POR \nGanancia: " + ((CantApuesta * 2.00)- CantApuesta) + "\nApostado: " + CantApuesta + "\nTotal: " + (CantApuesta * 2.00));
					}
					else
					JOptionPane.showMessageDialog(null, "MARCADOR FINAL: BRA (1)-(2)POR \nGanancia: -" + CantApuesta);
				}
			
				else if(select.equals("ARG VS FRA")){
					ganador = txtWINNER.getText().toString();
					CantApuesta = Double.parseDouble(txtApuesta.getText());
					if(ganador.equals("ARGENTINA")) {
						
						JOptionPane.showMessageDialog(null, "MARCADOR FINAL: ARG (3)-(2)FRA \nGanancia: " + ((CantApuesta * 1.41)- CantApuesta) + "\nApostado: " + CantApuesta + "\nTotal: " + (CantApuesta * 1.41));
					}
					else
					JOptionPane.showMessageDialog(null, "MARCADOR FINAL: ARG (3)-(2)FRA \nGanancia: -" + CantApuesta);
				}
				
			}
		});
		btnVerApuesta.setForeground(Color.WHITE);
		btnVerApuesta.setBackground(new Color(128, 0, 64));
		btnVerApuesta.setBounds(490, 434, 132, 23);
		contentPane.add(btnVerApuesta);
		
		JLabel FONDO = new JLabel("");
		FONDO.setHorizontalAlignment(SwingConstants.LEFT);
		FONDO.setIcon(new ImageIcon("C:\\Users\\kolfa\\OneDrive\\Desktop\\Proyecto_POO\\src\\Proyect\\balon.jpg"));
		FONDO.setBounds(0, 0, 717, 489);
		contentPane.add(FONDO);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
