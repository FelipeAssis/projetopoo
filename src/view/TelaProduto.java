package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import controller.ButtonProdutoController;

public class TelaProduto {

	public JFrame frmProduto;
	private JTextField tfModelo;
	private JTextField tfMarca;
	private JTextField tfTela;
	private JTextField tfProcessador;
	private JTextField tfSo;
	private JTextField tfMemoria;
	private JTextField tfCamera;
	private JTextField tfBateria;
	private JTextField tfValor;
	private JTextField tfEspecificacoes;
	private JTextField tfTipo;

	public TelaProduto() {
		initialize();
	}

	private void initialize() {
		frmProduto = new JFrame();
		frmProduto.setResizable(false);
		frmProduto.setTitle("Produto");
		frmProduto.setBounds(100, 100, 460, 319);
		frmProduto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmProduto.getContentPane().setLayout(null);

		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setBounds(19, 63, 34, 14);
		frmProduto.getContentPane().add(lblTipo);

		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setBounds(200, 63, 46, 14);
		frmProduto.getContentPane().add(lblModelo);

		tfModelo = new JTextField();
		tfModelo.setBounds(256, 60, 155, 20);
		frmProduto.getContentPane().add(tfModelo);
		tfModelo.setColumns(10);

		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setBounds(19, 99, 44, 14);
		frmProduto.getContentPane().add(lblMarca);

		tfMarca = new JTextField();
		tfMarca.setBounds(73, 96, 109, 20);
		frmProduto.getContentPane().add(tfMarca);
		tfMarca.setColumns(10);

		JLabel lblTle = new JLabel("Tela:");
		lblTle.setBounds(200, 99, 46, 14);
		frmProduto.getContentPane().add(lblTle);

		tfTela = new JTextField();
		tfTela.setBounds(256, 96, 46, 20);
		frmProduto.getContentPane().add(tfTela);
		tfTela.setColumns(10);

		JLabel lblNewLabel = new JLabel("Processador:");
		lblNewLabel.setBounds(19, 131, 90, 14);
		frmProduto.getContentPane().add(lblNewLabel);

		tfProcessador = new JTextField();
		tfProcessador.setBounds(119, 128, 98, 20);
		frmProduto.getContentPane().add(tfProcessador);
		tfProcessador.setColumns(10);

		JLabel lblSo = new JLabel("SO:");
		lblSo.setBounds(239, 131, 34, 14);
		frmProduto.getContentPane().add(lblSo);

		tfSo = new JTextField();
		tfSo.setBounds(283, 128, 128, 20);
		frmProduto.getContentPane().add(tfSo);
		tfSo.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Mem\u00F3ria:");
		lblNewLabel_1.setBounds(19, 166, 63, 14);
		frmProduto.getContentPane().add(lblNewLabel_1);

		tfMemoria = new JTextField();
		tfMemoria.setBounds(92, 163, 125, 20);
		frmProduto.getContentPane().add(tfMemoria);
		tfMemoria.setColumns(10);

		JLabel lblCmera = new JLabel("C\u00E2mera:");
		lblCmera.setBounds(227, 166, 63, 14);
		frmProduto.getContentPane().add(lblCmera);

		tfCamera = new JTextField();
		tfCamera.setBounds(283, 163, 128, 20);
		frmProduto.getContentPane().add(tfCamera);
		tfCamera.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Bateria:");
		lblNewLabel_2.setBounds(19, 201, 46, 14);
		frmProduto.getContentPane().add(lblNewLabel_2);

		tfBateria = new JTextField();
		tfBateria.setBounds(82, 198, 115, 20);
		frmProduto.getContentPane().add(tfBateria);
		tfBateria.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Valor:");
		lblNewLabel_3.setBounds(219, 201, 34, 14);
		frmProduto.getContentPane().add(lblNewLabel_3);

		tfValor = new JTextField();
		tfValor.setBounds(268, 200, 143, 20);
		frmProduto.getContentPane().add(tfValor);
		tfValor.setColumns(10);

		JLabel lblEspecificaes = new JLabel("Especifica\u00E7\u00F5es:");
		lblEspecificaes.setBounds(19, 237, 98, 14);
		frmProduto.getContentPane().add(lblEspecificaes);

		tfEspecificacoes = new JTextField();
		tfEspecificacoes.setBounds(118, 234, 293, 20);
		frmProduto.getContentPane().add(tfEspecificacoes);
		tfEspecificacoes.setColumns(10);

		tfTipo = new JTextField();
		tfTipo.setBounds(63, 60, 115, 20);
		frmProduto.getContentPane().add(tfTipo);
		tfTipo.setColumns(10);

		JRadioButton rdbtnHome = new JRadioButton("Home");
		rdbtnHome.setBounds(25, 7, 109, 23);
		frmProduto.getContentPane().add(rdbtnHome);

		JRadioButton rdbtnCadastrar = new JRadioButton("Cadastrar");
		rdbtnCadastrar.setBounds(136, 7, 109, 23);
		frmProduto.getContentPane().add(rdbtnCadastrar);

		JRadioButton rdbtnEditar = new JRadioButton("Editar");
		rdbtnEditar.setBounds(247, 7, 84, 23);
		frmProduto.getContentPane().add(rdbtnEditar);

		JRadioButton rdbtnExcluir = new JRadioButton("Excluir");
		rdbtnExcluir.setBounds(339, 7, 109, 23);
		frmProduto.getContentPane().add(rdbtnExcluir);

		ButtonProdutoController btnProdCon = new ButtonProdutoController(rdbtnHome, rdbtnCadastrar, rdbtnEditar,
				rdbtnExcluir, frmProduto, tfCamera, tfEspecificacoes, tfMarca, tfMemoria, tfModelo, tfProcessador, tfSo,
				tfTela, tfValor, tfBateria, tfTipo);
		rdbtnCadastrar.addActionListener(btnProdCon);
		rdbtnEditar.addActionListener(btnProdCon);
		rdbtnExcluir.addActionListener(btnProdCon);
		rdbtnHome.addActionListener(btnProdCon);

	}
}
