package tratamentoDeExcecoes;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class sobreMim {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		try {
			System.out.println("Digite seu nome:");
			String nome = scanner.next();

			System.out.println("Digite seu sobrenome:");
			String sobrenome = scanner.next();

			System.out.println("Digite sua idade:");
			int idade = scanner.nextInt();

			System.out.println("Digite sua altura:");
			double altura = scanner.nextDouble();
			// imprimindo dados
			System.out.println("Ola me chamo " + nome.toUpperCase() + "" + sobrenome);
			System.out.println("tenho " + idade + " anos");
			System.out.println("Minha altura é " + altura + " cm");
			scanner.close();

		} catch (InputMismatchException e) {
			System.err.println("Os campos idade e altura precisam ser numericos!");
		}
	}
}
