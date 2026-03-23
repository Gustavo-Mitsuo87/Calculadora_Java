import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controladores {
	private JTextField txtNum1;
	private JTextField txtNum2;
	private JTextField txtNum3;

	public Controladores(JTextField txtNum1, JTextField txtNum2, JTextField txtNum3) {
		this.txtNum1 = txtNum1;
		this.txtNum2 = txtNum2;
		this.txtNum3 = txtNum3;
	}

	public ActionListener soma() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String num1 = txtNum1.getText();
				String num2 = txtNum2.getText();

				if (!num1.isEmpty() && !num2.isEmpty()) {
					try {
						double numero1 = Double.parseDouble(num1);
						double numero2 = Double.parseDouble(num2);
						double result = numero1 + numero2;
						String res = Double.toString(result);
						txtNum3.setText(res);
					} catch (NumberFormatException ex) {
						txtNum3.setText("Digite apenas números");
					}
				} else {
					txtNum3.setText("Digite algum número!");
				}
			}
		};
	}

	public ActionListener subtrai() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String num1 = txtNum1.getText();
				String num2 = txtNum2.getText();

				if (!num1.isEmpty() && !num2.isEmpty()) {
					try {
						double numero1 = Double.parseDouble(num1);
						double numero2 = Double.parseDouble(num2);
						double result = numero1 - numero2;
						String res = Double.toString(result);
						txtNum3.setText(res);
					} catch (NumberFormatException ex) {
						txtNum3.setText("Digite apenas números");
					}
				} else {
					txtNum3.setText("Digite algum número!");
				}
			}
		};
	}

	public ActionListener multiplica() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String num1 = txtNum1.getText();
				String num2 = txtNum2.getText();

				if (!num1.isEmpty() && !num2.isEmpty()) {
					try {
						double numero1 = Double.parseDouble(num1);
						double numero2 = Double.parseDouble(num2);
						double result = numero1 * numero2;
						String res = Double.toString(result);
						txtNum3.setText(res);
					} catch (NumberFormatException ex) {
						txtNum3.setText("Digite apenas números");
					}
				} else {
					txtNum3.setText("Digite algum número!");
				}
			}
		};
	}

	public ActionListener divisao() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String num1 = txtNum1.getText();
				String num2 = txtNum2.getText();

				if (!num1.isEmpty() && !num2.isEmpty()) {
					try {
						double numero1 = Double.parseDouble(num1);
						double numero2 = Double.parseDouble(num2);
						if (numero2 == 0) {
							txtNum3.setText("Divisão por zero!");
						} else {
							double result = numero1 / numero2;
							String res = Double.toString(result);
							txtNum3.setText(res);
						}
					} catch (NumberFormatException ex) {
						txtNum3.setText("Digite apenas números");
					}
				} else {
					txtNum3.setText("Digite algum número!");
				}
			}
		};
	}
}
