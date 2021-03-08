package operaciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.InputMismatchException;

import javax.swing.JOptionPane;

import visual.Visual;

public class Operacion implements ActionListener {

	private Visual v;
	private final double factorE = 166.386;
	private final double factorP = 0.006;
	private DecimalFormat form = new DecimalFormat("0.##");

	public Operacion(Visual v) {
		this.v = v;
	}

	// metodo que incia el programa dandole los listeners a los botones
	public void incio() {
		v.getConvertir().addActionListener(this);
		v.getCambiar().addActionListener(this);
		v.getBorrar().addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// para validar que boton se ha clickado uso la funcion getActionCommand que me
		// dice el nombre del boton que se ha pulsado
		// de esta manera puedes abrupar todos los listeners en la misma funcion

		if (v.getCambiar().getText() == e.getActionCommand()) {
			if (v.getConvertir().getText() == "Ptas a Euros") {
				v.getConvertir().setText("Euros a Ptas");
			} else {
				v.getConvertir().setText("Ptas a Euros");
			}
			v.clickCambiar();
		} else if (v.getConvertir().getText() == e.getActionCommand()) {
			try {
				if (v.getConvertir().getText() == "Ptas a Euros") {
					double result = Integer.parseInt(v.getNum1().getText()) * factorP;
					v.getResultado().setText(form.format(result));
				} else {
					double result = Integer.parseInt(v.getNum1().getText()) * factorE;
					v.getResultado().setText(form.format(result));
				}

			} catch (InputMismatchException e2) {
				JOptionPane.showMessageDialog(null, "Valor erroneo introducido");
			} catch (Exception e3) {
				JOptionPane.showMessageDialog(null, "Valor erroneo introducido");
			}

		} else {
			v.getNum1().setText("");
			v.getResultado().setText("");
		}
	}

}
