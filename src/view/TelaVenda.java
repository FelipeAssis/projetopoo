package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.ButtonVendaController;
import controller.ComboVendaController;

public class TelaVenda extends JFrame {

	private static final long serialVersionUID = 1L;
	public JFrame frmVenda;
	private JTextField tfCpf;
	private JTextField tfQuantidade;
	private JTextField tfValorUnitario;
	private JTextField tfValorTotal;

	public TelaVenda() {
		frmVenda = new JFrame();
		frmVenda.setResizable(false);
		frmVenda.setTitle("Venda");
		frmVenda.setBounds(100, 100, 460, 319);
		frmVenda.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVenda.getContentPane().setLayout(null);

		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.setBounds(119, 11, 89, 23);
		frmVenda.getContentPane().add(btnFinalizar);

		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(218, 11, 89, 23);
		frmVenda.getContentPane().add(btnAlterar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(317, 11, 89, 23);
		frmVenda.getContentPane().add(btnCancelar);

		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(21, 72, 46, 14);
		frmVenda.getContentPane().add(lblCpf);

		tfCpf = new JTextField();
		tfCpf.setBounds(92, 69, 137, 20);
		frmVenda.getContentPane().add(tfCpf);
		tfCpf.setColumns(10);

		JLabel lblProduto = new JLabel("Produto:");
		lblProduto.setBounds(21, 111, 67, 14);
		frmVenda.getContentPane().add(lblProduto);

		tfQuantidade = new JTextField();
		tfQuantidade.setBounds(317, 69, 89, 20);
		frmVenda.getContentPane().add(tfQuantidade);
		tfQuantidade.setColumns(10);

		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setBounds(244, 72, 75, 14);
		frmVenda.getContentPane().add(lblQuantidade);

		JLabel lblNewLabel = new JLabel("Valor Unit.:");
		lblNewLabel.setBounds(21, 153, 67, 14);
		frmVenda.getContentPane().add(lblNewLabel);

		tfValorUnitario = new JTextField();
		tfValorUnitario.setBounds(92, 150, 137, 20);
		frmVenda.getContentPane().add(tfValorUnitario);
		tfValorUnitario.setColumns(10);

		JLabel lblValorTotal = new JLabel("Valor Total:");
		lblValorTotal.setBounds(21, 187, 67, 14);
		frmVenda.getContentPane().add(lblValorTotal);

		tfValorTotal = new JTextField();
		tfValorTotal.setBounds(92, 184, 137, 20);
		frmVenda.getContentPane().add(tfValorTotal);
		tfValorTotal.setColumns(10);

		JButton btnConsultarProduto = new JButton("Consultar Produto");
		btnConsultarProduto.setBounds(21, 229, 137, 23);
		frmVenda.getContentPane().add(btnConsultarProduto);

		JComboBox cmbProduto = new JComboBox();
		cmbProduto.setBounds(92, 108, 137, 20);
		frmVenda.getContentPane().add(cmbProduto);

		JButton btnHome = new JButton("Home");
		btnHome.setBounds(21, 11, 89, 23);
		frmVenda.getContentPane().add(btnHome);

		ButtonVendaController btnVendaCon = new ButtonVendaController(btnHome, btnFinalizar, btnAlterar, btnCancelar,
				btnConsultarProduto, frmVenda);
		btnHome.addActionListener(btnVendaCon);
		btnFinalizar.addActionListener(btnVendaCon);
		btnConsultarProduto.addActionListener(btnVendaCon);
		btnCancelar.addActionListener(btnVendaCon);
		btnAlterar.addActionListener(btnVendaCon);

		ComboVendaController cmbVendCon = new ComboVendaController(cmbProduto);
		cmbProduto.addActionListener(cmbVendCon);
	}
}
