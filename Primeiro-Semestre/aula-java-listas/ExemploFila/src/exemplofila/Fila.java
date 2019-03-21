package exemplofila;

import javax.swing.JOptionPane;

public class Fila {
	
	int inicio;
	int fim;
	int tamanho;
	int qtdeElementos;
	int fila[];
	
	public Fila(){
		inicio = -1;
		fim = -1;
		tamanho = 100;
		fila = new int[tamanho];
		qtdeElementos = 0;
	}
	
	public boolean estaVazia(){
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
	
	public void adicionar(int valor){
		if (!estaCheia()){
			if (inicio == -1){
				inicio = 0;
			}
			fim++;
			fila[fim] = valor;
			qtdeElementos++;
		}
	}	
	
		public void remover(){
			if (!estaVazia())
				inicio++;
			qtdeElementos--;
		}
	
	
		public void mostrar(){
			String elementos = "";
			for (int i = inicio; i <= fim; i++){
				elementos += fila[i] + " - ";
			}
				JOptionPane.showMessageDialog(null, elementos);
		}
}

