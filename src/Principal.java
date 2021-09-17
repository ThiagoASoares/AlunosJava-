import java.util.ArrayList;
import java.util.List;

/*
 * @author Thiago A Soares
 */

public class Principal {

	public static void main(String[] args) {
		
		Alunos a1 = new Alunos("Thiago", 001);
		Alunos a2 = new Alunos("Luis",002);
		Alunos a3 = new Alunos("Bernardo", 003);
		
		List<Alunos> listaAlunos = new ArrayList<Alunos>();
		listaAlunos.add(a1);
		listaAlunos.add(a2);
		listaAlunos.add(a3);
		a1.exibeAlunos(listaAlunos);
		
		

	}

}
