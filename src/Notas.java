import java.util.ArrayList;
import java.util.List;

public class Notas {

	private List<Alunos> listaAlunos = new ArrayList<Alunos>();
	private boolean trocarNota = false;
	private boolean excluirNota = false;
	
	public void insereAluno(Alunos aluno) {
		
		listaAlunos.add(aluno);
		System.out.println("Aluno inserido na lista com sucesso");
		
	}
	
	public void criarNota (Alunos aluno, double nota) {
		for (int i = 0 ; i<listaAlunos.size();i++) {
			Alunos temp = listaAlunos.get(i);
			if (temp.getMatricula() == aluno.getMatricula()) {
				temp.setNotas(nota);
				this.trocarNota = true;
			}
				
		}

		if (trocarNota == false) {
			
			System.out.println("Aluno nao cadastrado na lista");
						
		}else {
			this.trocarNota = false;
			System.out.println("Nota cadastrada com sucesso");
		}
	}
	public void excluirNota (Alunos aluno) {
		for (int i = 0 ; i<listaAlunos.size();i++) {
			Alunos temp = listaAlunos.get(i);
		if (temp.getMatricula() == aluno.getMatricula() ) {
			temp.setNotas(0);
			this.excluirNota = true;
			}
					
		}
		if (excluirNota == false) {
			
			System.out.println("Aluno nao cadastrado na lista");
						
		}else {
			this.excluirNota = false;
			System.out.println("Nota excluida com sucesso");
		}
	}
	public void alterarNota (Alunos aluno, double nota) {
		for (int i = 0 ; i<listaAlunos.size();i++) {
			Alunos temp = listaAlunos.get(i);
		if (temp.getMatricula() == aluno.getMatricula()) {
			temp.setNotas(nota);
			this.trocarNota = true;
			
			}
					
		}
		if (trocarNota == false) {
			
			System.out.println("Aluno nao cadastrado na lista");
						
		}else {
			this.trocarNota = false;
			System.out.println("Nota alterada com sucesso");
		}
	}	
	
	public void exibeAlunos () {
		for (int i = 0 ; i<listaAlunos.size();i++) {
			Alunos temp = listaAlunos.get(i);
		System.out.println(" Aluno     : "+ temp.getNome() + "\n Matricula : "+temp.getMatricula() + "\n Notas     : "+ temp.getNotas() + "\n");
					
		}
	
	}	
	
	
}
