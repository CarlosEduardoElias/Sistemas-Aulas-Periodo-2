package exercicio;

public class Aluno extends Pessoa{
	private int matricula;
	private Curso curso;


public Aluno() {	
}
public Aluno(String nome, String cpf, String rg, Endereco endereco, int matricula, Curso curso, Professor professor) {
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
public String getCurso() {
	return curso.getNomeCurso();
}
public void setCurso(Curso curso) {
	this.curso.setNomeCurso(getCurso());
}
public String toString() {
	String str = "Nome: " + getNome() + "\n"
			+ "CPF: " + getCpf() + "\n"
			+ "RG: " + getRg() + "\n"
			+ "Matricula: " + getMatricula() + "\n"
			;
	return str;
}
}
