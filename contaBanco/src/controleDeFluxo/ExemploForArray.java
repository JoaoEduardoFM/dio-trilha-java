package controleDeFluxo;

public class ExemploForArray {
	
	public static void main(String[] args) {
		
		// O INDICE INICIA EM 0
		String alunos [] = {"FELIPE", "JONAS" , "JULIA", "MARCOS"};
	/*
		for (int x=0; x < alunos.length; x++) {
			System.out.println("O aluno do indice x = " + x + " � " + alunos [x]);
		}
		*/
		
		for(String aluno : alunos) {
			System.out.println("nome do aluno � " + aluno);
			
		}
	}

}
