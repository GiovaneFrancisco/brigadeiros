package br.com.gff.lista.apresentacao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TelaCriarCento extends JFrame {

	private JPanel contentPane;
 
	/**
	 * Create the frame.
	 * @param dataC 
	 * @param nomeC 
	 * @param quant 
	 */
	public TelaCriarCento(String nomeC, String dataC, String quant) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
