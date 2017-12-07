package persistence;

import java.sql.SQLException;

import model.Endereco;

public interface IEnderecoDao {

	public void salvaEndereco(Endereco e) throws SQLException;

	public void excluiEndereco(Endereco e) throws SQLException;

	public void editaEndereco(Endereco e) throws SQLException;

	public void consultaCEP(Endereco e) throws SQLException;
}
