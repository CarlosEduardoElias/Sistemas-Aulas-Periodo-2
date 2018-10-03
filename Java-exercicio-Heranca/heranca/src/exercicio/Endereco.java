package exercicio;

public class Endereco {
	private String cidade;
	private int numero;
	private String bairro;
	private String estado;
	private String pais;

public Endereco() {
}
public Endereco(String cidade, int numero, String bairro,  String estado, String pais){
	this.cidade = cidade;
	this.numero = numero;
	this.bairro = bairro;
	this.cidade = cidade;
	this.estado = estado;
	this.pais = pais;
}
public String getCidade(){
	return cidade;
}
public void setCidade(String cidade) {
	this.cidade = cidade;
}
public int getNumero(){
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
public String getBairro(){
	return bairro;
}
public void setBairro(String bairro) {
	this.bairro = bairro;
}
public String getEstado(){
	return estado;
}
public void setEstado(String estado) {
	this.estado = estado;
}
public String getPais(){
	return pais;
}
public void setPais(String pais) {
	this.pais = pais;
}
public String toString() {
	return "Cidade: " + getCidade() + "\n" + "Estado: " + getEstado() + "\n" + "Pais: " + getPais();
}
}

