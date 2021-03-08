package visual;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Visual extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int i = 0, x = 0;
	
	public Visual() {
		setTitle("Contador");
		setBounds(0,0,500,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Boton1: ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(51, 30, 92, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Boton2: ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(261, 34, 60, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel btn1_result = new JLabel(Integer.toString(i)+" veces");
		btn1_result.setBounds(124, 39, 45, 13);
		contentPane.add(btn1_result);
		
		JLabel btn2_result = new JLabel(Integer.toString(x)+" veces");
		btn2_result.setBounds(317, 39, 45, 13);
		contentPane.add(btn2_result);
		
		JButton btnNewButton = new JButton("Boton1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				btn1_result.setText(Integer.toString(i)+" veces");
			}
		});
		btnNewButton.setBounds(98, 189, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Boton2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x++;
				btn2_result.setText(Integer.toString(x)+" veces");
			}
		});
		btnNewButton_1.setBounds(209, 189, 85, 21);
		contentPane.add(btnNewButton_1);
	}

}
