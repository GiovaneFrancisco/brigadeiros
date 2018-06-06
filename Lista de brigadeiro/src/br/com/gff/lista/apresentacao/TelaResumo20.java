package br.com.gff.lista.apresentacao;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;

public class TelaResumo20 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtData;
	private JTextField txtQuantidade;
	private JTextField txtSabor1;
	private JTextField txtSabor2;
	private JTextField txtSabor3;
	private JTextField txtSabor4;
	
	private String nomeC, dataC, quantC;
	private JTextField txtCaixaDe;
  

	/**
	 * Create the frame.
	 * @param sabor42 
	 * @param sabor4 
	 * @param sabor2 
	 * @param sabor1 
	 * @param quantC 
	 * @param dataC 
	 * @param nomeC 
	 */
	public TelaResumo20(String nome, String data, String quant, String sabor1, String sabor2, String sabor3, String sabor4) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 339, 443);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNome.setBounds(10, 21, 143, 14);
		contentPane.add(lblNome);
		
		JLabel lblDataDeEntrega = new JLabel("Data de entrega:");
		lblDataDeEntrega.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDataDeEntrega.setBounds(10, 66, 143, 17);
		contentPane.add(lblDataDeEntrega);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblQuantidade.setBounds(10, 112, 143, 14);
		contentPane.add(lblQuantidade);
		
		txtNome = new JTextField();
		txtNome.setEditable(false);
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNome.setBounds(173, 15, 126, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		txtNome.setText(nome);
		
		JLabel lblSabor = new JLabel("1\u00BA Sabor:");
		lblSabor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSabor.setBounds(10, 196, 143, 14);
		contentPane.add(lblSabor);
		
		JLabel lblSabor_1 = new JLabel("2\u00BA Sabor:");
		lblSabor_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSabor_1.setBounds(10, 236, 143, 14);
		contentPane.add(lblSabor_1);
		
		JLabel lblSabor_2 = new JLabel("3\u00BA Sabor:");
		lblSabor_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSabor_2.setBounds(10, 275, 143, 14);
		contentPane.add(lblSabor_2);
		
		JLabel lblSabor_3 = new JLabel("4\u00BA Sabor:");
		lblSabor_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSabor_3.setBounds(10, 318, 143, 14);
		contentPane.add(lblSabor_3);
		
		txtData = new JTextField();
		txtData.setEditable(false);
		txtData.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtData.setBounds(173, 61, 90, 20);
		contentPane.add(txtData);
		txtData.setColumns(10);
		txtData.setText(data);
		
		txtSabor1 = new JTextField();
		txtSabor1.setEditable(false);
		txtSabor1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtSabor1.setBounds(173, 196, 126, 20);
		contentPane.add(txtSabor1);
		txtSabor1.setColumns(10);
		txtSabor1.setText(sabor1);
		
		txtSabor2 = new JTextField();
		txtSabor2.setEditable(false);
		txtSabor2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtSabor2.setBounds(173, 233, 126, 20);
		contentPane.add(txtSabor2);
		txtSabor2.setColumns(10);
		txtSabor2.setText(sabor2);
		
		txtSabor3 = new JTextField();
		txtSabor3.setEditable(false);
		txtSabor3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtSabor3.setBounds(173, 272, 126, 20);
		contentPane.add(txtSabor3);
		txtSabor3.setColumns(10);
		txtSabor3.setText(sabor3);
		
		txtSabor4 = new JTextField();
		txtSabor4.setEditable(false);
		txtSabor4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtSabor4.setBounds(173, 315, 126, 20);
		contentPane.add(txtSabor4);
		txtSabor4.setColumns(10);
		txtSabor4.setText(sabor4);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBackground(SystemColor.menu);
		btnConfirmar.addActionListener(this);
		btnConfirmar.setActionCommand("ok");
		btnConfirmar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnConfirmar.setBounds(10, 358, 105, 23);
		contentPane.add(btnConfirmar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBackground(SystemColor.menu);
		btnCancelar.addActionListener(this);
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCancelar.setBounds(193, 358, 96, 25);
		contentPane.add(btnCancelar);
		
		txtQuantidade = new JTextField();
		txtQuantidade.setEditable(false);
		txtQuantidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtQuantidade.setBounds(173, 109, 126, 20);
		contentPane.add(txtQuantidade);
		txtQuantidade.setColumns(10);
		txtQuantidade.setText(quant);
		
		JLabel lblCaixa = new JLabel("Caixa:");
		lblCaixa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCaixa.setBounds(10, 152, 126, 14);
		contentPane.add(lblCaixa);
		
		txtCaixaDe = new JTextField();
		txtCaixaDe.setEditable(false);
		txtCaixaDe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtCaixaDe.setText("Caixa de 20");
		txtCaixaDe.setBounds(173, 151, 126, 20);
		contentPane.add(txtCaixaDe);
		txtCaixaDe.setColumns(10);
		
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
			tela = new TelaCriarC20(nomeC, dataC, quantC);
		}
		tela.setVisible(true);
		this.dispose();
	}
}
