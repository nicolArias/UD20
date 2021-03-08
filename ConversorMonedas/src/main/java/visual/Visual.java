package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Visual extends JFrame {

	private JPanel contentPane;
	private JLabel etiqueta;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Visual frame = new Visual();
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
	public Visual() {
		setTitle("Calculadora cambio de monedas");
		setBounds(400,200,650,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		etiqueta = new JLabel("Cantidad a convertir:");
		etiqueta.setBounds(42,62,126,20);
		contentPane.add(etiqueta);
		
		textField = new JTextField();
		textField.setBounds(170, 62, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Resultado:");
		lblNewLabel.setBounds(296, 65, 65, 14);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(371, 62, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		final JButton btnNewButton = new JButton("Euros a ptas");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double res;
				if(btnNewButton.getText().equals("Euros a ptas")) {
					res = (double) Math.round(Double.parseDouble(textField.getText())*16638.6)/100;		
				} else {
					res = (double) Math.round(Double.parseDouble(textField.getText())*0.6)/100;
				}
				
				textField_1.setText(""+res);
			}
		});
		btnNewButton.setBounds(167, 102, 117, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Cambiar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnNewButton.getText().equals("Euros a ptas")) {
					btnNewButton.setText("Ptas a euros");	
				} else {
					btnNewButton.setText("Euros a ptas");	
				}
				btnNewButton.doClick();
				
			}
		});
		btnNewButton_1.setBounds(309, 102, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
