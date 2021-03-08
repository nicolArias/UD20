package visual;



import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;



public class Visual extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField num1, resultado;
	private JButton convertir, cambiar, borrar;

	
	/**
	 * Create the frame.
	 */
	public Visual() {
		setTitle("Conversor mejorado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 616, 221);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		num1 = new JTextField();
		num1.setBounds(140, 10, 114, 27);
		contentPane.add(num1);
		
		
		JLabel lblMoneda = new JLabel("Cantidad a convertir");
		lblMoneda.setBounds(29, 17, 101, 13);
		contentPane.add(lblMoneda);
		
		JLabel lblNewLabel = new JLabel("Resultado: ");
		lblNewLabel.setBounds(321, 17, 66, 13);
		contentPane.add(lblNewLabel);
		
		resultado = new JTextField();
		resultado.setBounds(397, 12, 114, 25);
		contentPane.add(resultado);
		
		convertir = new JButton("Ptas a Euros");
		convertir.setBounds(94, 69, 101, 27);
		contentPane.add(convertir);
		
		cambiar = new JButton("Cambiar");
		cambiar.setBounds(223, 69, 101, 27);
		contentPane.add(cambiar);
		
		borrar = new JButton("Borrar");
		borrar.setBounds(354, 69, 101, 27);
		contentPane.add(borrar);
	
	}


	/**
	 * @return the num1
	 */
	public JTextField getNum1() {
		return num1;
	}


	/**
	 * @return the resultado
	 */
	public JTextField getResultado() {
		return resultado;
	}

	/**
	 * @return the convertir
	 */
	public JButton getConvertir() {
		return convertir;
	}


	/**
	 * @return the cambiar
	 */
	public JButton getCambiar() {
		return cambiar;
	}

	/**
	 * @return the borrar
	 */
	public JButton getBorrar() {
		return borrar;
	}

	public void clickCambiar() {
        convertir.doClick();
    }
	
	
}
