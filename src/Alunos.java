
/*
 * @author Thiago A Soares
 */

import java.util.List;

public class Alunos {
	
	private String nome;
	private int matricula;
	private double notas;
	
		
	public Alunos(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public double getNotas() {
		return notas;
	}
	public void setNotas(double notas) {
		this.notas = notas;
	}
	
	public void criarNota (List<Alunos> lista ,int matricula, double nota) {
		for (int i = 0 ; i<lista.size();i++) {
			Alunos temp = lista.get(i);
			if (temp.matricula == matricula) {
				temp.setNotas(nota);
				System.out.println("Nota cadastrada com sucesso");
			}else {
		
				System.out.println("Aluno não cadastrado");
			}
				
		}

	}

	public void excluirNota (List<Alunos> lista ,int matricula) {
		for (int i = 0 ; i<lista.size();i++) {
			Alunos temp = lista.get(i);
		if (temp.matricula == matricula) {
			temp.setNotas(0);
			System.out.println("Nota excluida com sucesso");
			}else {
			
				System.out.println("Aluno não cadastrado");
			}
					
		}
	
	}
	 
	public void alterarNota (List<Alunos> lista ,int matricula, double nota) {
		for (int i = 0 ; i<lista.size();i++) {
			Alunos temp = lista.get(i);
		if (temp.matricula == matricula) {
			temp.setNotas(nota);
			System.out.println("Nota alterada com sucesso");
			}else {
			
				System.out.println("Aluno não cadastrado");
			}
					
		}
	
	}	
	public void exibeAlunos (List<Alunos> lista) {
		for (int i = 0 ; i<lista.size();i++) {
			Alunos temp = lista.get(i);
		System.out.println("Aluno : "+ temp.getNome() + "\n Matricula : "+temp.getMatricula() + "\n Notas : "+ temp.getNotas() + "\n");
					
		}
	
	}	
}
