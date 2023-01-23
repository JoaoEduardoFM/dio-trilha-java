package desafioList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Desafio2 {
	
	public static void main(String[] args) {
		
		/**
		 * utilizando listas, faça um programa que faça 5 perguntas para um pessoa sobre um crime.
		 * as perguntas são.
		 * 1. telefonou para vitima
		 * 2. esteve no local do crime 
		 * 3. mora perto da vitima
		 * 4. devia para vitima
		 * 5. ja trabalhou com a vitima.
		 * 
		 * se a pessoa responder positivamente as 2 questões ela deve ser classificada com suspeita.
		 * entre 3 e 4 como cumplice. 5 como assasina. 
		 * caso contrario ela sera classificada com inocente.
		 */
		        List<String> respostas = new ArrayList<>();
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Perguntas: ");
		        System.out.print("\nTelefonou para vítima? ");
		        String resposta = scanner.next();
		        respostas.add(resposta.toLowerCase());
		        System.out.print("Esteve no local do crime? ");
		        resposta = scanner.next();
		        respostas.add(resposta.toLowerCase());
		        System.out.print("Mora perto da vítima? ");
		        resposta = scanner.next();
		        respostas.add(resposta.toLowerCase());
		        System.out.print("Devia para vítima? ");
		        resposta = scanner.next();
		        respostas.add(resposta.toLowerCase());
		        System.out.print("Já trabalhou com a vítima? ");
		        resposta = scanner.next();
		        respostas.add(resposta.toLowerCase());

		        System.out.println(respostas);

		        int count = 0;
		        Iterator<String> contador = respostas.iterator();
		        while(contador.hasNext()){
		            String resp = contador.next();
		            if(resp.contains("s")) {
		                count ++;
		            }
		        }

		        switch(count) {
		            case 2:
		                System.out.println(">> SUSPEITA <<"); break;
		            case 3:
		            case 4:
		                System.out.println(">> CÚMPLICE <<"); break;
		            case 5:
		                System.out.println(">> ASSASSINO <<"); break;
		            default:
		                System.out.println(">> INOCENTE <<"); break;
		        }
		}

}
