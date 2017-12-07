package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Cliente;

public class ClienteDao implements IClienteDao {

	private Connection c;

	public ClienteDao() {
		GenericDao gDao = new GenericDao();
		c = gDao.getConnection();
	}

	public void salvaCliente(Cliente cl) throws SQLException {
		String sql = "INSERT INTO  cliente VALUES (?,?,?,?,?,?,?)";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setString(1, cl.getNome());
		ps.setInt(2, cl.getCpf());
		ps.setInt(3, cl.getRg());
		ps.setInt(4, cl.getNumero());
		ps.setInt(5, cl.getTelefone());
		ps.setString(6, cl.getEmail());
		ps.setInt(7, cl.getCep());
		ps.execute();
		ps.close();

	}

	public void exluiCliente(Cliente cl) throws SQLException {
		String sql = "DELETE cliente WHERE cpf = ?";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setInt(1, cl.getCpf());
		ps.execute();
		ps.close();
	}

	public void editaCliente(Cliente cl) throws SQLException {
		String sql = "UPDATE cliente SET rg = ?, nome = ?, cep = ?, numero = ?, email = ?, telefone = ? WHERE cpf = ? ";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setInt(1, cl.getRg());
		ps.setString(2, cl.getNome());
		ps.setInt(3, cl.getCep());
		ps.setInt(4, cl.getNumero());
		ps.setString(5, cl.getEmail());
		ps.setInt(6, cl.getTelefone());
		ps.setInt(7, cl.getCpf());
		ps.execute();
		ps.close();
	}

}
