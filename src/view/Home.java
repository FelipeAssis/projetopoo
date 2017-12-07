package view;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import controller.RadioHomeController;

public class Home extends javax.swing.JFrame {

	public JFrame frmPrimatech;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
					window.frmPrimatech.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPrimatech = new JFrame();
		frmPrimatech.setResizable(false);
		frmPrimatech.setTitle("Primatech");
		frmPrimatech.setBounds(100, 100, 355, 168);
		frmPrimatech.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPrimatech.getContentPane().setLayout(null);

		JLabel lblHome = new JLabel("Home");
		lblHome.setFont(new Font("OCR A Extended", Font.PLAIN, 27));
		lblHome.setBounds(126, 10, 72, 52);
		frmPrimatech.getContentPane().add(lblHome);

		JRadioButton rdbtnCliente = new JRadioButton("Cliente");
		rdbtnCliente.setBounds(21, 69, 79, 23);
		frmPrimatech.getContentPane().add(rdbtnCliente);

		JRadioButton rdbtnEndereco = new JRadioButton("Endere\u00E7o");
		rdbtnEndereco.setBounds(126, 69, 109, 23);
		frmPrimatech.getContentPane().add(rdbtnEndereco);

		JRadioButton rdbtnProduto = new JRadioButton("Produto");
		rdbtnProduto.setBounds(237, 70, 72, 23);
		frmPrimatech.getContentPane().add(rdbtnProduto);

		RadioHomeController rhc = new RadioHomeController(rdbtnCliente, rdbtnProduto, rdbtnEndereco,
				frmPrimatech);
		rdbtnCliente.addActionListener(rhc);
		rdbtnProduto.addActionListener(rhc);
		rdbtnEndereco.addActionListener(rhc);
	}
}
