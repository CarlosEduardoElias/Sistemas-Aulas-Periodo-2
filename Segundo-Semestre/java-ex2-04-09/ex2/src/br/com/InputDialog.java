package br.com;

import javax.swing.JOptionPane;

public class InputDialog {
	public static void main(String[ ]args){
		String input = JOptionPane.showInputDialog(null, "Digite algo:", "Tela de Entrada", 1);
		System.out.println("Você digitou:" + input);
	}
}
