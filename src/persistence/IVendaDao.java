package persistence;

import java.sql.SQLException;

import model.Produto;
import model.Venda;

public interface IVendaDao {

	public void finalizaVenda(Venda v) throws SQLException;

	public void cancelaVenda(Venda v) throws SQLException;

	public void alteraVenda(Venda v) throws SQLException;

	public void consultaProduto(Produto p) throws SQLException;
}
