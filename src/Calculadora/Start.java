package Calculadora;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Start {

	private JFrame frame;
	private JTextField pantalla;
	private boolean comienzo;
	private double valor, resultado;
	private String operacion = "";
	private int contador;
	private JButton suma, resta, multiplicar, dividir, igual, par, reset, numero1, numero2, numero3, numero4, numero5,
			numero6, numero7, numero8, numero9, numero0;
	private ArrayList<JButton> buttonList = new ArrayList<JButton>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start window = new Start();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Start() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit()
				.getImage("C:\\Users\\carli\\OneDrive\\Documentos\\1. CursoJava\\UF1_DI_ACT1\\imagenes\\226777.png"));
		frame.setBounds(100, 100, 528, 655);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		pantalla = new JTextField();
		pantalla.setHorizontalAlignment(SwingConstants.CENTER);

		pantalla.setBounds(46, 37, 428, 67);
		frame.getContentPane().add(pantalla);
		pantalla.setColumns(10);

		numero1 = new JButton("1");
		buttonList.add(numero1);
		numero1.setBounds(46, 237, 75, 58);
		frame.getContentPane().add(numero1);
		numero1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String entrada = e.getActionCommand();

				if (comienzo) {

					pantalla.setText(entrada);

					comienzo = false;
				} else {
					pantalla.setText(pantalla.getText() + entrada);
				}

				valor = Double.parseDouble(pantalla.getText());
			}
		});

		numero2 = new JButton("2");
		buttonList.add(numero2);
		numero2.setBounds(152, 237, 75, 58);
		frame.getContentPane().add(numero2);
		numero2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String entrada = e.getActionCommand();

				if (comienzo) {

					pantalla.setText(entrada);

					comienzo = false;
				} else {
					pantalla.setText(pantalla.getText() + entrada);
				}

				valor = Double.parseDouble(pantalla.getText());
			}
		});

		numero3 = new JButton("3");
		buttonList.add(numero3);
		numero3.setBounds(260, 237, 75, 58);
		frame.getContentPane().add(numero3);
		numero3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String entrada = e.getActionCommand();

				if (comienzo) {

					pantalla.setText(entrada);

					comienzo = false;
				} else {
					pantalla.setText(pantalla.getText() + entrada);
				}

				valor = Double.parseDouble(pantalla.getText());
			}
		});

		numero4 = new JButton("4");
		buttonList.add(numero4);
		numero4.setBounds(46, 323, 75, 58);
		frame.getContentPane().add(numero4);
		numero4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String entrada = e.getActionCommand();

				if (comienzo) {

					pantalla.setText(entrada);

					comienzo = false;
				} else {
					pantalla.setText(pantalla.getText() + entrada);
				}

				valor = Double.parseDouble(pantalla.getText());
			}
		});

		numero5 = new JButton("5");
		buttonList.add(numero5);
		numero5.setBounds(152, 323, 75, 58);
		frame.getContentPane().add(numero5);
		numero5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String entrada = e.getActionCommand();

				if (comienzo) {

					pantalla.setText(entrada);

					comienzo = false;
				} else {
					pantalla.setText(pantalla.getText() + entrada);
				}

				valor = Double.parseDouble(pantalla.getText());
			}
		});

		numero6 = new JButton("6");
		buttonList.add(numero6);
		numero6.setBounds(260, 323, 75, 58);
		frame.getContentPane().add(numero6);
		numero6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String entrada = e.getActionCommand();

				if (comienzo) {

					pantalla.setText(entrada);

					comienzo = false;
				} else {
					pantalla.setText(pantalla.getText() + entrada);
				}

				valor = Double.parseDouble(pantalla.getText());
			}
		});

		numero7 = new JButton("7");
		buttonList.add(numero7);
		numero7.setBounds(46, 404, 75, 58);
		frame.getContentPane().add(numero7);
		numero7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String entrada = e.getActionCommand();

				if (comienzo) {

					pantalla.setText(entrada);

					comienzo = false;
				} else {
					pantalla.setText(pantalla.getText() + entrada);
				}

				valor = Double.parseDouble(pantalla.getText());
			}
		});

		numero8 = new JButton("8");
		buttonList.add(numero8);
		numero8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String entrada = e.getActionCommand();

				if (comienzo) {

					pantalla.setText(entrada);

					comienzo = false;
				} else {
					pantalla.setText(pantalla.getText() + entrada);
				}

				valor = Double.parseDouble(pantalla.getText());
			}
		});
		numero8.setBounds(152, 404, 75, 58);
		frame.getContentPane().add(numero8);

		numero9 = new JButton("9");
		buttonList.add(numero9);
		numero9.setBounds(260, 404, 75, 58);
		frame.getContentPane().add(numero9);
		numero9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String entrada = e.getActionCommand();

				if (comienzo) {

					pantalla.setText(entrada);

					comienzo = false;
				} else {
					pantalla.setText(pantalla.getText() + entrada);
				}

				valor = Double.parseDouble(pantalla.getText());
			}
		});

		numero0 = new JButton("0");
		buttonList.add(numero0);
		numero0.setBounds(46, 490, 75, 58);
		frame.getContentPane().add(numero0);
		numero0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String entrada = e.getActionCommand();

				if (comienzo) {

					pantalla.setText(entrada);

					comienzo = false;
				} else {
					pantalla.setText(pantalla.getText() + entrada);
				}

				valor = Double.parseDouble(pantalla.getText());
			}
		});

		suma = new JButton("+");
		buttonList.add(suma);
		suma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

					String operacionPulsada = e.getActionCommand();

					valor = Double.parseDouble(pantalla.getText());

					if (operacionPulsada.equals("+")) {

						suma.setEnabled(false);
						resta.setEnabled(false);
						multiplicar.setEnabled(false);
						dividir.setEnabled(false);

						resultado += valor;

						pantalla.setText("" + resultado);

						operacion = "+";

					}

					comienzo = true;

				} catch (Exception e1) {

					disableButton();
					pantalla.setText("Error");
				}
			}
		});
		suma.setBounds(399, 237, 75, 58);
		frame.getContentPane().add(suma);

		resta = new JButton("-");
		buttonList.add(resta);
		resta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String operacionPulsada = e.getActionCommand();

					valor = Double.parseDouble(pantalla.getText());

					if (operacionPulsada.equals("-")) {

						suma.setEnabled(false);
						resta.setEnabled(false);
						multiplicar.setEnabled(false);
						dividir.setEnabled(false);

						if (contador == 0)

							resultado = valor;

						pantalla.setText("" + resultado);

						operacion = "-";

						contador++;
					}

					comienzo = true;

				} catch (Exception e1) {

					disableButton();
					pantalla.setText("Error");

				}
			}
		});

		resta.setBounds(399, 323, 75, 58);
		frame.getContentPane().add(resta);

		multiplicar = new JButton("x");
		buttonList.add(multiplicar);
		multiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String operacionPulsada = e.getActionCommand();

				try {

					valor = Double.parseDouble(pantalla.getText());

					if (operacionPulsada.equals("x")) {

						suma.setEnabled(false);
						resta.setEnabled(false);
						multiplicar.setEnabled(false);
						dividir.setEnabled(false);

						if (contador == 0)

							resultado = valor;

						pantalla.setText("" + resultado);

						operacion = "x";

						contador++;
					}

					comienzo = true;

				}

				catch (Exception e1) {

					disableButton();
					pantalla.setText("Error");
				}
			}
		});
		multiplicar.setBounds(399, 404, 75, 58);
		frame.getContentPane().add(multiplicar);

		dividir = new JButton("/");
		buttonList.add(dividir);
		dividir.addActionListener(e -> {

			String operacionPulsada = e.getActionCommand();

			try {

				if (operacionPulsada.equals("/")) {

					suma.setEnabled(false);
					resta.setEnabled(false);
					multiplicar.setEnabled(false);
					dividir.setEnabled(false);

					valor = Double.parseDouble(pantalla.getText());
					resultado = valor;

					pantalla.setText("" + resultado);

					operacion = "/";

					contador++;

					comienzo = true;
				}
			}

			catch (Exception e1) {

				disableButton();
				pantalla.setText("Error");

			}

		});
		dividir.setBounds(399, 490, 75, 58);
		frame.getContentPane().add(dividir);

		igual = new JButton("=");
		buttonList.add(igual);
		igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {

					valor = Double.parseDouble(pantalla.getText());

					if (operacion.equals("+"))
						resultado += valor;

					if (operacion.equals("-"))
						resultado -= valor;

					if (operacion.equals("x"))
						resultado *= valor;

					if (operacion.equals("/")) {

						resultado /= valor;
						operacion = "/";

					}
					if (valor == 0)

						pantalla.setText("Indeterminado");

					else {

						pantalla.setText("" + resultado);

					}

					contador = 0;
					valor = 0;
					comienzo = true;

				} catch (Exception e4) {

					pantalla.setText("Error");
					disableButton();

				}
			}
		});
		igual.setBounds(152, 490, 183, 58);
		frame.getContentPane().add(igual);

		par = new JButton("Par");
		buttonList.add(par);
		par.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String operacionPulsada = e.getActionCommand();

				try {

					valor = Double.parseDouble(pantalla.getText());

					if (operacionPulsada.equals("Par")) {

						if (valor % 2 == 0) {

							pantalla.setText("Par");

							disableButton();

						} else {

							pantalla.setText("Impar");

							disableButton();

						}
						contador = 0;
						valor = 0;
						resultado = 0;
					}
				} catch (Exception e1) {
					pantalla.setText("Error");
				}

			}
		});
		par.setBounds(152, 153, 75, 58);
		frame.getContentPane().add(par);

		reset = new JButton("C");
		buttonList.add(reset);
		prepareButton(buttonList);
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String operacionPulsada = e.getActionCommand();

				pantalla.setText("");
				contador = 0;
				operacion = "";
				valor = 0;
				resultado = 0;

				if (operacionPulsada.equals("C")) {

					par.setEnabled(true);
					suma.setEnabled(true);
					resta.setEnabled(true);
					multiplicar.setEnabled(true);
					dividir.setEnabled(true);
					igual.setEnabled(true);
					numero1.setEnabled(true);
					numero2.setEnabled(true);
					numero3.setEnabled(true);
					numero4.setEnabled(true);
					numero5.setEnabled(true);
					numero6.setEnabled(true);
					numero7.setEnabled(true);
					numero8.setEnabled(true);
					numero9.setEnabled(true);
					numero9.setEnabled(true);
					numero0.setEnabled(true);

				}

			}

		});
		reset.setBounds(46, 153, 75, 58);
		frame.getContentPane().add(reset);

	}

	private void prepareButton(ArrayList<JButton> buttonList2) {

		buttonList2.forEach(e -> {
			e.setFont(new Font("Tahoma", Font.PLAIN, 23));

		});
		pantalla.setFont(new Font("Tahoma", Font.PLAIN, 23));
	}

	private void disableButton() {

		par.setEnabled(false);
		suma.setEnabled(false);
		resta.setEnabled(false);
		multiplicar.setEnabled(false);
		dividir.setEnabled(false);
		igual.setEnabled(false);
		numero1.setEnabled(false);
		numero2.setEnabled(false);
		numero3.setEnabled(false);
		numero4.setEnabled(false);
		numero5.setEnabled(false);
		numero6.setEnabled(false);
		numero7.setEnabled(false);
		numero8.setEnabled(false);
		numero9.setEnabled(false);
		numero9.setEnabled(false);
		numero0.setEnabled(false);

	}

}
