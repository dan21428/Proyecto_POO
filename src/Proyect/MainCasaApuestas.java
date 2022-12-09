package Proyect;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;

public class MainCasaApuestas extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField txtContra;
	private JLabel ImagenFondo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainCasaApuestas frame = new MainCasaApuestas();
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
	public MainCasaApuestas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 589, 528);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtContra = new JTextField();
		txtContra.setColumns(10);
		txtContra.setBounds(65, 174, 86, 20);
		contentPane.add(txtContra);
		
		JLabel Usuario = new JLabel("USER:");
		Usuario.setFont(new Font("Tahoma", Font.BOLD, 11));
		Usuario.setForeground(new Color(128, 0, 64));
		Usuario.setBounds(92, 62, 47, 29);
		contentPane.add(Usuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(65, 103, 86, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel Contra = new JLabel("PASSWORD:");
		Contra.setFont(new Font("Tahoma", Font.BOLD, 11));
		Contra.setForeground(new Color(128, 0, 64));
		Contra.setBounds(72, 134, 79, 29);
		contentPane.add(Contra);
		
		JButton btnBotonInicioSesion = new JButton("LOGIN");
		btnBotonInicioSesion.setBackground(new Color(128, 0, 64));
		btnBotonInicioSesion.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnBotonInicioSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtUsuario.getText().equals("ADMIN") && txtContra.getText().equals("pass12345")) {
					MenuAdmin AdminMenu= new MenuAdmin();
					AdminMenu.show();
					dispose();
				}
				else if(txtUsuario.getText().equals("JORDAN") && txtContra.getText().equals("wallstreet14")) {
				MenuUsuario UsuarioMenu = new MenuUsuario();
				UsuarioMenu.show();
				dispose();
				}
				else if(txtUsuario.getText().isEmpty() || txtContra.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please enter any Username or any Password >:0");
				}
				else{
					JOptionPane.showMessageDialog(null, "Invalid Username or Password ");
				}
			}
		});
		btnBotonInicioSesion.setForeground(new Color(255, 255, 255));
		btnBotonInicioSesion.setBounds(54, 254, 113, 38);
		contentPane.add(btnBotonInicioSesion);
		
		JLabel lblNewLabel_3 = new JLabel("PROYECT BROS");
		lblNewLabel_3.setFont(new Font("Dubai", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3.setForeground(new Color(128, 0, 64));
		lblNewLabel_3.setBounds(54, 23, 113, 28);
		contentPane.add(lblNewLabel_3);
		
		ImagenFondo = new JLabel("");
		ImagenFondo.setIcon(new ImageIcon("C:\\Users\\kolfa\\OneDrive\\Desktop\\Proyecto_POO\\src\\Proyect\\image.jpg"));
		ImagenFondo.setBounds(81, 0, 492, 489);
		contentPane.add(ImagenFondo);
		
		JEditorPane LosBros = new JEditorPane();
		LosBros.setFont(new Font("Magneto", Font.BOLD, 12));
		LosBros.setText("By:\r\nDaniel Arias\r\nEdison Garcia\r\nSergio Velasquez");
		LosBros.setBounds(10, 401, 141, 77);
		contentPane.add(LosBros);
		
	
		
		
		
	
	}
}
