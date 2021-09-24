
/*
 * @author Thiago A Soares
 */

public class Principal {

	public static void main(String[] args) {
		Alunos a1 = new Alunos("Thiago",001);
		Alunos a2 = new Alunos("Kamila", 002);
		Notas notas = new Notas();
		notas.insereAluno(a1);
		notas.insereAluno(a2);
		
		notas.criarNota(a1, 9);
		notas.criarNota(a2, 8);
		notas.exibeAlunos();
		
		notas.alterarNota(a1, 10);
		notas.excluirNota(a2);
		notas.exibeAlunos();
		
		
		

	}

}
