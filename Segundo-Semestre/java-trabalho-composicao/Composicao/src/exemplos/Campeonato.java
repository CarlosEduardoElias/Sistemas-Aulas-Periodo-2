package exemplos;

public class Campeonato {
	public static void main(String[]args) {
		Time t = new Time(null, null);
		t.nome("S�o Paulo");
		t.tecnico("Tite");
		System.out.println(t);
		System.out.println("============================");
		Jogador j = new Jogador(null, 0, null);
		j.nome("Neymar Robinho P�le da Silva Ronaldinho");
		j.idade(18);
		j.posicao("Atacante");
		System.out.println(j);
		System.out.println("============================");
	}
}
