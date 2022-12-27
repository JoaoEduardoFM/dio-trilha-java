package controleDeFluxo;

public class ExemploBrackContinue {
	
	public static void main(String[] args) {

		for (int numero = 1; numero <= 5; numero++) {
			if (numero == 3)
		    //break; //parar
			continue;  

			System.out.println(numero);
		}
	}

}
