import java.util.Scanner;

import entidades.converter;

public class exercicio4 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		System.out.println("Qual o valor atual do dolar?");
		converter.dolar = num.nextDouble(); //Utilizando método static
		System.out.println("Quantos dolares vai comprar?");
		converter.compra = num.nextDouble(); //Utilizando método static
		System.out.println("O valor a ser pago em reais: R$ " + converter.CurrencyConverter()); //Utilizando método static
		num.close();
	}
}
