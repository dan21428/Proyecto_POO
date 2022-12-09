package Proyect;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Menu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MenuAdmin extends JFrame {

	private JPanel contentPane;
	private JTextField textField_2;
	private JTextField textField_7;
	private JTextField textField_4;
	private JTextField textField_8;
	private JTextField textField_6;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_1;
	private JTextField textField_12;
	private JTextField textField_3;
	private JTextField textField_13;
	private JTextField textField_5;
	private JTextField textField_14;
	private JTextField textField;
	private JTextField textField_15;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuAdmin frame = new MenuAdmin();
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
	public MenuAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 758, 595);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_2 = new JTextField();
		textField_2.setText("    1");
		textField_2.setColumns(10);
		textField_2.setBounds(65, 112, 35, 20);
		contentPane.add(textField_2);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.setBackground(new Color(128, 0, 64));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainCasaApuestas MenuCasa = new MainCasaApuestas();
				MenuCasa.show();
				dispose();
			}
		});
		btnNewButton.setBounds(311, 51, 136, 42);
		contentPane.add(btnNewButton);
		
		JLabel txt1 = new JLabel("");
		txt1.setIcon(new ImageIcon("C:\\Users\\kolfa\\OneDrive\\Desktop\\Proyecto_POO\\src\\Proyect\\1.png"));
		txt1.setBounds(44, 51, 77, 51);
		contentPane.add(txt1);
		
		JLabel txt2 = new JLabel("");
		txt2.setIcon(new ImageIcon("C:\\Users\\kolfa\\OneDrive\\Desktop\\Proyecto_POO\\src\\Proyect\\2.png"));
		txt2.setBounds(44, 142, 77, 51);
		contentPane.add(txt2);
		
		JLabel txt5 = new JLabel("");
		txt5.setIcon(new ImageIcon("C:\\Users\\kolfa\\OneDrive\\Desktop\\Proyecto_POO\\src\\Proyect\\5.png"));
		txt5.setBounds(44, 317, 77, 51);
		contentPane.add(txt5);
		
		JLabel txt6 = new JLabel("");
		txt6.setIcon(new ImageIcon("C:\\Users\\kolfa\\OneDrive\\Desktop\\Proyecto_POO\\src\\Proyect\\6.png"));
		txt6.setBounds(44, 411, 77, 51);
		contentPane.add(txt6);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\kolfa\\OneDrive\\Desktop\\Proyecto_POO\\src\\Proyect\\2.png"));
		lblNewLabel_5.setBounds(154, 185, 77, 51);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\kolfa\\OneDrive\\Desktop\\Proyecto_POO\\src\\Proyect\\6.png"));
		lblNewLabel_6.setBounds(154, 276, 77, 51);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_5_1 = new JLabel("");
		lblNewLabel_5_1.setIcon(new ImageIcon("C:\\Users\\kolfa\\OneDrive\\Desktop\\Proyecto_POO\\src\\Proyect\\2.png"));
		lblNewLabel_5_1.setBounds(277, 238, 77, 51);
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("");
		lblNewLabel_5_1_1.setIcon(new ImageIcon("C:\\Users\\kolfa\\OneDrive\\Desktop\\Proyecto_POO\\src\\Proyect\\4.png"));
		lblNewLabel_5_1_1.setBounds(392, 238, 77, 51);
		contentPane.add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("");
		lblNewLabel_5_2.setIcon(new ImageIcon("C:\\Users\\kolfa\\OneDrive\\Desktop\\Proyecto_POO\\src\\Proyect\\4.png"));
		lblNewLabel_5_2.setBounds(518, 185, 77, 51);
		contentPane.add(lblNewLabel_5_2);
		
		JLabel txt4 = new JLabel("");
		txt4.setIcon(new ImageIcon("C:\\Users\\kolfa\\OneDrive\\Desktop\\Proyecto_POO\\src\\Proyect\\4.png"));
		txt4.setBounds(631, 142, 77, 51);
		contentPane.add(txt4);
		
		JLabel txt3 = new JLabel("");
		txt3.setIcon(new ImageIcon("C:\\Users\\kolfa\\OneDrive\\Desktop\\Proyecto_POO\\src\\Proyect\\3.png"));
		txt3.setBounds(631, 51, 77, 51);
		contentPane.add(txt3);
		
		JLabel lblNewLabel_5_5 = new JLabel("");
		lblNewLabel_5_5.setIcon(new ImageIcon("C:\\Users\\kolfa\\OneDrive\\Desktop\\Proyecto_POO\\src\\Proyect\\8.png"));
		lblNewLabel_5_5.setBounds(518, 276, 77, 51);
		contentPane.add(lblNewLabel_5_5);
		
		JLabel txt7 = new JLabel("");
		txt7.setIcon(new ImageIcon("C:\\Users\\kolfa\\OneDrive\\Desktop\\Proyecto_POO\\src\\Proyect\\7.png"));
		txt7.setBounds(631, 317, 77, 51);
		contentPane.add(txt7);
		
		JLabel txt8 = new JLabel("");
		txt8.setIcon(new ImageIcon("C:\\Users\\kolfa\\OneDrive\\Desktop\\Proyecto_POO\\src\\Proyect\\8.png"));
		txt8.setBounds(631, 411, 77, 51);
		contentPane.add(txt8);
		
		JLabel lblNewLabel_5_1_2 = new JLabel("");
		lblNewLabel_5_1_2.setIcon(new ImageIcon("C:\\Users\\kolfa\\OneDrive\\Desktop\\Proyecto_POO\\src\\Proyect\\6.png"));
		lblNewLabel_5_1_2.setBounds(277, 384, 77, 51);
		contentPane.add(lblNewLabel_5_1_2);
		
		JLabel lblNewLabel_5_1_3 = new JLabel("");
		lblNewLabel_5_1_3.setIcon(new ImageIcon("C:\\Users\\kolfa\\OneDrive\\Desktop\\Proyecto_POO\\src\\Proyect\\8.png"));
		lblNewLabel_5_1_3.setBounds(392, 384, 77, 51);
		contentPane.add(lblNewLabel_5_1_3);
		
		textField_7 = new JTextField();
		textField_7.setText("    2");
		textField_7.setColumns(10);
		textField_7.setBounds(65, 197, 35, 20);
		contentPane.add(textField_7);
		
		textField_4 = new JTextField();
		textField_4.setText("   1");
		textField_4.setColumns(10);
		textField_4.setBounds(176, 246, 35, 20);
		contentPane.add(textField_4);
		
		textField_8 = new JTextField();
		textField_8.setText("    0");
		textField_8.setColumns(10);
		textField_8.setBounds(176, 334, 35, 20);
		contentPane.add(textField_8);
		
		textField_6 = new JTextField();
		textField_6.setText("    1");
		textField_6.setColumns(10);
		textField_6.setBounds(65, 378, 35, 20);
		contentPane.add(textField_6);
		
		textField_9 = new JTextField();
		textField_9.setText("    5");
		textField_9.setColumns(10);
		textField_9.setBounds(65, 472, 35, 20);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setText("    3");
		textField_10.setColumns(10);
		textField_10.setBounds(298, 299, 35, 20);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setText("     2");
		textField_11.setColumns(10);
		textField_11.setBounds(412, 299, 35, 20);
		contentPane.add(textField_11);
		
		textField_1 = new JTextField();
		textField_1.setText("    1");
		textField_1.setColumns(10);
		textField_1.setBounds(298, 442, 35, 20);
		contentPane.add(textField_1);
		
		textField_12 = new JTextField();
		textField_12.setText("    2");
		textField_12.setColumns(10);
		textField_12.setBounds(412, 445, 35, 20);
		contentPane.add(textField_12);
		
		textField_3 = new JTextField();
		textField_3.setText("    1");
		textField_3.setColumns(10);
		textField_3.setBounds(542, 246, 35, 20);
		contentPane.add(textField_3);
		
		textField_13 = new JTextField();
		textField_13.setText("    0");
		textField_13.setColumns(10);
		textField_13.setBounds(542, 334, 35, 20);
		contentPane.add(textField_13);
		
		textField_5 = new JTextField();
		textField_5.setText("     1");
		textField_5.setColumns(10);
		textField_5.setBounds(657, 112, 35, 20);
		contentPane.add(textField_5);
		
		textField_14 = new JTextField();
		textField_14.setText("     4");
		textField_14.setColumns(10);
		textField_14.setBounds(657, 203, 35, 20);
		contentPane.add(textField_14);
		
		textField = new JTextField();
		textField.setText("     1");
		textField.setColumns(10);
		textField.setBounds(657, 381, 35, 20);
		contentPane.add(textField);
		
		textField_15 = new JTextField();
		textField_15.setText("    3");
		textField_15.setColumns(10);
		textField_15.setBounds(657, 472, 35, 20);
		contentPane.add(textField_15);
		
		JLabel lblNewLabel = new JLabel("CHAMPION");
		lblNewLabel.setForeground(new Color(128, 0, 64));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(329, 198, 118, 28);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(323, 197, 112, 28);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(311, 339, 112, 28);
		contentPane.add(panel_1);
		
		JLabel lblrdth = new JLabel("3rd & 4th");
		panel_1.add(lblrdth);
		lblrdth.setForeground(new Color(128, 0, 64));
		lblrdth.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\kolfa\\OneDrive\\Desktop\\Proyecto_POO\\src\\Proyect\\fondo.jpg"));
		lblNewLabel_1.setBounds(0, 0, 771, 562);
		contentPane.add(lblNewLabel_1);
		
		//ImageIcon icon = new ImageIcon(getClass().getResource("image.jpg"));
		//ImageIcon img = new ImageIcon(icon.getImage().getScaledInstance(lblNewLabel_3.getWidth(), lblNewLabel_3.getHeight(), Image.SCALE_SMOOTH));
		
		
		
	
	}
}
