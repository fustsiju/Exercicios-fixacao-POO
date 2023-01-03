import java.util.Scanner;

import entidades.retangulo;

public class exercicio1 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		System.out.println("Insira o lado e a altura: ");
		
		retangulo ret = new retangulo();
		
		ret.l = num.nextDouble();
		ret.h = num.nextDouble();
		
		
		System.out.println("Area = " + ret.area());
		System.out.println("Perimetro = " + ret.perimetro());
		System.out.println("Diagonal = " + ret.diagonal());
		
		num.close();
	}
}
