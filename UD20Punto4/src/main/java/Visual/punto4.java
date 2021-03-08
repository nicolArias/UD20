package Visual;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class punto4 extends JFrame {
	

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblEventos;
	private JTextArea textArea= new JTextArea();;
	
	public punto4() {
		setTitle("Punto 4");
		setBounds(0,0,500,291);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		lblEventos = new JLabel("Eventos");
		lblEventos.setHorizontalAlignment(SwingConstants.CENTER);
		lblEventos.setBounds(10, 100, 92, 31);
		contentPane.add(lblEventos);
		
		//textArea = new JTextArea();
		textArea.setTabSize(20);
		textArea.setBounds(115, 11, 359, 171);
		contentPane.add(textArea);

		
	}


	public void addEventos(Ventana ventana) {
		this.addWindowListener(ventana);
	}
	

	public void setTextArea(String textArea) {
		this.textArea.append(textArea);;
	}
	
	

	
}