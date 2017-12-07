package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

import model.Produto;

public class ComboVendaController implements ActionListener {

	private JComboBox<Produto> cmbProduto;

	public ComboVendaController(JComboBox<Produto> cmbProduto) {
		this.cmbProduto = cmbProduto;
	}

	public void actionPerformed(ActionEvent arg0) {
		if (cmbProduto.getItemCount() > 0) {
			Produto p = (Produto) cmbProduto.getSelectedItem();
		}

	}

}
