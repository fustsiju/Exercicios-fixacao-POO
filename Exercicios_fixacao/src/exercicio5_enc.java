import java.util.Scanner;

import entidades.Banco;

public class exercicio5_enc {
	public static void main(String args[]) {
		Scanner num = new Scanner(System.in);

		System.out.println("Insira o código do cliente: ");
		int codigo = num.nextInt();
		System.out.println("Insira o nome do cliente:");
		String nome = num.next();
		System.out.println("Houve um deposito inicial? ");
		char r = num.next().charAt(0);
		double deposito = 0;
		if (r == 's') {
			System.out.println("Insira o valor de deposito");
			deposito = num.nextDouble();
		} else {

		}

		Banco banco = new Banco(codigo, nome, deposito);

		banco.getUsuarioinfo();

		System.out.println("\nAdicione um valor de deposito:");
		banco.setDeposito(banco.getDeposito() + num.nextDouble());

		System.out.println("Conta atualizada: " + banco.getDeposito());
		num.close();
	}
}
