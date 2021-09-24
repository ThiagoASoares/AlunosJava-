
/*
 * @author Thiago A Soares
 */


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

	
}
