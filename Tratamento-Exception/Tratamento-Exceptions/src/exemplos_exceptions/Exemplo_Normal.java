package exemplos_exceptions;

import javax.swing.JOptionPane;
	/*O programa pede pro usu�rio digitar um n�mero e exibe o valor digitado,
	por�m se o usu�rio digitar uma letra, pode-se ocorrer v�rios erros
	
	Exemplo sem Exception*/
	public class Exemplo_Normal {
	
		public static void main(String[] args) {
			//declarando a variavel n�mero do tipo inteiro
			int numero;
			
			/*vari�vel n�mero vai ler e armazenar o valor digitado pelo usu�rio,
			vari�vel n�mero vai converter o valor que o usu�rio digitou para string,
			mas se o usu�rio digitar uma letra, ele vai tentar converter e perceber que n�o � um valor inteiro,
			onde ir� apresentar o erro!
			Observa��o: a classe JOptionPane j� aceita valores do tipo string*/
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero qualquer: "));
			//exibindo o n�mero digitado
			JOptionPane.showMessageDialog(null, "O n�mero digitado foi: " + numero);
		}
}

