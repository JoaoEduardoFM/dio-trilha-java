package desafios.banco;

import desafios.banco.contas.Conta;
import desafios.banco.contas.ContaCorrente;
import desafios.banco.contas.ContaPoupanca;
import desafios.banco.instituicao.Cliente;

public class Main {
	
	public static void main(String[] args) {
		
		Cliente Joao = new Cliente();
		
		Joao.setNome("João Eduardo");
		
		Conta cc = new ContaCorrente(Joao);
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(Joao);
		cc.transferir(poupanca, 100);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
