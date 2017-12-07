package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JRadioButton;

import view.TelaCliente;
import view.TelaEndereco;
import view.TelaProduto;
import view.TelaVenda;

public class RadioHomeController implements ActionListener {

	JRadioButton rdbtnCliente, rdbtnProduto, rdbtnEndereco;
	JFrame frmPrimatech;

	public RadioHomeController(JRadioButton rdbtnCliente, JRadioButton rdbtnProduto,
			JRadioButton rdbtnEndereco, JFrame frmPrimatech) {
		this.rdbtnCliente = rdbtnCliente;
		this.rdbtnProduto = rdbtnProduto;
		this.rdbtnEndereco = rdbtnEndereco;
		this.frmPrimatech = frmPrimatech;
	}

	public void actionPerformed(ActionEvent e) {
		if (rdbtnCliente.isSelected()) {
			montaTelaCliente();
		} else if (rdbtnProduto.isSelected()) {
			montaTelaProduto();
		} else if (rdbtnEndereco.isSelected()) {
			montaTelaEndereco();
		}
	}


	private void montaTelaEndereco() {
		frmPrimatech.dispose();
		TelaEndereco telaE = new TelaEndereco();
		telaE.frmEndereco.setVisible(true);
	}

	private void montaTelaProduto() {
		frmPrimatech.dispose();
		TelaProduto telaP = new TelaProduto();
		telaP.frmProduto.setVisible(true);
	}

	private void montaTelaCliente() {
		frmPrimatech.dispose();
		TelaCliente window = new TelaCliente();
		window.frmCliente.setVisible(true);
	}

}
