package exercicio;

public class Aluno extends Pessoa{
	private int matricula;
	private Curso curso;

public Aluno() {	
}
public Aluno(String nome, String cpf, String rg, String endereco, int matricula, Curso curso) {
	super(nome,cpf,rg,endereco);
	this.matricula = matricula;
	this.curso = curso;
}
public int getMatricula() {
	return matricula;
}
public void setMatricula(int matricula) {
	this.matricula = matricula;
}
public Curso getCurso() {
	return curso;
}
public void setCurso(Curso curso) {
	this.curso = curso;
}
public String toString() {
	String str = "nome: " + getNome() + "\n"
			+ "CPF: " + getCpf() + "\n"
			+ "RG: " + getRg() + "\n"
			+ "Endereco: " + getEndereco() + "\n"
			+ "Matricula: " + getMatricula() + "\n"
			+ "Curso: " + this.curso;
	return str;
}
}