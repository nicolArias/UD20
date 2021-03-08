package Visual;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ventana implements WindowListener {
	
	private punto4 punto4;
	
	public Ventana(punto4 p4) {
		this.punto4=p4;
	}
	@Override
	public void windowOpened(WindowEvent e) {
		punto4.setTextArea("\nVentana Abierta");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		punto4.setTextArea("\nCerrando ventana");
		System.out.println("La ventana se ha cerrado");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		punto4.setTextArea("\nVentana cerrada");
		System.out.println("La ventana se ha cerrado");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		punto4.setTextArea("\nVentana minimizada");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		punto4.setTextArea("\nVentana maximizada");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		punto4.setTextArea("\nLa ventana esta activa");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		punto4.setTextArea("\nLa ventana no esta activa, falta el foco");
		
	}

}
