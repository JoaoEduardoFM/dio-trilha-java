package desafios.desafioConhecimentos;

import java.util.Scanner;

public class desafio2 {

public static void main(String[] args) {
		
		/**
		 * Desafio
		 * Fa�a um programa com as caracter�sticas abaixo:
		 * Leia 10 nomes, sem espa�o em branco;
		 * Imprima o terceiro nome da lista;
		 * Imprima o s�timo nome da lista;
		 * Imprima o nono nome da lista.
		 */
		
		Scanner sc = new Scanner(System.in);
		// TODO: complete os espa�os em branco com sua solu��o para o problema
		String[] nomes = new String[10];
		for (int i = 0; i < nomes.length; i++)
			nomes[i] = sc.nextLine();
			System.out.println(nomes[2]);
			System.out.println(nomes[6]);
			System.out.println(nomes[8]);
			}
	}

