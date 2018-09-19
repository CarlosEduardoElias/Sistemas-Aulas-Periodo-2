package exemplos;

public class Jogador {
	private String nome;
	private int idade;
	private String posicao;
	
	public Jogador(String nome, int idade, String posicao) {
		this.nome = nome;
		this.idade = idade;
		this.posicao = posicao;
	}
	
	public void nome(String nome) {
		this.nome = nome;
	}
	
	public void idade(int idade) {
		this.idade = idade;
	}
	
	public void posicao(String posicao) {
		this.posicao = posicao;
	}
	
	public String toString() {
		return "Nome: " + nome + "\n" + "idade: " + idade + "\n" + "Posição: " + posicao;
	}
}
