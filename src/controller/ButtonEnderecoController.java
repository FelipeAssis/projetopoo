package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import model.Endereco;
import persistence.EnderecoDao;
import persistence.IEnderecoDao;
import view.Home;

public class ButtonEnderecoController implements ActionListener {

	private JButton btnExcluir, btnSalvar, btnHome, btnEditar;
	private JFrame frmEndereco;
	private JTextField tfBairro, tfCEP, tfCidade, tfLogradouro, tfEstado;

	public ButtonEnderecoController(JButton btnHome, JButton btnSalvar, JButton btnExcluir, JButton btnEditar,
			JFrame frmEndereco, JTextField tfBairro, JTextField tfCEP, JTextField tfCidade, JTextField tfLogradouro,
			JTextField tfEstado) {
		this.btnHome = btnHome;
		this.btnExcluir = btnExcluir;
		this.btnSalvar = btnSalvar;
		this.btnEditar = btnEditar;
		this.frmEndereco = frmEndereco;
		this.tfBairro = tfBairro;
		this.tfCEP = tfCEP;
		this.tfCidade = tfCidade;
		this.tfLogradouro = tfLogradouro;
		this.tfEstado = tfEstado;
	}

	public void actionPerformed(ActionEvent e) {
		Endereco end = new Endereco();
		if (e.getSource() == btnHome) {
			montaTelaHome();
		} else if (e.getSource() == btnExcluir) {
			preenchecampos(end);
			excluir(end);
		} else {
			if (e.getSource() == btnSalvar) {
				preenchecampos(end);
				salvar(end);
				limpacampos(end);
			} else if (e.getSource() == btnEditar) {
				preenchecampos(end);
				editar(end);
				limpacampos(end);
			}
		}
	}

	public void montaTelaHome() {
		frmEndereco.dispose();
		Home hm = new Home();
		hm.frmPrimatech.setVisible(true);
	}

	public void limpacampos(Endereco end) {
		tfBairro.setText("");
		tfCEP.setText("");
		tfCidade.setText("");
		tfEstado.setText("");
		tfLogradouro.setText("");
		end = null;
	}

	public void preenchecampos(Endereco end) {
		end.setBairro(tfBairro.getText());
		end.setCidade(tfCidade.getText());
		end.setLogradouro(tfLogradouro.getText());
		end.setCep(Integer.parseInt(tfCEP.getText()));
		end.setEstado(tfEstado.getText());
	}

	public void salvar(Endereco end) {
		IEnderecoDao eDao = new EnderecoDao();
		try {
			eDao.salvaEndereco(end);
			JOptionPane.showMessageDialog(null, "Endereco salvo com sucesso", "Sucesso",
					JOptionPane.INFORMATION_MESSAGE);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void excluir(Endereco end) {
		IEnderecoDao eDao = new EnderecoDao();
		try {
			System.out.println(end.getCep());
			eDao.excluiEndereco(end);
			JOptionPane.showMessageDialog(null, "Endereco excluído com sucesso", "Sucesso",
					JOptionPane.INFORMATION_MESSAGE);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void editar(Endereco end) {
		IEnderecoDao eDao = new EnderecoDao();
		try {
			eDao.editaEndereco(end);
			JOptionPane.showMessageDialog(null, "Endereco editado com sucesso", "Sucesso",
					JOptionPane.INFORMATION_MESSAGE);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}
	}
}