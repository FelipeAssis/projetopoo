package persistence;

import java.sql.SQLException;

import model.Cliente;

public interface IClienteDao {

	public void salvaCliente(Cliente cl) throws SQLException;

	public void exluiCliente(Cliente cl) throws SQLException;

	public void editaCliente(Cliente cl) throws SQLException;
}
