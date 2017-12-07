package persistence;

import java.sql.SQLException;
import java.util.List;

import model.Produto;

public interface IProdutoDao {

	public void cadastraProduto(Produto p) throws SQLException;

	public void editaProduto(Produto p) throws SQLException;

	public void excluiProduto(Produto p) throws SQLException;

	public void consultaProduto(Produto p) throws SQLException;

	public boolean verficiaProduto(Produto p) throws SQLException;

	public List<Produto> listaProdutos() throws SQLException;
}
