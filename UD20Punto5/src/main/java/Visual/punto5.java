package Visual;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class punto5 extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea textArea;
	private JButton btnLimpiar;
	
	public punto5() {
		setTitle("Punto 5");
		setBounds(0,0,500,291);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		btnLimpiar = new JButton();
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("");
			}
		});
		btnLimpiar.setBounds(171, 21, 120, 25);
		btnLimpiar.setText("Limpiar");
		contentPane.add(btnLimpiar);
		
		textArea = new JTextArea();
		textArea.setTabSize(20);
		textArea.setBounds(32, 57, 424, 171);
		contentPane.add(textArea);
		
		eventos();
	}
	
	public void eventos() {
		textArea.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textArea.append("\nEl usuario dio clic");	
			}
			@Override
			public void mousePressed(MouseEvent e) {
				textArea.append("\nEl botón izquierdo esta presionado");
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				textArea.append("\nEl boton se solto");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				textArea.append("\nEl curso se encuentra al limite de los componentes");
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				textArea.append("\nEl curso salio dentro de los limites del componente");
				
			}
			
		});
	}	
}