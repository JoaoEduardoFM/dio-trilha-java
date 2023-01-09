package tratamentoDeExcecoes;

public class FormatadorDeCep {
	
	public static void main(String[] args) {
		try {
			String cepFormatado = formataCep("23");
			System.out.println(cepFormatado);
		} catch (CepinvalidoException e) {
			System.out.println("cep deve conter 8 digitos");
		}
	}
	
	static String formataCep(String cep) throws CepinvalidoException{
		if(cep.length() != 8)
			throw new CepinvalidoException();
		
		return "23.75-064";
	}

}
