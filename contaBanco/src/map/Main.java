package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		
		List<Map<String , String >> listaAlunos = new ArrayList<>();
		
		
		Map<String, String> aluno = new HashMap<>();
		
		aluno.put("nome", "joão");
		aluno.put("idade", "27");
		aluno.put("Média", "8.5");
		aluno.put("Turma", "3a ");
		
		
		Map<String, String> aluno2 = new HashMap<>();
		
		aluno2.put("nome", "tadeu");
		aluno2.put("idade", "10");
		aluno2.put("Média", "9.5");
		aluno2.put("Turma", "3c ");
		listaAlunos.add(aluno);
		listaAlunos.add(aluno2);
		
		System.out.println(listaAlunos);
		
		System.out.println(aluno.containsKey("nome"));
	}

}
