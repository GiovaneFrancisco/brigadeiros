package br.com.gff.lista.apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JButton;

public class TelaCriar extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JComboBox cboQuantidade;
	private JComboBox cboTipo;
	private String nomeC, dataC, quant;
	private JButton btnCancelar;

	/**
	 * Create the frame.
	 */
	public TelaCriar(String nome, String data) {
		setResizable(false);
		setTitle("Adicionar pedido");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 302, 180);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblQuantidade.setBounds(10, 60, 101, 20);
		contentPane.add(lblQuantidade);

		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblTipo.setBounds(10, 11, 46, 17);
		contentPane.add(lblTipo);

		cboTipo = new JComboBox();
		cboTipo.setFont(new Font("Dialog", Font.PLAIN, 14));
		cboTipo.setBackground(SystemColor.text);
		cboTipo.setModel(new DefaultComboBoxModel(
				new String[] { "Caixa 4", "Caixa 6", "Caixa 12", "Caixa 20", "Barca", "Cento" }));
		cboTipo.setBounds(140, 11, 125, 20);
		contentPane.add(cboTipo);

		cboQuantidade = new JComboBox();
		cboQuantidade.setFont(new Font("Dialog", Font.PLAIN, 14));
		cboQuantidade.setBackground(SystemColor.text);
		cboQuantidade
				.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cboQuantidade.setBounds(140, 60, 125, 20);
		contentPane.add(cboQuantidade);

		JButton btnOk = new JButton("OK");
		btnOk.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnOk.addActionListener(this);
		btnOk.setActionCommand("ok");
		btnOk.setBackground(SystemColor.menu);
		btnOk.setBounds(24, 118, 89, 23);
		contentPane.add(btnOk);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBackground(SystemColor.menu);
		btnCancelar.addActionListener(this);
		btnCancelar.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnCancelar.setBounds(140, 118, 105, 23);
		contentPane.add(btnCancelar);

		nomeC = nome;
		dataC = data;
		
		setLocationRelativeTo(null);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		JFrame tela = null;

		if (cmd.equals("ok")) {
			String tipo = (String) cboTipo.getSelectedItem();

			quant = (String) cboQuantidade.getSelectedItem();

			if (tipo.equals("Caixa 4")) {
				tela = new TelaCriarC4(nomeC, dataC, quant);
			} else if (tipo.equals("Caixa 6")) {
				tela = new TelaCriarC6(nomeC, dataC, quant);
			} else if (tipo.equals("Caixa 12")) {
				tela = new TelaCriarC12(nomeC, dataC, quant);
			} else if (tipo.equals("Caixa 20")) {
				tela = new TelaCriarC20(nomeC, dataC, quant);
			} else if (tipo.equals("Cento")) {
				tela = new TelaCriarCento(nomeC, dataC, quant);
			} else if (tipo.equals("Barca")) {
				tela = new TelaCriarBarca(nomeC, dataC, quant);
			}
		}else {
			tela = new TelaAdicionar();
		}
		tela.setVisible(true);
		this.dispose();

	}
}
