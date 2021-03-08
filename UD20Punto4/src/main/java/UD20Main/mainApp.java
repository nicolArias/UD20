package UD20Main;

import Visual.Ventana;
import Visual.punto4;

public class mainApp {
	public static void main(String[] args) {
		punto4 p4=new punto4();
		Ventana ventana=new Ventana(p4);
		p4.addEventos(ventana);
	}
}
