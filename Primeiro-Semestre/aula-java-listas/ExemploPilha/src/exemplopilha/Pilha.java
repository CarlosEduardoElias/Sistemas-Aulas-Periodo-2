package exemplopilha;

import javax.swing.JOptionPane;

public class Pilha {
	
	String vet[] = {"Flash, Thor, Goku, Wolverine"};
	int inicio; 
	int fim;
	int tamanho;
	int qtdeElementos;
	
	public  Pilha(){
		//inicio = fim = -1;
		inicio = fim = -1;
		tamanho = 4;
		qtdeElementos = 0;
	}
	
	public boolean estaVazio(){
		if (qtdeElementos == 0){
			return true;
	}
			return false;
	}
	
	public boolean estaCheia(){
		if (qtdeElementos == tamanho -1){
			return true;
		}
			return false;
	}
	
	public void romover(){
		if (!estaVazio()){
			fim--;
			qtdeElementos--;
		}
	}
	
	public void mostrar(){
		String elementos = "";
		for (int i = fim; i >= 0; i--){
			elementos += vet[1] + " - ";
		}
		JOptionPane.showMessageDialog(null, elementos);
	}
}
