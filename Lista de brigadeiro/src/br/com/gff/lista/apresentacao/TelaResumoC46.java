package br.com.gff.lista.apresentacao;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;

public class TelaResumoC46 extends JFrame implements ActionListener {

	private JPanel contentPane;

	private String sabor_1, sabor_2;
	private JTextField txtNome;
	private JTextField txtData;
	private JTextField txtTipo;
	private JTextField txtQuantidade;
	private JTextField txtSabor1;
	private JTextField txtSabor2;

	private String nomeC, dataC, quantC, tipoC;

	/**
	 * Create the frame.
	 * 
	 * @param quant
	 */
	public TelaResumoC46(String sabor1, String sabor2, String nome, String data, String tipo, String quant) {
		setResizable(false);
		setTitle("Resumo de pedido");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 371, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNome.setBounds(10, 11, 137, 14);
		contentPane.add(lblNome);

		JLabel lblDataDeEntrega = new JLabel("Data de entrega:");
		lblDataDeEntrega.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDataDeEntrega.setBounds(10, 60, 137, 17);
		contentPane.add(lblDataDeEntrega);

		JLabel lblCaixa = new JLabel("Caixa:");
		lblCaixa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCaixa.setBounds(10, 117, 137, 14);
		contentPane.add(lblCaixa);

		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblQuantidade.setBounds(10, 176, 137, 14);
		contentPane.add(lblQuantidade);

		JLabel lblSabor = new JLabel("1\u00BA Sabor:");
		lblSabor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSabor.setBounds(10, 237, 137, 14);
		contentPane.add(lblSabor);

		JLabel lblSabor_1 = new JLabel("2\u00BA Sabor:");
		lblSabor_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSabor_1.setBounds(10, 288, 137, 14);
		contentPane.add(lblSabor_1);

		txtNome = new JTextField();
		txtNome.setEditable(false);
		txtNome.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtNome.setBounds(178, 10, 135, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		txtNome.setText(nome);

		txtData = new JTextField();
		txtData.setEditable(false);
		txtData.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtData.setBounds(178, 60, 90, 20);
		contentPane.add(txtData);
		txtData.setColumns(10);
		txtData.setText(data);

		txtTipo = new JTextField();
		txtTipo.setEditable(false);
		txtTipo.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtTipo.setBounds(178, 116, 135, 20);
		contentPane.add(txtTipo);
		txtTipo.setColumns(10);
		if (tipo.equals("Caixa 4")) {
			tipoC = "4";
			txtTipo.setText("Caixa de 4");
		} else {
			txtTipo.setText("Caixa de 6");
			tipoC = "6";
		}

		txtQuantidade = new JTextField();
		txtQuantidade.setEditable(false);
		txtQuantidade.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtQuantidade.setBounds(178, 175, 135, 20);
		contentPane.add(txtQuantidade);
		txtQuantidade.setColumns(10);
		txtQuantidade.setText(quant);

		txtSabor1 = new JTextField();
		txtSabor1.setEditable(false);
		txtSabor1.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtSabor1.setBounds(178, 236, 135, 20);
		contentPane.add(txtSabor1);
		txtSabor1.setColumns(10);
		txtSabor1.setText(sabor1);

		txtSabor2 = new JTextField();
		txtSabor2.setEditable(false);
		txtSabor2.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtSabor2.setBounds(178, 287, 135, 20);
		contentPane.add(txtSabor2);
		txtSabor2.setColumns(10);
		txtSabor2.setText(sabor2);

		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(this);
		btnConfirmar.setActionCommand("ok");
		btnConfirmar.setBackground(SystemColor.menu);
		btnConfirmar.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnConfirmar.setBounds(41, 340, 106, 23);
		contentPane.add(btnConfirmar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBackground(SystemColor.menu);
		btnCancelar.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnCancelar.setBounds(202, 340, 111, 23);
		contentPane.add(btnCancelar);

		nomeC = nome;
		dataC = data;
		quantC = quant;

		setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		JFrame tela = null;

		if (cmd.equals("ok")) {

		} else {
			if (tipoC.equals("4")) {
				tela = new TelaCriarC4(nomeC, dataC, quantC);
			} else {
				tela = new TelaCriarC6(nomeC, dataC, quantC);
			}
		}
		tela.setVisible(true);
		this.dispose();
	}

}
