package controleDeFluxo;

public class ResultadoEscolar {

	public static void main(String[] args) {
		int nota = 1;

		/*if (nota >= 7)
			System.out.println("Aprovado");
		else if (nota >= 5 && nota < 7)
			System.out.println("Prova recupera��o");
		else
			System.out.println("Reprovado");
			*/
		
		String resultado = nota >=7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recupera��o" : "Reprovado";
		
		System.out.println(resultado);
	}

}
