package exercicio;

public class Data {
	/*	public int dia;
		public int mes;
		public int ano;*/
			
		private int dia;
		private int mes;
		private int ano;

		public Data(){
			this.dia = 1;
			this.mes = 1;
			this.ano = 1800;
	}
			
	//public Data(int dia,int mes,int ano){
	public Data(int d,int m,int a){
		this();
		
		if((d >= 1 && d <= 31)&&
			(m >= 1 && m <= 12)&&
			(a >= 1800 && a <= 2100)){
			this.dia = d;
			this.mes = m;
			this.ano = a;
			}
		}
			
	public void setDia(int dia){
		if(dia >= 1 && dia <= 31){
			this.dia= dia;
		}
	}
	
	public void setMes(int mes){
		if(mes >= 1 && mes <= 12){
			this.mes= mes;
		}
	}
	
	public void setAno(int ano){
		if(ano >= 1800 && ano <= 2100){
			this.ano= ano;
		}
	}
	
	public String toString(){
		String data ="Data:" + dia + "/" + mes + "/" + ano;
		return data;
	}
		/*this.dia=dia;
		this.mes=mes;
		this.ano=ano;
	}*/
	
/*	public Data(int ano,int mes){
		this.mes=mes;
		this.ano=ano;
	}
	
	public String toString(){
		String data=dia + "/" + mes + "/" + ano;
		return data;
	}*/
}

