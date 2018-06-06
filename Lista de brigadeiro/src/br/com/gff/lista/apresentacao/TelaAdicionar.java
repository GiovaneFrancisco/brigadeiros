package br.com.gff.lista.apresentacao;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

public class TelaAdicionar extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtNome;
	private JFormattedTextField txfData;
	private JFormattedTextField txfData_1;
	private JButton btnCancelar;

	/**
	 * Create the frame.
	 */
	public TelaAdicionar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 379, 183);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNome.setBounds(10, 14, 194, 14);
		contentPane.add(lblNome);

		txtNome = new JTextField();
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNome.setBounds(178, 8, 160, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		JLabel lblDtaDeEntrega = new JLabel("Data de entrega:");
		lblDtaDeEntrega.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDtaDeEntrega.setBounds(10, 60, 194, 20);
		contentPane.add(lblDtaDeEntrega);

		txfData = new JFormattedTextField();
		try {
			txfData_1 = new JFormattedTextField(new MaskFormatter("##/##/####"));
			txfData_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			assert false : "Erro de quantidade"; // Caso algo no desenvolvimento de errado, aparecerá o erro para o
													// desenvolvedor
		}
		txfData_1.setBounds(178, 60, 91, 20);
		contentPane.add(txfData_1);

		JButton btnOk = new JButton("OK");
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnOk.addActionListener(this);
		btnOk.setActionCommand("ok");
		btnOk.setBackground(SystemColor.menu);
		btnOk.setBounds(62, 111, 89, 23);
		contentPane.add(btnOk);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setActionCommand("cancelar");
		btnCancelar.setBackground(SystemColor.menu);
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCancelar.setBounds(180, 113, 89, 23);
		contentPane.add(btnCancelar);

		setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		JFrame tela = null;
		String nome, data;

		if (cmd.equals("ok")) {
			nome = txtNome.getText();
			data = txfData_1.getText();
			if (nome.equals("") || data.equals("  /  /    ")) {
					JOptionPane.showMessageDialog(null, "Complete todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
					tela = new TelaAdicionar();
				
			}else {
				tela = new TelaCriar(nome, data);
			}
		} else {
			tela = new TelaInicio();
		}
		tela.setVisible(true);
		this.dispose();
	}
}
