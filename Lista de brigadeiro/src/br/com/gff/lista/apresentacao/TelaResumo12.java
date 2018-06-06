package br.com.gff.lista.apresentacao;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class TelaResumo12 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private String sabor1, sabor2, sabor3, nomeC, dataC, quantC, tipoC;
	private JTextField txtNome;
	private JTextField txtData;
	private JTextField txtTipo;
	private JTextField txtQuant;
	private JTextField txtSabor1;
	private JTextField txtSabor2;
	private JTextField txtSabor3;

	/**
	 * Create the frame.
	 * @param quantC 
	 * @param data 
	 * @param nome 
	 * @param sabor2 
	 * @param sabor1 
	 */
	public TelaResumo12(String sabor1, String sabor2, String sabor3, String nome, String data, String quant) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 353, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNome.setBounds(10, 8, 160, 14);
		contentPane.add(lblNome);
		
		JLabel lblDataDeEntrega = new JLabel("Data de entrega:");
		lblDataDeEntrega.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDataDeEntrega.setBounds(10, 60, 160, 17);
		contentPane.add(lblDataDeEntrega);
		
		JLabel lblCaixa = new JLabel("Caixa:");
		lblCaixa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCaixa.setBounds(10, 102, 160, 14);
		contentPane.add(lblCaixa);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblQuantidade.setBounds(10, 142, 160, 14);
		contentPane.add(lblQuantidade);
		
		JLabel lblSabor = new JLabel("1\u00BA Sabor:");
		lblSabor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSabor.setBounds(10, 203, 160, 14);
		contentPane.add(lblSabor);
		
		JLabel lblSabor_1 = new JLabel("2\u00BA Sabor:");
		lblSabor_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSabor_1.setBounds(10, 248, 160, 14);
		contentPane.add(lblSabor_1);
		
		JLabel lblSabor_2 = new JLabel("3\u00BA Sabor:");
		lblSabor_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSabor_2.setBounds(10, 300, 160, 14);
		contentPane.add(lblSabor_2);
		
		txtNome = new JTextField();
		txtNome.setEditable(false);
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNome.setBounds(180, 8, 135, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		txtNome.setText(nome);
		
		txtData = new JTextField();
		txtData.setEditable(false);
		txtData.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtData.setColumns(10);
		txtData.setBounds(180, 60, 90, 20);
		contentPane.add(txtData);
		txtData.setText(data);
		
		txtTipo = new JTextField();
		txtTipo.setEditable(false);
		txtTipo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtTipo.setColumns(10);
		txtTipo.setBounds(180, 99, 135, 20);
		contentPane.add(txtTipo);
		txtTipo.setText("Caixa de 12");
		
		txtQuant = new JTextField();
		txtQuant.setEditable(false);
		txtQuant.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtQuant.setColumns(10);
		txtQuant.setBounds(180, 139, 135, 20);
		contentPane.add(txtQuant);
		txtQuant.setText(quant);
		
		txtSabor1 = new JTextField();
		txtSabor1.setEditable(false);
		txtSabor1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtSabor1.setColumns(10);
		txtSabor1.setBounds(180, 200, 135, 20);
		contentPane.add(txtSabor1);
		txtSabor1.setText(sabor1);
		
		txtSabor2 = new JTextField();
		txtSabor2.setEditable(false);
		txtSabor2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtSabor2.setColumns(10);
		txtSabor2.setBounds(180, 245, 135, 20);
		contentPane.add(txtSabor2);
		txtSabor2.setText(sabor2);
		
		txtSabor3 = new JTextField();
		txtSabor3.setEditable(false);
		txtSabor3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtSabor3.setColumns(10);
		txtSabor3.setBounds(180, 297, 135, 20);
		contentPane.add(txtSabor3);
		txtSabor3.setText(sabor3);
		
		JButton btnConfirmar = new JButton("Confirmar"); 
		btnConfirmar.addActionListener(this);
		btnConfirmar.setActionCommand("ok");
		btnConfirmar.setBackground(SystemColor.menu);
		btnConfirmar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnConfirmar.setBounds(43, 348, 105, 31);
		contentPane.add(btnConfirmar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBackground(SystemColor.menu);
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCancelar.setBounds(178, 348, 105, 27);
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
		if(cmd.equals("ok")) {
			
		}else {
			tela = new TelaCriarC12(nomeC, dataC, quantC);
		}
		tela.setVisible(true);
		this.dispose();
	}

}
