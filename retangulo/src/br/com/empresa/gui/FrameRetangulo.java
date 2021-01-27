package br.com.empresa.gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameRetangulo {
	
	public void criarTela() {
		
		// *** Contruir a tela
		JFrame tela = new JFrame();
		tela.setTitle("Calculo com Ret�ngulo");
		tela.setSize(600, 400);
		tela.setDefaultCloseOperation(3);
		tela.setLayout(null);
		
		// *** Contruir um JLabel
		JLabel labelAltura = new JLabel();
		labelAltura.setText("Altura:");
		labelAltura.setBounds(10, 10, 60, 30);
		
		tela.getContentPane().add(labelAltura);
		
		// *** Contruir um JTextFild
		JTextField textAltura = new JTextField();
		textAltura.setBounds(70, 10, 60, 30);
		
		tela.getContentPane().add(textAltura);
		
		tela.setVisible(true);
		
	}
	
}