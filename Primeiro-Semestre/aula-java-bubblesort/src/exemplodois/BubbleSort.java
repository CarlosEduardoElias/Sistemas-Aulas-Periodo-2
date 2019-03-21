package exemplodois;

public class BubbleSort {

	public static void main(String[] args) {
		
	   BubbleSort bubble = new BubbleSort();
	   int [] vetor = {64, 34, 25, 12, 22, 11, 90};
	   bubble.bubbleSortAsc(vetor);
	   System.out.println("Vetor Ordenado: ");
	   bubble.printVetor(vetor);
		
	}
	private void bubbleSortAsc(int [] vetor){
		int tamanhoVetor = vetor.length;
		
		for(int i =0; i < tamanhoVetor -1; i++){
			for(int j = 0; j < tamanhoVetor - i -1; j++){
				if (vetor[j] > vetor[j+1]){
					//troca temporária
					int temp = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = temp;
				}
			}
		}
	}
	private void printVetor(int [] vetor){
		int tamanhoVetor = vetor.length;
		
		for (int i = 0; i < tamanhoVetor; i++){
			System.out.println(vetor[i]);
		}
		
	}

}
