package visual;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class Visual extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField tamañoLetras;
	
	public Visual() {
		//caracteristicas JFrame
		setTitle("Bienvenido");
		setBounds(0,0,588,479);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		//JPanel
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		//JLabel
		JLabel eq1 = new JLabel("Soy tu etiqueta");
		eq1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		eq1.setHorizontalAlignment(SwingConstants.CENTER);
		eq1.setBounds(10, 10, 554, 180);
		contentPane.add(eq1);
		
		tamañoLetras = new JTextField();
		tamañoLetras.setBounds(219, 296, 118, 19);
		contentPane.add(tamañoLetras);
		tamañoLetras.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Tamaño de letra");
		lblNewLabel_1.setBounds(219, 273, 96, 13);
		contentPane.add(lblNewLabel_1);
		
		JButton btnLetras = new JButton("Cambiar letras");
		btnLetras.setBounds(219, 342, 118, 21);
		contentPane.add(btnLetras);
		
		ActionListener al = new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				eq1.setFont(new Font("Tahoma",Font.PLAIN, Integer.parseInt(tamañoLetras.getText())));
				
			}
		};
		
		btnLetras.addActionListener(al);
		
	}
}
