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
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.DefaultComboBoxModel;

public class TelaCriarC6 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtData;
	private JComboBox cboSabor1;
	private JComboBox cboSabor2;
	
	private String nomeC, dataC, tipo, quantC;
 

	/**
	 * Create the frame.
	 */
	public TelaCriarC6(String nome, String data, String quant) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 329, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Nome:");
		label.setFont(new Font("Dialog", Font.PLAIN, 14));
		label.setBounds(10, 17, 46, 14);
		contentPane.add(label);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtNome.setEditable(false);
		txtNome.setColumns(10);
		txtNome.setBounds(170, 11, 126, 20);
		contentPane.add(txtNome);
		txtNome.setText(nome);
		
		JLabel label_1 = new JLabel("Data de Entrega: ");
		label_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		label_1.setBounds(10, 51, 150, 20);
		contentPane.add(label_1);
		
		txtData = new JTextField();
		txtData.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtData.setEditable(false);
		txtData.setColumns(10);
		txtData.setBounds(170, 51, 90, 21);
		contentPane.add(txtData);
		txtData.setText(data);
		
		JLabel label_2 = new JLabel("1\u00BA Sabor:");
		label_2.setFont(new Font("Dialog", Font.PLAIN, 14));
		label_2.setBounds(10, 123, 106, 20);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("2\u00BA Sabor:");
		label_3.setFont(new Font("Dialog", Font.PLAIN, 14));
		label_3.setBounds(10, 184, 106, 16);
		contentPane.add(label_3);
		
		cboSabor1 = new JComboBox();
		cboSabor1.setModel(new DefaultComboBoxModel(new String[] {"Ao Leite", "Meio Amargo", "Branco", "Beijinho", "Oreo", "Ninho Nutella", "Pa\u00E7oca", "Damasco", "Confeti", "Ninho", "Caf\u00E9", "Frutas Vermelhas", "Prest\u00EDgio", "Palha Italiana", "Lim\u00E3o"}));
		cboSabor1.setFont(new Font("Dialog", Font.PLAIN, 14));
		cboSabor1.setBackground(Color.WHITE);
		cboSabor1.setBounds(170, 125, 126, 20);
		contentPane.add(cboSabor1);
		
		cboSabor2 = new JComboBox();
		cboSabor2.setModel(new DefaultComboBoxModel(new String[] {"-------------------", "Ao Leite", "Meio Amargo", "Branco", "Beijinho", "Oreo", "Ninho Nutella", "Pa\u00E7oca", "Damasco", "Confeti", "Ninho", "Caf\u00E9", "Frutas Vermelhas", "Prest\u00EDgio", "Palha Italiana", "Lim\u00E3o"}));
		cboSabor2.setFont(new Font("Dialog", Font.PLAIN, 14));
		cboSabor2.setBackground(Color.WHITE);
		cboSabor2.setBounds(170, 184, 126, 20);
		contentPane.add(cboSabor2);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(this);
		btnOk.setActionCommand("ok");
		btnOk.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnOk.setBackground(SystemColor.menu);
		btnOk.setActionCommand("ok");
		btnOk.setBounds(55, 228, 89, 23);
		contentPane.add(btnOk);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setActionCommand("cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCancelar.setBackground(SystemColor.menu);
		btnCancelar.setActionCommand("cancelar");
		btnCancelar.setBounds(170, 228, 109, 23);
		contentPane.add(btnCancelar);

		nomeC = nome;
		dataC = data;
		tipo = "Caixa 6";
		quantC = quant;
		
		setLocationRelativeTo(null);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		JFrame tela = null;
		
		if(cmd.equals("ok")) {
			String sabor1 = (String) cboSabor1.getSelectedItem();
			String sabor2 = (String) cboSabor2.getSelectedItem();
			tela = new TelaResumoC46(sabor1, sabor2, nomeC, dataC, tipo, quantC);
		}else if(cmd.equals("cancelar")){
			tela = new TelaCriar(nomeC, dataC);
		}
		tela.setVisible(true);
		this.dispose();
	}
}
