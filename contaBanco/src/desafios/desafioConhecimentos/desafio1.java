package desafios.desafioConhecimentos;

import java.util.Scanner;

public class desafio1 {
	
	/**
	 * Desafio
	 * Odin criou para Thor a mais fiel e poderosa arma possível, o martelo Mjölnir. 
	 * Feito de um minério místico especial chamado Uru e forjado no coração de uma estrela pelos Deuses ferreiros de Asgard, 
	 * Brokk e Eitri, os lendários ferreiros.
	 * Um dia, Thor desafiou seus amigos para ver quem conseguia levantar o Mjölnir.
	 * Escreva um programa que, dado um nome, e a força, em Newtons, 
	 * aplicado ao tentar levantar o Mjölnir, informar se a pessoa conseguiu ou não levantá-lo.
	 */
	 public static void main(String[] args){
			Scanner leitor = new Scanner(System.in);
			int numeroDeRodadas = leitor.nextInt();
			String nome;
			int forca;

			for (int i = 0; i < numeroDeRodadas; i++) {
				nome = leitor.next();
				forca = leitor.nextInt();
				if (nome.equals("Thor")) System.out.println("Y");
				else {
					System.out.println("N");
				}
				}
			}
	    }
