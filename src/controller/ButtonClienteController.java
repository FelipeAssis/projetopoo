package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import model.Cliente;
import model.Endereco;
import persistence.ClienteDao;
import persistence.EnderecoDao;
import persistence.IClienteDao;
import persistence.IEnderecoDao;
import view.Home;

public class ButtonClienteController implements ActionListener {

	private JButton btnExcluir, btnSalvar, btnHome, btnEditar, btnProcura;
	private JFrame frmCliente;
	private JTextField tfBairro, tfCEP, tfCidade, tfCPF, tfEmail, tfEstado, tfLogradouro, tfNome, tfNumero, tfRG,
			tfTelefone;

	public ButtonClienteController(JButton btnHome, JButton btnSalvar, JButton btnEditar, JButton btnExcluir,
			JButton btnProcura, JFrame frmCliente, JTextField tfBairro, JTextField tfCEP, JTextField tfCidade,
			JTextField tfCPF, JTextField tfEmail, JTextField tfEstado, JTextField tfLogradouro, JTextField tfNome,
			JTextField tfNumero, JTextField tfRG, JTextField tfTelefone) {
		this.btnHome = btnHome;
		this.btnSalvar = btnSalvar;
		this.btnEditar = btnEditar;
		this.btnExcluir = btnExcluir;
		this.frmCliente = frmCliente;
		this.btnProcura = btnProcura;
		this.tfBairro = tfBairro;
		this.tfCEP = tfCEP;
		this.tfCidade = tfCidade;
		this.tfCPF = tfCPF;
		this.tfEmail = tfEmail;
		this.tfEstado = tfEstado;
		this.tfLogradouro = tfLogradouro;
		this.tfNome = tfNome;
		this.tfNumero = tfNumero;
		this.tfRG = tfRG;
		this.tfTelefone = tfTelefone;
	}

	public void actionPerformed(ActionEvent e) {
		Cliente cli = new Cliente();
		Endereco end = new Endereco();
		if (e.getSource() == btnHome) {
			montaTelaHome();
		} else if (e.getSource() == btnExcluir) {
			if (tfCPF.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "DIGITE O CPF PARA PODER EXCLUIR!");
			} else {
				cli.setCpf(Integer.parseInt(tfCPF.getText()));
				excluir(cli);
				limpacampos(cli);
			}
		} else if (e.getSource() == btnSalvar) {
			if (tfCPF.getText().equals("") || tfCEP.getText().equals("") || tfEmail.getText().equals("")
					|| tfNome.getText().equals("") || tfNumero.getText().equals("") || tfRG.getText().equals("")
					|| tfTelefone.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "DIGITE TODOS OS CAMPOS PARA PODER SALVAR");
			} else {
				preenchecampos(cli);
				salvar(cli);
				limpacampos(cli);
			}
		} else if (e.getSource() == btnEditar) {
			if (tfCPF.getText().equals("") || tfCEP.getText().equals("") || tfEmail.getText().equals("")
					|| tfNome.getText().equals("") || tfNumero.getText().equals("") || tfRG.getText().equals("")
					|| tfTelefone.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "DIGITE TODOS OS CAMPOS PARA PODER EDITAR");
			} else {
				preenchecampos(cli);
				editar(cli);
			}
		} else if (e.getSource() == btnProcura) {
			if (tfCEP.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "DIGITE O CEP PARA CONSULTAR!");
			} else {
				end.setCep(Integer.parseInt(tfCEP.getText()));
				consultaEnd(end);
				tfBairro.setText(end.getBairro().trim());
				tfCidade.setText(end.getCidade().trim());
				tfEstado.setText(end.getEstado().trim());
				tfLogradouro.setText(end.getLogradouro().trim());
			}
		}
	}

	public void limpacampos(Cliente cli) {
		tfBairro.setText("");
		tfCEP.setText("");
		tfCidade.setText("");
		tfCPF.setText("");
		tfEmail.setText("");
		tfEstado.setText("");
		tfLogradouro.setText("");
		tfNome.setText("");
		tfNumero.setText("");
		tfRG.setText("");
		tfTelefone.setText("");
		cli = null;
	}

	public void preenchecampos(Cliente cli) {
		cli.setCpf(Integer.parseInt(tfCPF.getText()));
		cli.setCep(Integer.parseInt(tfCEP.getText()));
		cli.setRg(Integer.parseInt(tfRG.getText()));
		cli.setNumero(Integer.parseInt(tfNumero.getText()));
		cli.setTelefone(Integer.parseInt(tfTelefone.getText()));
		cli.setEmail(tfEmail.getText());
		cli.setNome(tfNome.getText());
	}

	public void montaTelaHome() {
		frmCliente.dispose();
		Home hm = new Home();
		hm.frmPrimatech.setVisible(true);
	}

	public void excluir(Cliente cle) {
		IClienteDao cDao = new ClienteDao();
		try {
			cDao.exluiCliente(cle);
			JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso!", "Sucesso",
					JOptionPane.INFORMATION_MESSAGE);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void salvar(Cliente cle) {
		IClienteDao cDao = new ClienteDao();
		try {
			cDao.salvaCliente(cle);
			JOptionPane.showMessageDialog(null, "Cadastrado com SUCESSO!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void editar(Cliente cle) {
		IClienteDao cDao = new ClienteDao();
		try {
			cDao.editaCliente(cle);
			JOptionPane.showMessageDialog(null, "Edditado com SUCESSO!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void consultaEnd(Endereco end) {
		IEnderecoDao cDao = new EnderecoDao();
		try {
			cDao.consultaCEP(end);
			JOptionPane.showMessageDialog(null, "CEP consultado com sucesso", "Sucesso",
					JOptionPane.INFORMATION_MESSAGE);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}
	}
}
