package controleDeFluxo;

public class PlanoOperadora {
	
	public static void main(String[] args) {
		String plano = "T";
		/**
		 * TURBO
		 * MEDIO
		 * BASICO
		 */
		switch (plano) {
		case "T": {
			System.out.println("5GB de Youtube");
		}
		case "M": {
			System.out.println("Whats e instagram gratis");	

		}
		case "B": {
			System.out.println("100 minutos de liga��o");
			break;
		}
		default: {
			System.out.println("Plano n�o encontrado");
		}
		}
	}
	
}
		/*
		if(plano == "B") {
			System.out.println("100 minutos de liga��o");
		} else if (plano == "M"){
			System.out.println("100 minutos de liga��o");
			System.out.println("Whats e instagram gratis");		
		} else if (plano == "T") {
			System.out.println("100 minutos de liga��o");
			System.out.println("Whats e instagram gratis");		
			System.out.println("5GB de Youtube");
		}
			*/
