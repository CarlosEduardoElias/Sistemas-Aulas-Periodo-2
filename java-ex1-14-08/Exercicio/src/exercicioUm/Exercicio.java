package exercicioUm;

public class Exercicio {

	public class Data{
			public int dia;
			public int mes;
			public int ano;
			
			public Data(){
	}
			
	public Data(int dia,int mes,int ano){
		this.dia=dia;
		this.mes=mes;
		this.ano=ano;
	}
	
	public String toString(){
		String data=dia + "/" + mes + "/" + ano;
		return data;
	}
	}
	
	public class Principal{
		public void main(String[]args){
			Data d= new Data();
			d.dia=40;
			d.mes=40;
			d.ano=-40;
			System.out.println(d);
		}
	}
}
