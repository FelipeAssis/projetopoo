package view;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaConsultaProduto {

	public JFrame frmConsultaProduto;
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

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaConsultaProduto window = new TelaConsultaProduto();
					window.frmConsultaProduto.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TelaConsultaProduto() {
		initialize();
	}

	private void initialize() {
		frmConsultaProduto = new JFrame();
		frmConsultaProduto.setResizable(false);
		frmConsultaProduto.setTitle("Consultar Produto");
		frmConsultaProduto.setBounds(100, 100, 460, 319);
		frmConsultaProduto.getContentPane().setLayout(null);

		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setBounds(19, 63, 34, 14);
		frmConsultaProduto.getContentPane().add(lblTipo);

		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setBounds(200, 63, 46, 14);
		frmConsultaProduto.getContentPane().add(lblModelo);

		tfModelo = new JTextField();
		tfModelo.setEditable(false);
		tfModelo.setBounds(256, 60, 155, 20);
		frmConsultaProduto.getContentPane().add(tfModelo);
		tfModelo.setColumns(10);

		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setBounds(19, 99, 44, 14);
		frmConsultaProduto.getContentPane().add(lblMarca);

		tfMarca = new JTextField();
		tfMarca.setEditable(false);
		tfMarca.setBounds(73, 96, 109, 20);
		frmConsultaProduto.getContentPane().add(tfMarca);
		tfMarca.setColumns(10);

		JLabel lblTle = new JLabel("Tela:");
		lblTle.setBounds(200, 99, 46, 14);
		frmConsultaProduto.getContentPane().add(lblTle);

		tfTela = new JTextField();
		tfTela.setEditable(false);
		tfTela.setBounds(256, 96, 46, 20);
		frmConsultaProduto.getContentPane().add(tfTela);
		tfTela.setColumns(10);

		JLabel lblNewLabel = new JLabel("Processador:");
		lblNewLabel.setBounds(19, 131, 90, 14);
		frmConsultaProduto.getContentPane().add(lblNewLabel);

		tfProcessador = new JTextField();
		tfProcessador.setEditable(false);
		tfProcessador.setBounds(119, 128, 98, 20);
		frmConsultaProduto.getContentPane().add(tfProcessador);
		tfProcessador.setColumns(10);

		JLabel lblSo = new JLabel("SO:");
		lblSo.setBounds(239, 131, 34, 14);
		frmConsultaProduto.getContentPane().add(lblSo);

		tfSo = new JTextField();
		tfSo.setEditable(false);
		tfSo.setBounds(283, 128, 128, 20);
		frmConsultaProduto.getContentPane().add(tfSo);
		tfSo.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Mem\u00F3ria:");
		lblNewLabel_1.setBounds(19, 166, 63, 14);
		frmConsultaProduto.getContentPane().add(lblNewLabel_1);

		tfMemoria = new JTextField();
		tfMemoria.setEditable(false);
		tfMemoria.setBounds(92, 163, 125, 20);
		frmConsultaProduto.getContentPane().add(tfMemoria);
		tfMemoria.setColumns(10);

		JLabel lblCmera = new JLabel("C\u00E2mera:");
		lblCmera.setBounds(227, 166, 63, 14);
		frmConsultaProduto.getContentPane().add(lblCmera);

		tfCamera = new JTextField();
		tfCamera.setEditable(false);
		tfCamera.setBounds(283, 163, 128, 20);
		frmConsultaProduto.getContentPane().add(tfCamera);
		tfCamera.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Bateria:");
		lblNewLabel_2.setBounds(19, 201, 46, 14);
		frmConsultaProduto.getContentPane().add(lblNewLabel_2);

		tfBateria = new JTextField();
		tfBateria.setEditable(false);
		tfBateria.setBounds(82, 198, 115, 20);
		frmConsultaProduto.getContentPane().add(tfBateria);
		tfBateria.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Valor:");
		lblNewLabel_3.setBounds(219, 201, 34, 14);
		frmConsultaProduto.getContentPane().add(lblNewLabel_3);

		tfValor = new JTextField();
		tfValor.setEditable(false);
		tfValor.setBounds(268, 200, 143, 20);
		frmConsultaProduto.getContentPane().add(tfValor);
		tfValor.setColumns(10);

		JLabel lblEspecificaes = new JLabel("Especifica\u00E7\u00F5es:");
		lblEspecificaes.setBounds(19, 237, 98, 14);
		frmConsultaProduto.getContentPane().add(lblEspecificaes);

		tfEspecificacoes = new JTextField();
		tfEspecificacoes.setEditable(false);
		tfEspecificacoes.setBounds(118, 234, 293, 20);
		frmConsultaProduto.getContentPane().add(tfEspecificacoes);
		tfEspecificacoes.setColumns(10);

		JLabel lblProduto = new JLabel("Produto");
		lblProduto.setFont(new Font("Arial", Font.PLAIN, 30));
		lblProduto.setBounds(170, 11, 115, 38);
		frmConsultaProduto.getContentPane().add(lblProduto);

		tfTipo = new JTextField();
		tfTipo.setEditable(false);
		tfTipo.setBounds(63, 60, 115, 20);
		frmConsultaProduto.getContentPane().add(tfTipo);
		tfTipo.setColumns(10);
	}
}
