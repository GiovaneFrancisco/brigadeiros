package br.com.gff.lista.apresentacao;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.SystemColor;

public class TelaCriarC4 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtData;
	private JLabel lblSabor;
	private JLabel lblSabor_1;
	private JComboBox cboSabor1;
	private JComboBox cboSabor2;
	private JButton btnOk;
	private JButton btnCancelar;
	
	private String nome, data, tipo, quant;


	  
	/**
	 * Create the frame.
	 * @param dataC 
	 * @param nomeC 
	 * @param quant 
	 */
	public TelaCriarC4(String nomeC, String dataC, String quantC) {
		setResizable(false);
		setTitle("Caixa de 4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 330, 290);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNome.setBounds(10, 17, 46, 14);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtNome.setEditable(false);
		txtNome.setBounds(170, 11, 126, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		txtNome.setText(nomeC);
		
		JLabel lblDataDeEntrega = new JLabel("Data de Entrega: ");
		lblDataDeEntrega.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblDataDeEntrega.setBounds(10, 51, 150, 20);
		contentPane.add(lblDataDeEntrega);
		
		txtData = new JTextField();
		txtData.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtData.setEditable(false);
		txtData.setBounds(170, 51, 90, 21);
		contentPane.add(txtData);
		txtData.setColumns(10);
		txtData.setText(dataC);
		
		lblSabor = new JLabel("1\u00BA Sabor:");
		lblSabor.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblSabor.setBounds(10, 123, 106, 20);
		contentPane.add(lblSabor);
		
		lblSabor_1 = new JLabel("2\u00BA Sabor:");
		lblSabor_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblSabor_1.setBounds(10, 184, 106, 16);
		contentPane.add(lblSabor_1);
		
		cboSabor1 = new JComboBox();
		cboSabor1.setBackground(SystemColor.text);
		cboSabor1.setFont(new Font("Dialog", Font.PLAIN, 14));
		cboSabor1.setModel(new DefaultComboBoxModel(new String[] {"Ao Leite", "Meio Amargo", "Branco", "Beijinho", "Oreo", "Ninho Nutella", "Pa\u00E7oca", "Damasco", "Confeti", "Ninho", "Caf\u00E9", "Frutas Vermelhas", "Prest\u00EDgio", "Palha Italiana", "Lim\u00E3o"}));
		cboSabor1.setBounds(170, 125, 126, 20);
		contentPane.add(cboSabor1);
		
		cboSabor2 = new JComboBox();
		cboSabor2.setBackground(SystemColor.text);
		cboSabor2.setModel(new DefaultComboBoxModel(new String[] {"-------------------", "Ao Leite", "Meio Amargo", "Branco", "Beijinho", "Oreo", "Ninho Nutella", "Pa\u00E7oca", "Damasco", "Confeti", "Ninho", "Caf\u00E9", "Frutas Vermelhas", "Prest\u00EDgio", "Palha Italiana", "Lim\u00E3o"}));
		cboSabor2.setFont(new Font("Dialog", Font.PLAIN, 14));
		cboSabor2.setBounds(170, 184, 126, 20);
		contentPane.add(cboSabor2);
		
		btnOk = new JButton("OK");
		btnOk.addActionListener(this);
		btnOk.setActionCommand("ok");
		btnOk.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnOk.setBackground(SystemColor.menu);
		btnOk.setBounds(55, 228, 89, 23);
		contentPane.add(btnOk);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBackground(SystemColor.menu);
		btnCancelar.addActionListener(this);
		btnCancelar.setActionCommand("cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCancelar.setBounds(170, 228, 109, 23);
		contentPane.add(btnCancelar);
		
		
		nome = nomeC;
		data = dataC;
		tipo = "Caixa 4";
		quant = quantC;
		setLocationRelativeTo(null);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		JFrame tela = null;
		
		if(cmd.equals("ok")) {
			String sabor1 = (String) cboSabor1.getSelectedItem();
			String sabor2 = (String) cboSabor2.getSelectedItem();
			tela = new TelaResumoC46(sabor1, sabor2, nome, data, tipo, quant);
		}else {
			tela = new TelaCriar(nome, data);
		}
		tela.setVisible(true);
		this.dispose();
	}
}
