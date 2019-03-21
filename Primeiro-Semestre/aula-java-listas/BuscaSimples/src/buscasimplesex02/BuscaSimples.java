package buscasimplesex02;

public class BuscaSimples {

	public static void main(String[] args) {
		BuscaSimples buscaSimples = new BuscaSimples();
		String[] vetor = {"Wolverine", "Dead Pool", "Homem Aranha", "Spawn"};
		
		int resultado = buscaSimples.busca(vetor, "Spawn");
		System.out.println("Valor encontrado no índice: " + resultado);

	}
	
	private int busca(String[] vetor, String x){
		for (int i = 0; i < vetor.length; i++){
			if (vetor[i] == x){
				return i;
			}
		}
		return -1;
	}

}
