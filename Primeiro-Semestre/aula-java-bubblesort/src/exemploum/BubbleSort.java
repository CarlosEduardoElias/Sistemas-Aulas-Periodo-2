package exemploum;

public class BubbleSort {

	public static void main(String[] args) {
	int[] vetor = {8, 9, 3, 5, 1,};
	int aux = 0;
	//int i =0;
	
	System.out.println("Vetor desordenado: ");
	for (int i = 0; i<5; i++){
		System.out.println(" "+ vetor[i]);
	}
	System.out.println("======================");
	
	for( int i = 0; i < 5; i++){
		//laço repete 4x, pois na quinta iria 
		//comparar o valor com uma posição que não existe.
		for(int j = 0; j < 4; j++){
			 if(vetor[j] > vetor [j + 1]){
				aux = vetor[j];
				vetor[j] = vetor[j + 1];
				vetor[j +1 ] = aux;
			 }
		}
	 }
		System.out.println("Vetor Ordenado: ");
		for (int i =0; i <5; i++){
		System.out.println(vetor[i]);
		}
	}

}
