package desafios.desafioControleFluxo;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro par�metro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo par�metro");
		int parametroDois = terminal.nextInt();
			
		try {			
			//chamando o m�todo contendo a l�gica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			System.out.println("Erro ao executar a aplica��o;");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm � MAIOR que parametroDois e lan�ar a exce��o
		if(parametroUm > parametroDois) {
			System.out.println("O segundo par�metro deve ser maior que o primeiro");	
			return;
		}	
		
		int contagem = parametroDois - parametroUm;
		System.out.println("imprimindo os n�meros com base na vari�vel contagem:");
		//realizar o for para imprimir os n�meros com base na vari�vel contagem
		for(int i= 1 ; i <= contagem; i++) {
			System.out.println(i);
		}
	}
}
