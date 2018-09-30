package exercicio;

public class Pessoa extends Endereco{
	private String nome;
	private String cpf;
	private String rg;
	
public Pessoa(){
	
}

public Pessoa(String endereco, String nome, String cpf, String rg) {
	super(endereco);
	this.nome = nome;
	this.cpf = cpf;
	this.rg = rg;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getCpf() {
	return cpf;
}
public void setCpf(String cpf) {
	this.cpf = cpf;
}
public String getRg() {
	return rg;
}
public void setRg(String rg) {
	this.rg = rg;
}

public String toString() {
	return "nome: " + getNome() + "\n"
		+ "CPF: " + getCpf() + "\n"
		+ "RG: " + getRg() + "\n"
		+ "Endereco: " + getEndereco() + "\n";
}
}
