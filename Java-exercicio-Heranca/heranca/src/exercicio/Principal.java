package exercicio;

public class Principal {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome("Carlos");
		aluno.setCpf("098.546.669-79");
		aluno.setRg("87.485.197");
		aluno.setMatricula(8795);
		System.out.println("Dados do Aluno" + "\n" + aluno);

		Curso c = new Curso();
		c.setNomeCurso("Sistemas");
		System.out.println("Curso: " + c + "\n");
		
		Endereco end = new Endereco();
		end.setCidade("Cianorte");
		end.setEstado("PR");
		end.setPais("Brasil");
		System.out.println(end + "\n");
		
		Professor p = new Professor();
		p.setCodigo(21);
		p.setSalario(8.758); 
		p.setTitulo("Mestre");
		p.setCarga(12);
		System.out.println(p);
	}
}
