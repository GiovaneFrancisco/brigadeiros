package br.com.gff.lista.apresentacao;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TelaInicio extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton btnBuscar;
	private JButton btnAdicionar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicio frame = new TelaInicio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaInicio() {
		setTitle("In\u00EDcio");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnAdicionar = new JButton("Adicionar um pedido");
		btnAdicionar.addActionListener(this);
		btnAdicionar.setActionCommand("adc");
		btnAdicionar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAdicionar.setBackground(SystemColor.menu);
		btnAdicionar.setBounds(10, 11, 236, 240);
		contentPane.add(btnAdicionar);
		
		btnBuscar = new JButton("Buscar um pedido");
		btnBuscar.addActionListener(this);
		btnBuscar.setActionCommand("buscar");
		btnBuscar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnBuscar.setBackground(SystemColor.menu);
		btnBuscar.setBounds(252, 11, 236, 240);
		contentPane.add(btnBuscar);
		
		setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();		
		JFrame tela = null;
		if(cmd.equals("adc")) {
			tela = new TelaAdicionar();
		}else {
			tela = new TelaBuscar();
		}
		tela.setVisible(true);
		this.dispose();
	
	}
}
