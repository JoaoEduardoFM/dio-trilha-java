package desafios.pedraPapelAtaqueAereo;

import java.util.Scanner;

public class PedraPapelAtaqueAereo {
	/**
	 * @author joao.martins
	 * Pedra, Papel, Ataque Aéreo é um jogo antigo mas que é popular até hoje. 
	 * Nele, duas ou mais pessoas fazem gestos com a mão para vencer o adversário. 
	 * @param jogador 1
	 * @param jogador 2
	 */
	 public static void main(String[] args) {
	      	Scanner leitor = new Scanner(System.in);
	      	System.out.println("informe a quantidade de rodadas:");
	    	int N = leitor.nextInt();
	    	String jogador1, jogador2;   	
	    	System.out.println("informe ataque,papel ou Pedra:");
	    	for (int i = 0; i < N; i++) {
	    		jogador1 = leitor.next();
	    		jogador2 = leitor.next();
	    		if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("ataque")) System.out.println("Aniquilacao mutua");
	    		else if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("pedra")) System.out.println("Jogador 1 venceu");
	    		else if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("papel")) System.out.println("Jogador 1 venceu");
	    			    		
	    		else if (jogador1.equalsIgnoreCase("pedra") && jogador2.equalsIgnoreCase("pedra")) System.out.println("Sem ganhador");
	    		else if (jogador1.equalsIgnoreCase("pedra") && jogador2.equalsIgnoreCase("ataque")) System.out.println("Jogador 2 venceu");
	    		else if (jogador1.equalsIgnoreCase("pedra") && jogador2.equalsIgnoreCase("papel")) System.out.println("Jogador 1 venceu");
	    		
	    		else if (jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("papel")) System.out.println("Ambos venceram");
	    		else if (jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("pedra")) System.out.println("Jogador 2 venceu");			
	    		else if (jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("ataque")) System.out.println("Jogador 2 venceu");	
	    		
	    		else System.out.println("informe apenas papel, ataque ou pedra.");
	    	}
	    }
	}
