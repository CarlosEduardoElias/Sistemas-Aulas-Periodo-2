package buscasimples.ex01;

import buscasimplesex02.BuscaSimples;

public class BuscaSimples {

	public static void main(String[] args) {
		
		BuscaSimples buscaSimples = new BuscaSimples();
		
		int vetor[] = {64, 34, 35, 12, 22, 11, 90};
		int resultado = buscaSimples.busca(vetor, 25);
		System.out.println("Valor encontrado na posição: " + resultado);
	}

	private int busca(int[] vetor, int x){
		int contador = 0;
		
		while(contador < vetor.length && vetor[contador] != x ){
			contador++;
		}
		
		if (contador == vetor.length){
			return -1;
		} else {
			return contador;
		}
	}
	
}
