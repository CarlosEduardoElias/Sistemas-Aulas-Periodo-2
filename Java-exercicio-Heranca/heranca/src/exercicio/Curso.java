package exercicio;

public class Curso {
	private String nomecurso;

public Curso(){
}
public Curso(String nomecurso) {
	this.nomecurso = nomecurso;
}
public String getNomeCurso() {
	return nomecurso;
}
public void setNomeCurso(String nomecurso) {
	this.nomecurso = nomecurso;
}
public String toString() {
	return getNomeCurso();
}
}
