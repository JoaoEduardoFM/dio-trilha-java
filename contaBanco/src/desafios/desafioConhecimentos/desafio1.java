package desafios.desafioConhecimentos;

import java.util.Scanner;

public class desafio1 {
	
	/**
	 * Desafio
	 * Odin criou para Thor a mais fiel e poderosa arma poss�vel, o martelo Mj�lnir. 
	 * Feito de um min�rio m�stico especial chamado Uru e forjado no cora��o de uma estrela pelos Deuses ferreiros de Asgard, 
	 * Brokk e Eitri, os lend�rios ferreiros.
	 * Um dia, Thor desafiou seus amigos para ver quem conseguia levantar o Mj�lnir.
	 * Escreva um programa que, dado um nome, e a for�a, em Newtons, 
	 * aplicado ao tentar levantar o Mj�lnir, informar se a pessoa conseguiu ou n�o levant�-lo.
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
