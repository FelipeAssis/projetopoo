package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;

import model.Produto;
import persistence.IProdutoDao;
import persistence.ProdutoDao;

public class VendaController {

	private JComboBox<Produto> cmbProduto;

	public VendaController(JComboBox<Produto> cmbProduto) {
		this.cmbProduto = cmbProduto;
	}

	public void listaProdutos() throws SQLException {
		List<Produto> lista = new ArrayList<Produto>();
		IProdutoDao pDao = new ProdutoDao();
		lista = pDao.listaProdutos();
		if (cmbProduto.getItemCount() > 0) {
			cmbProduto.removeAllItems();
		}
		if (lista != null) {
			for (Produto p : lista) {
				cmbProduto.addItem(p);
			}
		}
	}

}
