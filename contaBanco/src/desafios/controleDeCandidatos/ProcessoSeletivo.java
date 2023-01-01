package desafios.controleDeCandidatos;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	
	public static void main(String[] args) {
		String [] candidatos = {"FELIPE", "MARCIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JOAO"};
		
		for(String candidato: candidatos) {
			entrandoEmContato(candidato);
		}
	}
	private static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		do {
			atendeu = atender();
			continuarTentando = !atendeu;
			if(continuarTentando) {
				tentativasRealizadas++;				
			}else
				System.out.println("Contato realizado com sucesso.");
		}while(continuarTentando && tentativasRealizadas <3);
		
		if(atendeu) {
			System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa.");
		}else {
			System.out.println("Não conseguimos contato com " + candidato + " numero maximo de tentativas realizadas.");
		}
	}
	
	static boolean atender() {
		return new Random().nextInt(3)==1;
	}
	static void SelecaoCandidatos() {
		double salarioBse = 2000.0;
		String [] candidatos = {"FELIPE", "MARCIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JOAO"};
		
		int candidatosSelecionados = 0;
		int candidatoatual=0; 
		while(candidatosSelecionados< 5 && candidatoatual < candidatos.length) {
			String candidato = candidatos[candidatoatual];
			double salarioPretendido = valorPretendido();
			System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);
			if(salarioBse >= salarioPretendido ) {
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
				candidatosSelecionados++;
			}
			candidatoatual++;
		}
	}

	private static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800,2200);// gera valores aleatorios.
	}
	static void AnalisarCandidato(double salarioPretendido) {
		double salarioBase= 2000.0;
		if(salarioBase > salarioPretendido) {
			System.out.println("Ligar para o candidato");
		}else if(salarioBase == salarioPretendido) {
			System.out.println("Ligar para o candidato com contra proposta");
		}else {
			System.out.println("Aguardando o resultado dos demais candidatos.");
		}
	}
	static void imprimirSelecionados() {
		String [] candidatos = {"FELIPE", "MARCIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JOAO"};
		System.out.println("Imprimindo a lista de candidatos informando o indice do elemneto");
		for( int indice = 0; indice< candidatos.length;indice++) {
			System.out.println("O candidato de nº " + indice + " é " + candidatos[indice]);		
			}
		System.out.println("Forma abreviada de interação for each:");
		for(String candidato :  candidatos) {
			System.out.println("O candidato selecionado foi " + candidato);
		}
	}
}
