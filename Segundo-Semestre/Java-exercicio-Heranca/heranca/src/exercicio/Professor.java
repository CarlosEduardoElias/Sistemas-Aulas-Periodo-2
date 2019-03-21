package exercicio;

public class Professor {
	private int codigo;
	private double salario;
	private String titulo;
	private int cargahoraria;

public Professor() {
	
}
public Professor(int codigo, double salario, String titulo, int carga) {
	this.codigo = codigo;
	this.salario = salario;
	this.titulo = titulo;
	this.cargahoraria = carga;
}
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public double getSalario() {
	return salario;
}
public void setSalario(double salario) {
	this.salario = salario;
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo =  titulo;
}
public int getCarga() {
	return cargahoraria;
}
public void setCarga(int carga) {
	this.cargahoraria = carga;
}
public String toString() {
	return "Codigo: " + getCodigo() + "\n" + "Salario: " + getSalario() + "\n" +  "Titulo: " + getTitulo() + "\n" +  "Carga Horaria: " + getCarga();
}
}