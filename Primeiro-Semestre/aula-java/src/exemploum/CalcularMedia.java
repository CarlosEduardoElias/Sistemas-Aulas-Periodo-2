package exemploum;

import java.util.Scanner;

public class CalcularMedia {
	
	private static Double valor1;
	private static Double valor2;
	private static Double media;
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe o Valor 1");
		valor1 = scanner.nextDouble();
		
		System.out.println("Informe o Valor 2");
		valor2 = scanner.nextDouble();
		
		media = (valor1 + valor2) / 2;
		if(media >= 7){
			System.out.println("Aprovado com m�dia: " + media);
		}else{
			System.out.println("Reprovado com m�dia: " + media);
		}
		
		if((media == 6.9) || (media < 7)) {
			System.out.println("Fazer substitutiva, m�dia: " + media);
		}else if ((media > 7) && (media != 0)){
			System.out.println("Nota Boa, m�dia: " + media);
		}
			
	}
	
}