package contaBanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		/**
		 * TODO:
		 * conhecer e importar a classe scanner
		 * Exibir mensagens para nosso usuario
		 * Obter pelo scanner os valores digitados no terminal 
		 * exibir mensagem conta criada.
		 */

		Scanner sc = new Scanner(System.in);

		variaveis variaveis = new variaveis();

		System.out.println("Por favor, digite o n�mero da Ag�ncia:");
		variaveis.setAgencia(sc.nextLine());

		System.out.println("Por favor, o nome do cliente:");
		variaveis.setNomeCliente(sc.next());

		System.out.println("Por favor, digite o numero de sua conta corrente:");
		variaveis.setNumero(sc.nextBigDecimal());

		System.out.println("Por favor, digite o saldo da conta corrente:");
		variaveis.setSaldo(sc.nextFloat());

		System.out.println("Ol� " + variaveis.getNomeCliente()
				+ " obrigado por criar uma conta em nosso banco, sua ag�ncia � " + 
				variaveis.getAgencia() + " conta "+ variaveis.getNumero() + 
				" e seu saldo " + variaveis.getSaldo() + " j� est� dispon�vel para saque.");
	}

}
