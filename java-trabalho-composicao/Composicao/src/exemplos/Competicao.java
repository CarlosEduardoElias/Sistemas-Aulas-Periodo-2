package exemplos;

public class Competicao {
	public static void main(String[]args) {
		Ciclista c = new Ciclista(null, null, 0);
		c.ciclista("Cadu");
		c.equipe("Dourabikers");
		c.numero(18);
		System.out.println(c);
		System.out.println("============================");
		Bike b = new Bike(null, null, null, 0);
		b.tipo("MTB");
		b.modelo("WnB");
		b.quadro("Alum�nio");
		b.aro(29);
		System.out.println(b);
		System.out.println("============================");
	}
}