 package br.com.gff.lista.apresentacao;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class TelaCriarC20 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtData;
	private JButton btnCancelar;
	private JButton btnOk;
	
	private JComboBox cboSabor1;
	private JComboBox cboSabor2;
	private JComboBox cboSabor3;
	private JComboBox cboSabor4;
	
	private String nomeC, dataC, quantC, sabor1, sabor2, sabor3, sabor4;
 
	/**
	 * Create the frame.
	 * @param dataC 
	 * @param nomeC 
	 * @param quant 
	 */
	public TelaCriarC20(String nome, String data, String quant) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 311, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNome.setBounds(10, 11, 84, 14);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setEditable(false);
		txtNome.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtNome.setBounds(141, 8, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		txtNome.setText(nome);
		
		txtData = new JTextField();
		txtData.setEditable(false);
		txtData.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtData.setBounds(141, 54, 86, 20);
		contentPane.add(txtData);
		txtData.setColumns(10);
		txtData.setText(data);
		
		JLabel lblSabor = new JLabel("1\u00BA Sabor:");
		lblSabor.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblSabor.setBounds(10, 118, 95, 14);
		contentPane.add(lblSabor);
		
		JLabel lblSabor_1 = new JLabel("2\u00BA Sabor:");
		lblSabor_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblSabor_1.setBounds(10, 154, 95, 14);
		contentPane.add(lblSabor_1);
		
		JLabel lblSabor_2 = new JLabel("3\u00BA Sabor:");
		lblSabor_2.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblSabor_2.setBounds(10, 202, 95, 14);
		contentPane.add(lblSabor_2);
		
		JLabel lblSabor_3 = new JLabel("4\u00BA Sabor:");
		lblSabor_3.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblSabor_3.setBounds(10, 256, 95, 14);
		contentPane.add(lblSabor_3);
		
		JLabel lblDataDeEntrega = new JLabel("Data de entrega:");
		lblDataDeEntrega.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblDataDeEntrega.setBounds(10, 57, 141, 17);
		contentPane.add(lblDataDeEntrega);
		
		cboSabor1 = new JComboBox();
		cboSabor1.setFont(new Font("Dialog", Font.PLAIN, 14));
		cboSabor1.setBackground(SystemColor.text);
		cboSabor1.setModel(new DefaultComboBoxModel(new String[] {"Ao Leite", "Meio Amargo", "Branco", "Beijinho", "Oreo", "Ninho Nutella", "Pa\u00E7oca", "Damasco", "Confeti", "Ninho", "Caf\u00E9", "Frutas Vermelhas", "Prest\u00EDgio", "Palha Italiana", "Lim\u00E3o"}));
		cboSabor1.setBounds(128, 114, 148, 20);
		contentPane.add(cboSabor1);
		
		cboSabor2 = new JComboBox();
		cboSabor2.setFont(new Font("Dialog", Font.PLAIN, 14));
		cboSabor2.setBackground(SystemColor.text);
		cboSabor2.setModel(new DefaultComboBoxModel(new String[] {"-------------------", "Ao Leite", "Meio Amargo", "Branco", "Beijinho", "Oreo", "Ninho Nutella", "Pa\u00E7oca", "Damasco", "Confeti", "Ninho", "Caf\u00E9", "Frutas Vermelhas", "Prest\u00EDgio", "Palha Italiana", "Lim\u00E3o"}));
		cboSabor2.setBounds(128, 154, 148, 20);
		contentPane.add(cboSabor2);
		
		cboSabor3 = new JComboBox();
		cboSabor3.setFont(new Font("Dialog", Font.PLAIN, 14));
		cboSabor3.setBackground(SystemColor.text);
		cboSabor3.setModel(new DefaultComboBoxModel(new String[] {"-------------------", "Ao Leite", "Meio Amargo", "Branco", "Beijinho", "Oreo", "Ninho Nutella", "Pa\u00E7oca", "Damasco", "Confeti", "Ninho", "Caf\u00E9", "Frutas Vermelhas", "Prest\u00EDgio", "Palha Italiana", "Lim\u00E3o"}));
		cboSabor3.setBounds(128, 199, 148, 20);
		contentPane.add(cboSabor3);
		
		cboSabor4 = new JComboBox();
		cboSabor4.setFont(new Font("Dialog", Font.PLAIN, 14));
		cboSabor4.setBackground(SystemColor.text);
		cboSabor4.setModel(new DefaultComboBoxModel(new String[] {"-------------------", "Ao Leite", "Meio Amargo", "Branco", "Beijinho", "Oreo", "Ninho Nutella", "Pa\u00E7oca", "Damasco", "Confeti", "Ninho", "Caf\u00E9", "Frutas Vermelhas", "Prest\u00EDgio", "Palha Italiana", "Lim\u00E3o"}));
		cboSabor4.setBounds(128, 256, 148, 20);
		contentPane.add(cboSabor4);
		
		btnOk = new JButton("OK");
		btnOk.addActionListener(this);
		btnOk.setActionCommand("ok");
		btnOk.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnOk.setBackground(SystemColor.menu);
		btnOk.setBounds(23, 304, 89, 23);
		contentPane.add(btnOk);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBackground(SystemColor.menu);
		btnCancelar.addActionListener(this);
		btnCancelar.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnCancelar.setBounds(144, 304, 106, 23);
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
			sabor1 = (String) cboSabor1.getSelectedItem();
			sabor2 = (String) cboSabor2.getSelectedItem();
			sabor3 = (String) cboSabor3.getSelectedItem();
			sabor4 = (String) cboSabor4.getSelectedItem();
			tela = new TelaResumo20(nomeC, dataC, quantC, sabor1, sabor2, sabor3, sabor4);
		}else {
			tela = new TelaCriar(nomeC, dataC);
		}
		tela.setVisible(true);
		this.dispose();
	}
}
