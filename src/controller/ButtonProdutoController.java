package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import model.Produto;
import persistence.IProdutoDao;
import persistence.ProdutoDao;
import view.Home;

public class ButtonProdutoController implements ActionListener {

	private JRadioButton rdbtnExcluir, rdbtnCadastrar, rdbtnHome, rdbtnEditar;
	private JFrame frmProduto;
	private JTextField tfBateria, tfCamera, tfEspecificacoes, tfMarca, tfMemoria, tfModelo, tfProcessador, tfSo, tfTela,
			tfValor, tfTipo;

	public ButtonProdutoController(JRadioButton rdbtnHome, JRadioButton rdbtnCadastrar, JRadioButton rdbtnEditar,
			JRadioButton rdbtnExcluir, JFrame frmProduto, JTextField tfCamera, JTextField tfEspecificacoes,
			JTextField tfMarca, JTextField tfMemoria, JTextField tfModelo, JTextField tfProcessador, JTextField tfSo,
			JTextField tfTela, JTextField tfValor, JTextField tfBateria, JTextField tfTipo) {
		this.rdbtnExcluir = rdbtnExcluir;
		this.rdbtnCadastrar = rdbtnCadastrar;
		this.rdbtnHome = rdbtnHome;
		this.rdbtnEditar = rdbtnEditar;
		this.frmProduto = frmProduto;
		this.tfBateria = tfBateria;
		this.tfCamera = tfCamera;
		this.tfEspecificacoes = tfEspecificacoes;
		this.tfMarca = tfMarca;
		this.tfMemoria = tfMemoria;
		this.tfModelo = tfModelo;
		this.tfProcessador = tfProcessador;
		this.tfSo = tfSo;
		this.tfTela = tfTela;
		this.tfValor = tfValor;
		this.tfTipo = tfTipo;
	}

	public void actionPerformed(ActionEvent e) {
		Produto p = new Produto();
		if (rdbtnHome.isSelected()) {
			montaTelaHome();
			rdbtnHome.setSelected(false);
		} else if (rdbtnExcluir.isSelected()) {
				if (tfModelo.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "DIGITE UM MODELO PARA EXCLUIR");
					rdbtnExcluir.setSelected(false);
				} else {
					p.setModelo(tfModelo.getText());
					excluir(p);
					rdbtnExcluir.setSelected(false);
				}
		} else {
			if (rdbtnCadastrar.isSelected()) {
				if (tfModelo.getText().equals("") || tfValor.getText().equals("") || tfBateria.getText().equals("")
						|| tfCamera.getText().equals("") || tfEspecificacoes.getText().equals("")
						|| tfMarca.getText().equals("") || tfProcessador.getText().equals("")
						|| tfSo.getText().equals("") || tfTela.getText().equals("") || tfTipo.getText().equals("")
						|| tfMemoria.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "PREENCHA TODOS OS CAMPOS!!!!");
					rdbtnCadastrar.setSelected(false);
				} else {
					popula(p);
					cadastrar(p);
					rdbtnCadastrar.setSelected(false);
				}
			}
			if (rdbtnEditar.isSelected()) {
				if (tfModelo.getText().equals("") || tfValor.getText().equals("") || tfBateria.getText().equals("")
						|| tfCamera.getText().equals("") || tfEspecificacoes.getText().equals("")
						|| tfMarca.getText().equals("") || tfProcessador.getText().equals("")
						|| tfSo.getText().equals("") || tfTela.getText().equals("") || tfTipo.getText().equals("")
						|| tfMemoria.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "PREENCHA TODOS OS CAMPOS!!!!");
					rdbtnEditar.setSelected(false);
				} else {
					popula(p);
					editar(p);
					rdbtnEditar.setSelected(false);
				}
			}

		}
		limpacampos(p);
	}

	private void popula(Produto p) {
		p.setBateria(tfBateria.getText());
		p.setCamera(tfCamera.getText());
		p.setEspecs(tfEspecificacoes.getText());
		p.setModelo(tfModelo.getText());
		p.setMemoria(tfMemoria.getText());
		p.setProcessador(tfProcessador.getText());
		p.setSo(tfSo.getText());
		p.setMarca(tfMarca.getText());
		p.setTela(Integer.parseInt((tfTela.getText())));
		p.setValor(Integer.parseInt((tfValor.getText())));
		p.setTipo(tfTipo.getText());
	}

	private void limpacampos(Produto p) {
		p = null;
		tfBateria.setText("");
		tfCamera.setText("");
		tfEspecificacoes.setText("");
		tfMarca.setText("");
		tfMemoria.setText("");
		tfModelo.setText("");
		tfProcessador.setText("");
		tfSo.setText("");
		tfTela.setText("");
		tfTipo.setText("");
		tfValor.setText("");

	}

	private boolean verifica(Produto p) {
		boolean b = false;
		IProdutoDao pDao = new ProdutoDao();
		try {
			b = pDao.verficiaProduto(p);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}
		return b;
	}

	private void excluir(Produto p) {
		IProdutoDao mDao = new ProdutoDao();
		try {
			mDao.excluiProduto(p);
			JOptionPane.showMessageDialog(null, "Excluído com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}
	}

	private void editar(Produto p) {
		IProdutoDao pDao = new ProdutoDao();
		try {
			pDao.editaProduto(p);
			JOptionPane.showMessageDialog(null, "Editado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}

	}

	private void cadastrar(Produto p) {
		IProdutoDao pDao = new ProdutoDao();
		try {
			pDao.cadastraProduto(p);
			JOptionPane.showMessageDialog(null, "Cadastrado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void montaTelaHome() {
		frmProduto.dispose();
		Home hm = new Home();
		hm.frmPrimatech.setVisible(true);
	}

}
