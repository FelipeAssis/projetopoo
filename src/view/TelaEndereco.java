package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.ButtonEnderecoController;

public class TelaEndereco extends javax.swing.JFrame {

	public JFrame frmEndereco;
	private JTextField tfLogradouro;
	private JTextField tfCEP;
	private JTextField tfBairro;
	private JTextField tfCidade;
	private JTextField tfEstado;

	/**
	 * Launch the application.
	 */
	// public static void main(String[] args) {
	// EventQueue.invokeLater(new Runnable() {
	// public void run() {
	// try {
	// TelaEndereco window = new TelaEndereco();
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
	public TelaEndereco() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEndereco = new JFrame();
		frmEndereco.setResizable(false);
		frmEndereco.setTitle("Endereco");
		frmEndereco.setBounds(100, 100, 460, 319);
		frmEndereco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEndereco.getContentPane().setLayout(null);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(122, 11, 89, 23);
		frmEndereco.getContentPane().add(btnSalvar);

		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(221, 11, 89, 23);
		frmEndereco.getContentPane().add(btnEditar);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(320, 11, 89, 23);
		frmEndereco.getContentPane().add(btnExcluir);

		JButton btnHome = new JButton("Home");
		btnHome.setBounds(23, 11, 89, 23);
		frmEndereco.getContentPane().add(btnHome);

		JLabel lblLogradouro = new JLabel("Logradouro:");
		lblLogradouro.setBounds(23, 72, 71, 14);
		frmEndereco.getContentPane().add(lblLogradouro);

		tfLogradouro = new JTextField();
		tfLogradouro.setBounds(104, 69, 305, 20);
		frmEndereco.getContentPane().add(tfLogradouro);
		tfLogradouro.setColumns(10);

		JLabel lblCep = new JLabel("CEP:");
		lblCep.setBounds(23, 108, 46, 14);
		frmEndereco.getContentPane().add(lblCep);

		tfCEP = new JTextField();
		tfCEP.setBounds(59, 105, 99, 20);
		frmEndereco.getContentPane().add(tfCEP);
		tfCEP.setColumns(10);

		JLabel lblCidade = new JLabel("Estado:");
		lblCidade.setBounds(177, 108, 46, 14);
		frmEndereco.getContentPane().add(lblCidade);

		JLabel lblNewLabel = new JLabel("Bairro:");
		lblNewLabel.setBounds(23, 148, 46, 14);
		frmEndereco.getContentPane().add(lblNewLabel);

		tfBairro = new JTextField();
		tfBairro.setBounds(69, 145, 241, 20);
		frmEndereco.getContentPane().add(tfBairro);
		tfBairro.setColumns(10);

		JLabel lblCidade_1 = new JLabel("Cidade:");
		lblCidade_1.setBounds(23, 186, 46, 14);
		frmEndereco.getContentPane().add(lblCidade_1);

		tfCidade = new JTextField();
		tfCidade.setBounds(67, 183, 243, 20);
		frmEndereco.getContentPane().add(tfCidade);
		tfCidade.setColumns(10);

		tfEstado = new JTextField();
		tfEstado.setBounds(221, 105, 188, 20);
		frmEndereco.getContentPane().add(tfEstado);
		tfEstado.setColumns(10);

		ButtonEnderecoController btnEndCon = new ButtonEnderecoController(btnHome, btnSalvar, btnExcluir, btnEditar,
				frmEndereco, tfBairro, tfCEP, tfCidade, tfLogradouro, tfEstado);
		btnHome.addActionListener(btnEndCon);
		btnSalvar.addActionListener(btnEndCon);
		btnExcluir.addActionListener(btnEndCon);
		btnEditar.addActionListener(btnEndCon);
	}
}
