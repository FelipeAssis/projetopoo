package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.ButtonClienteController;

public class TelaCliente extends JFrame {

	public JFrame frmCliente;
	private JTextField tfCPF;
	private JTextField tfRG;
	private JTextField tfNome;
	private JTextField tfTelefone;
	private JTextField tfEmail;
	private JTextField tfCEP;
	private JTextField tfNumero;
	private JTextField tfLogradouro;
	private JTextField tfBairro;
	private JTextField tfEstado;
	private JTextField tfCidade;

	/**
	 * Launch the application.
	 */
	// public static void main(String[] args) {
	// EventQueue.invokeLater(new Runnable() {
	// public void run() {
	// try {
	// TelaCliente window = new TelaCliente();
	// window.frmCliente.setVisible(true);
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }
	// });
	// }

	/**
	 * Create the application.
	 */
	public TelaCliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCliente = new JFrame();
		frmCliente.setTitle("Cliente");
		frmCliente.setBounds(100, 100, 457, 374);
		frmCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCliente.getContentPane().setLayout(null);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(122, 11, 89, 23);
		frmCliente.getContentPane().add(btnSalvar);

		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(221, 11, 89, 23);
		frmCliente.getContentPane().add(btnEditar);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(320, 11, 89, 23);
		frmCliente.getContentPane().add(btnExcluir);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(16, 69, 46, 14);
		frmCliente.getContentPane().add(lblNome);

		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(16, 105, 32, 14);
		frmCliente.getContentPane().add(lblCpf);

		tfCPF = new JTextField();
		tfCPF.setBounds(58, 102, 137, 20);
		frmCliente.getContentPane().add(tfCPF);
		tfCPF.setColumns(10);

		JLabel lblRg = new JLabel("RG:");
		lblRg.setBounds(248, 105, 25, 14);
		frmCliente.getContentPane().add(lblRg);

		tfRG = new JTextField();
		tfRG.setBounds(272, 102, 137, 20);
		frmCliente.getContentPane().add(tfRG);
		tfRG.setColumns(10);

		tfNome = new JTextField();
		tfNome.setBounds(58, 66, 351, 20);
		frmCliente.getContentPane().add(tfNome);
		tfNome.setColumns(10);

		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(16, 144, 60, 14);
		frmCliente.getContentPane().add(lblTelefone);

		tfTelefone = new JTextField();
		tfTelefone.setBounds(73, 141, 111, 20);
		frmCliente.getContentPane().add(tfTelefone);
		tfTelefone.setColumns(10);

		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(189, 144, 44, 14);
		frmCliente.getContentPane().add(lblEmail);

		tfEmail = new JTextField();
		tfEmail.setBounds(237, 141, 172, 20);
		frmCliente.getContentPane().add(tfEmail);
		tfEmail.setColumns(10);

		JLabel lblCep = new JLabel("CEP:");
		lblCep.setBounds(16, 181, 32, 14);
		frmCliente.getContentPane().add(lblCep);

		tfCEP = new JTextField();
		tfCEP.setBounds(58, 178, 111, 20);
		frmCliente.getContentPane().add(tfCEP);
		tfCEP.setColumns(10);

		JLabel lblNumero = new JLabel("N\u00FAmero:");
		lblNumero.setBounds(285, 181, 54, 14);
		frmCliente.getContentPane().add(lblNumero);

		tfNumero = new JTextField();
		tfNumero.setBounds(349, 178, 60, 20);
		frmCliente.getContentPane().add(tfNumero);
		tfNumero.setColumns(10);

		JButton btnHome = new JButton("Home");
		btnHome.setBounds(23, 11, 89, 23);
		frmCliente.getContentPane().add(btnHome);

		JLabel lblNewLabel = new JLabel("Logradouro:");
		lblNewLabel.setBounds(16, 216, 72, 14);
		frmCliente.getContentPane().add(lblNewLabel);

		tfLogradouro = new JTextField();
		tfLogradouro.setEditable(false);
		tfLogradouro.setBounds(98, 213, 311, 20);
		frmCliente.getContentPane().add(tfLogradouro);
		tfLogradouro.setColumns(10);

		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(16, 255, 46, 14);
		frmCliente.getContentPane().add(lblBairro);

		tfBairro = new JTextField();
		tfBairro.setEditable(false);
		tfBairro.setBounds(73, 252, 138, 20);
		frmCliente.getContentPane().add(tfBairro);
		tfBairro.setColumns(10);

		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(221, 255, 46, 14);
		frmCliente.getContentPane().add(lblEstado);

		tfEstado = new JTextField();
		tfEstado.setEditable(false);
		tfEstado.setBounds(272, 252, 99, 20);
		frmCliente.getContentPane().add(tfEstado);
		tfEstado.setColumns(10);

		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(16, 294, 46, 14);
		frmCliente.getContentPane().add(lblCidade);

		tfCidade = new JTextField();
		tfCidade.setEditable(false);
		tfCidade.setBounds(73, 291, 138, 20);
		frmCliente.getContentPane().add(tfCidade);
		tfCidade.setColumns(10);

		JButton btnProcura = new JButton("Procura");
		btnProcura.setBounds(178, 177, 95, 23);
		frmCliente.getContentPane().add(btnProcura);

		ButtonClienteController btnCliCon = new ButtonClienteController(btnHome, btnSalvar, btnEditar, btnExcluir,
				btnProcura, frmCliente, tfBairro, tfCEP, tfCidade, tfCPF, tfEmail, tfEstado, tfLogradouro, tfNome,
				tfNumero, tfRG, tfTelefone);

		btnHome.addActionListener(btnCliCon);
		btnSalvar.addActionListener(btnCliCon);
		btnExcluir.addActionListener(btnCliCon);
		btnEditar.addActionListener(btnCliCon);
		btnProcura.addActionListener(btnCliCon);
	}
}
