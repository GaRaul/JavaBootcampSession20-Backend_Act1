package vista;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField tfFuente;

	/**
	 * Launch the application.
	 */
	public static void vista() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 804, 495);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfFuente = new JTextField();
		tfFuente.setBounds(350, 29, 86, 20);
		contentPane.add(tfFuente);
		tfFuente.setColumns(10);
		
		JLabel lblEtiqueta = new JLabel("HOLA MUNDO");
		lblEtiqueta.setBounds(10, 86, 768, 359);
		lblEtiqueta.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblEtiqueta);
		
		JLabel lblFuente = new JLabel("Introduce el tamaño de la fuente:");
		lblFuente.setBounds(92, 32, 227, 14);
		contentPane.add(lblFuente);
		
		JButton btnAplicar = new JButton("Aplicar");
		btnAplicar.setBounds(350, 60, 86, 23);
		btnAplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int fontSize = Integer.valueOf(tfFuente.getText());
					lblEtiqueta.setFont(new Font("Tahoma", Font.PLAIN, fontSize));
				} catch (Exception ex) {
					System.out.println(ex);
				}	
				
			}
		});
		contentPane.add(btnAplicar);
		setTitle("Ventana funciones basicas");
	}
}
