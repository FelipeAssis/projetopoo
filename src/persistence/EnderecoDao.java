package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Endereco;

public class EnderecoDao implements IEnderecoDao {

	private Connection c;

	public EnderecoDao() {
		GenericDao gDao = new GenericDao();
		c = gDao.getConnection();
	}

	public void salvaEndereco(Endereco e) throws SQLException {
		String sql = "INSERT INTO endereco VALUES (?,?,?,?,?)";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setInt(1, e.getCep());
		ps.setString(2, e.getBairro());
		ps.setString(3, e.getCidade());
		ps.setString(4, e.getEstado());
		ps.setString(5, e.getLogradouro());
		ps.execute();
		ps.close();
	}

	public void excluiEndereco(Endereco e) throws SQLException {
		String sql = "DELETE endereco WHERE cep = ?";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setInt(1, e.getCep());
		ps.execute();
		ps.close();
	}

	public void editaEndereco(Endereco e) throws SQLException {
		String sql = "UPDATE endereco SET bairro = ?, cidade = ?, estado = ?, logradouro = ? WHERE cep = ?";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setString(1, e.getBairro());
		ps.setString(2, e.getCidade());
		ps.setString(3, e.getCidade());
		ps.setString(4, e.getLogradouro());
		ps.setInt(5, e.getCep());
		ps.execute();
		ps.close();
	}

	public void consultaCEP(Endereco e) throws SQLException {
		String sql = "SELECT * FROM endereco WHERE cep = ?";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setInt(1, e.getCep());
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			e.setBairro(rs.getString("bairro"));
			e.setCidade(rs.getString("cidade"));
			e.setEstado(rs.getString("estado"));
			e.setLogradouro(rs.getString("logradouro"));
		}
		ps.execute();
		ps.close();
	}

}
