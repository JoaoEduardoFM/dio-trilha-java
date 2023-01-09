package desafios.desafioConhecimentos;

import java.util.Scanner;

public class desafio2 {

public static void main(String[] args) {
		
		/**
		 * Desafio
		 * Faça um programa com as características abaixo:
		 * Leia 10 nomes, sem espaço em branco;
		 * Imprima o terceiro nome da lista;
		 * Imprima o sétimo nome da lista;
		 * Imprima o nono nome da lista.
		 */
		
		Scanner sc = new Scanner(System.in);
		// TODO: complete os espaços em branco com sua solução para o problema
		String[] nomes = new String[10];
		for (int i = 0; i < nomes.length; i++)
			nomes[i] = sc.nextLine();
			System.out.println(nomes[2]);
			System.out.println(nomes[6]);
			System.out.println(nomes[8]);
			}
	}

