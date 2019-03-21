package buscabinariaex01;

public class BuscaBinaria {

	public static void main(String[] args) {
		BuscaBinaria buscaBinaria = new BuscaBinaria();
		int vetor[] = {11, 15, 25, 36, 88};
		
		int resultado = buscaBinaria.busca(vetor, 36);
		
		System.out.println("Valor encontrado no índice: " + resultado);
	}
	
	private int busca(int[] vetor, int x){
		int inicio = 0;
		int fim = vetor.length - 1;
		
		while(inicio <= fim){
			int meio = (inicio + fim) /2; //meio do vetor
			if(vetor[meio] > x){
				fim = meio -1;
			} else if(vetor[meio] < x){
				inicio = meio +1;
			} else {
				return meio;
			}
		}return -1;
	}
}
