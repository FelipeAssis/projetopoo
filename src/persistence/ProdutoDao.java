package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import model.Produto;

public class ProdutoDao implements IProdutoDao {

	private Connection c;

	public ProdutoDao() {
		GenericDao gDao = new GenericDao();
		c = gDao.getConnection();
	}

	public void cadastraProduto(Produto p) throws SQLException {
		String sql = "INSERT INTO produto VALUES (?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setString(1, p.getModelo());
		ps.setString(2, p.getEspecs());
		ps.setInt(3, p.getTela());
		ps.setString(4, p.getProcessador());
		ps.setString(5, p.getMemoria());
		ps.setString(6, p.getSo());
		ps.setInt(7, p.getValor());
		ps.setString(8, p.getTipo());
		ps.setString(9, p.getBateria());
		ps.setString(10, p.getCamera());
		ps.setString(11, p.getMarca());
		ps.execute();
		ps.close();
	}

	public void editaProduto(Produto p) throws SQLException {
		String sql = "UPDATE produto SET tela = ?, valor = ?, especs = ?, camera = ?, memoria = ?, processador = ?, tipo = ?, so = ?, bateria = ?, marca = ? WHERE modelo = ?";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setFloat(1, p.getTela());
		ps.setFloat(2, p.getValor());
		ps.setString(3, p.getEspecs());
		ps.setString(4, p.getCamera());
		ps.setString(5, p.getMemoria());
		ps.setString(6, p.getProcessador());
		ps.setString(7, p.getTipo());
		ps.setString(8, p.getSo());
		ps.setString(9, p.getBateria());
		ps.setString(10, p.getMarca());
		ps.setString(11, p.getModelo());
		ps.execute();
		ps.close();
	}

	public void excluiProduto(Produto p) throws SQLException {
		try {
			String sql = "DELETE produto WHERE modelo = ?";
			PreparedStatement ps = c.prepareStatement(sql);
			ps.setString(1, p.getModelo());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO NA INSERÇÃO", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void consultaProduto(Produto p) throws SQLException {
		String sql = "SELECT * FROM produto WHERE modelo = ?";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setString(1, p.getModelo());
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			p.setBateria(rs.getString("bateria"));
			p.setCamera(rs.getString("camera"));
			p.setEspecs(rs.getString("especs"));
			p.setMarca(rs.getString("marca"));
			p.setMemoria(rs.getString("memoria"));
			p.setModelo(rs.getString("modelo"));
			p.setProcessador(rs.getString("processador"));
			p.setSo(rs.getString("so"));
			p.setTela((rs.getInt("tela")));
			p.setTipo(rs.getString("tipo"));
			p.setValor(rs.getInt("valor"));
		}
		ps.execute();
		ps.close();
	}

	public boolean verficiaProduto(Produto p) throws SQLException {
		String sql = "SELECT modelo FROM produto WHERE modelo = ?";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setString(1, p.getModelo());
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<Produto> listaProdutos() throws SQLException {
		List<Produto> lista = new ArrayList<Produto>();
		String sql = "SELECT modelo,especs,tela,processador,memoria,so,valor,tipo,bateria,camera,marca FROM produto";
		PreparedStatement ps = c.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Produto p = new Produto();
			p.setBateria(rs.getString("bateria"));
			p.setCamera(rs.getString("camera"));
			p.setEspecs(rs.getString("especs"));
			p.setMarca(rs.getString("marca"));
			p.setMemoria(rs.getString("memoria"));
			p.setModelo(rs.getString("modelo"));
			p.setProcessador(rs.getString("processador"));
			p.setSo(rs.getString("so"));
			p.setTela((rs.getInt("tela")));
			p.setTipo(rs.getString("tipo"));
			p.setValor(rs.getInt("valor"));
			lista.add(p);
		}
		rs.close();
		ps.close();
		return lista;
	}

}
