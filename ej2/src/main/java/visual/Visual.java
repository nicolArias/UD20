package visual;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Visual extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public Visual() {
		setTitle("Ventana con interaccion");
		setBounds(0,0,715,221);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Has puslado el boton:");
		lblNewLabel.setBounds(10, 21, 134, 28);
		contentPane.add(lblNewLabel);
		
		JLabel result = new JLabel("");
		result.setBounds(154, 28, 58, 21);
		contentPane.add(result);
		
		JButton btn1 = new JButton("Boton1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(btn1.getText());
			}
		});
		btn1.setBounds(269, 25, 85, 21);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("Boton2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(btn2.getText());
			}
		});
		btn2.setBounds(400, 25, 85, 21);
		contentPane.add(btn2);
	}

}
