package exercicio2;

public class Hora {

		private int hora;
		private int minuto;
		private int segundo;

		public Hora(){
				this.hora = 01;
				this.minuto = 01;
				this.segundo = 01;
			
			}
			
		public Hora(int h, int m, int s){
			this();
			
			if((h >= 1 && h <=24)&&
			(m >= 1 && m <=60)&&
			(s >= 1 && s <=60)){
				this.hora = h;
				this.minuto = m;
				this.segundo = s;
				}
			}
			
		public void sethora(int hora){
				if(hora >= 1 && hora <= 24){
					this.hora= hora;
				}
			}
			
		public void setminuto(int minuto){
				if(minuto >= 1 && minuto <= 60){
					this.minuto = minuto;
				}
			}
			
		public void setsegundo(int segundo){
				if(segundo >= 1 && segundo <= 60){
					this.segundo = segundo;
				}
			}
			
		public String toString(){
				String Hora ="Hora:" + hora + ":" + minuto + ":" + segundo;
				return Hora;

		}

			/*public int getHora() {
				return hora;
			}

			public int getMinuto() {
				return minuto;
			}

			public int getSegundo() {
				return segundo;
			}*/
	}
