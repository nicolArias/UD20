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
	private JTextField textField_2;

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
		setTitle("Indice de masa corporal");
		setBounds(400,200,650,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		etiqueta = new JLabel("Altura (metros)");
		etiqueta.setBounds(29,62,98,20);
		contentPane.add(etiqueta);
		
		textField = new JTextField();
		textField.setBounds(126, 62, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Peso (kg)");
		lblNewLabel.setBounds(252, 65, 65, 14);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(327, 62, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("IMC");
		lblNewLabel_1.setBounds(268, 106, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(327, 103, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular IMC");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double imc = Double.parseDouble(textField_1.getText()) / (Double.parseDouble(textField.getText())*Double.parseDouble(textField.getText()));
				textField_2.setText(""+(double) Math.round(imc*100)/100);
			}
		});
		btnNewButton.setBounds(123, 102, 117, 23);
		contentPane.add(btnNewButton);
	}
}
