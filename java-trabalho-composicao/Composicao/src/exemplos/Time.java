package exemplos;

public class Time {
	private String nome;
	private String tecnico;
	
	public Time(String nome, String tecnico){
		this.nome = nome;
		this.tecnico = tecnico;
	}
	
	public void nome(String nome) {
		this.nome = nome;
	}
	
	public void tecnico(String tecnico) {
		this.tecnico = tecnico;
	}
	
	public String toString(){
		return "Time: " + nome + "\n" + "Tecnico: " + tecnico;
	}
}
