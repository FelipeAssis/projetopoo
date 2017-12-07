package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import view.Home;
import view.TelaConsultaProduto;

public class ButtonVendaController implements ActionListener {
	private JButton btnCancelar, btnFinalizar, btnHome, btnAlterar, btnConsultarProduto;
	private JFrame frmVenda;

	public ButtonVendaController(JButton btnHome, JButton btnFinalizar, JButton btnAlterar, JButton btnCancelar,
			JButton btnConsultarProduto, JFrame frmVenda) {
		this.btnHome = btnHome;
		this.btnFinalizar = btnFinalizar;
		this.btnAlterar = btnAlterar;
		this.btnCancelar = btnCancelar;
		this.btnConsultarProduto = btnConsultarProduto;
		this.frmVenda = frmVenda;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnHome) {
			montaTelaHome();
		} else if (e.getSource() == btnConsultarProduto) {
			montaTelaConsultarProduto();
		}
	}

	private void montaTelaConsultarProduto() {
		TelaConsultaProduto tlConProd = new TelaConsultaProduto();
		tlConProd.frmConsultaProduto.setVisible(true);
	}

	public void montaTelaHome() {
		frmVenda.dispose();
		Home hm = new Home();
		hm.frmPrimatech.setVisible(true);
	}

}
