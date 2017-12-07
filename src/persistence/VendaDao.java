package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Produto;
import model.Venda;

public class VendaDao implements IVendaDao {

	private Connection c;

	public VendaDao() {
		GenericDao gDao = new GenericDao();
		c = gDao.getConnection();
	}

	public void finalizaVenda(Venda v) throws SQLException {
		String sql = "INSERT INTO venda VALUES (?,?)";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setFloat(1, v.getValorTotal());
		ps.setInt(2, v.getCpf());
		ps.execute();
		ps.close();
	}

	public void cancelaVenda(Venda v) throws SQLException {
		// String sql = "DELETE venda WHERE = "

	}

	public void alteraVenda(Venda v) throws SQLException {

	}

	public void consultaProduto(Produto p) throws SQLException {

	}

}
