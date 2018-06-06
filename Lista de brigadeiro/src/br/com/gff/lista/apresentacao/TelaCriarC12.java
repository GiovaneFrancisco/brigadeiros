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

public class TelaCriarC12 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtData;
	private JButton btnOk;
	private JButton btnCancelar;
	private JComboBox cboSabor1;
	private JComboBox cboSabor2;
	private JComboBox cboSabor3;
	
	private String nomeC, dataC, quantC;
 

	/**
	 * Create the frame.
	 * @param dataC 
	 * @param nomeC 
	 * @param quant 
	 */
	public TelaCriarC12(String nome, String data, String quant) {
		setTitle("Caixa de 12");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 330, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNome.setBounds(10, 11, 46, 14);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtNome.setEditable(false);
		txtNome.setBounds(170, 8, 126, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		txtNome.setText(nome);
		
		JLabel lblDataDeEntrega = new JLabel("Data de entrega: ");
		lblDataDeEntrega.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblDataDeEntrega.setBounds(10, 60, 131, 17);
		contentPane.add(lblDataDeEntrega);
		
		txtData = new JTextField();
		txtData.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtData.setEditable(false);
		txtData.setBounds(170, 60, 90, 20);
		contentPane.add(txtData);
		txtData.setColumns(10);
		txtData.setText(data);
		
		
		JLabel lblSabor = new JLabel("1\u00BA Sabor:");
		lblSabor.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblSabor.setBounds(10, 123, 131, 14);
		contentPane.add(lblSabor);
		
		JLabel lblSabor_1 = new JLabel("2\u00BA Sabor:");
		lblSabor_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblSabor_1.setBounds(10, 172, 131, 14);
		contentPane.add(lblSabor_1);
		
		JLabel lblSabor_2 = new JLabel("3\u00BA Sabor:");
		lblSabor_2.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblSabor_2.setBounds(10, 220, 131, 14);
		contentPane.add(lblSabor_2);
		
		cboSabor1 = new JComboBox();
		cboSabor1.setBackground(SystemColor.text);
		cboSabor1.setFont(new Font("Dialog", Font.PLAIN, 14));
		cboSabor1.setModel(new DefaultComboBoxModel(new String[] {"Ao Leite", "Meio Amargo", "Branco", "Beijinho", "Oreo", "Ninho Nutella", "Pa\u00E7oca", "Damasco", "Confeti", "Ninho", "Caf\u00E9", "Frutas Vermelhas", "Prest\u00EDgio", "Palha Italiana", "Lim\u00E3o"}));
		cboSabor1.setBounds(151, 120, 125, 20);
		contentPane.add(cboSabor1);
		
		cboSabor2 = new JComboBox();
		cboSabor2.setBackground(SystemColor.text);
		cboSabor2.setFont(new Font("Dialog", Font.PLAIN, 14));
		cboSabor2.setModel(new DefaultComboBoxModel(new String[] {"-------------------", "Ao Leite", "Meio Amargo", "Branco", "Beijinho", "Oreo", "Ninho Nutella", "Pa\u00E7oca", "Damasco", "Confeti", "Ninho", "Caf\u00E9", "Frutas Vermelhas", "Prest\u00EDgio", "Palha Italiana", "Lim\u00E3o"}));
		cboSabor2.setBounds(151, 166, 125, 20);
		contentPane.add(cboSabor2);
		
		cboSabor3 = new JComboBox();
		cboSabor3.setBackground(SystemColor.text);
		cboSabor3.setFont(new Font("Dialog", Font.PLAIN, 14));
		cboSabor3.setModel(new DefaultComboBoxModel(new String[] {"-------------------", "Ao Leite", "Meio Amargo", "Branco", "Beijinho", "Oreo", "Ninho Nutella", "Pa\u00E7oca", "Damasco", "Confeti", "Ninho", "Caf\u00E9", "Frutas Vermelhas", "Prest\u00EDgio", "Palha Italiana", "Lim\u00E3o"}));
		cboSabor3.setBounds(151, 217, 125, 20);
		contentPane.add(cboSabor3);
		
		btnOk = new JButton("OK");
		btnOk.addActionListener(this);
		btnOk.setActionCommand("ok");
		btnOk.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnOk.setBackground(SystemColor.menu);
		btnOk.setBounds(30, 276, 89, 23);
		contentPane.add(btnOk);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setActionCommand("cancelar");
		btnCancelar.setBackground(SystemColor.menu);
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCancelar.setBounds(170, 276, 89, 25);
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
			String sabor1 = (String) cboSabor1.getSelectedItem();
			String sabor2 = (String) cboSabor2.getSelectedItem();
			String sabor3 = (String) cboSabor3.getSelectedItem();
			
			tela = new TelaResumo12(sabor1, sabor2, sabor3, nomeC, dataC, quantC);
		}else if (cmd.equals("cancelar")){
			tela = new TelaCriar(nomeC, dataC);
		}
		tela.setVisible(true);
		this.dispose();
	}
}
