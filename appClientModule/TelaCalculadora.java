import javax.swing.*;

public class TelaCalculadora extends JFrame{

	private static final long serialVersionUID = 1L;
	
	JLabel lblNum1, lblNum2, lblTitle, lblNum3;
	JTextField txtNum1, txtNum2, txtNum3;
	
	JButton btnSomar, btnSubtracao,btnMultiplica,btnDivisao;
	
	
	public TelaCalculadora() {
		setTitle("Calculadora");
		setSize(450, 350);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		lblTitle = new JLabel("Calculadora");
		lblTitle.setBounds(180, 10, 200, 30);
		add(lblTitle);
		
		lblNum1 = new JLabel("Numero 1");
		lblNum1.setBounds(70, 50, 200, 30);
		add(lblNum1);
		
		txtNum1 = new JTextField();
		txtNum1.setBounds(130, 50, 200, 30);
		add(txtNum1);
		
		lblNum2 = new JLabel("Numero 2");
		lblNum2.setBounds(70, 90, 200, 30);
		add(lblNum2);
		
		txtNum2 = new JTextField();
		txtNum2.setBounds(130, 90, 200, 30);
		add(txtNum2);
		
		btnSomar = new JButton("+");
		btnSomar.setBounds(60, 180, 70, 30);
		add(btnSomar);
		
		btnSubtracao = new JButton("-");
		btnSubtracao.setBounds(140, 180, 70, 30);
		add(btnSubtracao);
		
		btnMultiplica = new JButton("X");
		btnMultiplica.setBounds(220, 180, 70, 30);
		add(btnMultiplica);
		
		btnDivisao = new JButton("/");
		btnDivisao.setBounds(300, 180, 70, 30);
		add(btnDivisao);
		
		lblNum3 = new JLabel("Resultado");
		lblNum3.setBounds(70, 130, 200, 30);
		add(lblNum3);
		
		txtNum3 = new JTextField();
		txtNum3.setBounds(130, 130, 200, 30);
		txtNum3.setEditable(false);
		add(txtNum3);
		
		
	Controladores controller = new Controladores(
		txtNum1,
		txtNum2,
		txtNum3);
	
	btnSomar.addActionListener(controller.soma());
	btnSubtracao.addActionListener(controller.subtrai());
	btnMultiplica.addActionListener(controller.multiplica());
	btnDivisao.addActionListener(controller.divisao());
		
	}

	public static void main(String[] args) {
		TelaCalculadora tela = new TelaCalculadora();
		tela.setVisible(true);
	}

}
