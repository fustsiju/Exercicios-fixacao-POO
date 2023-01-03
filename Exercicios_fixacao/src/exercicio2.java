import java.util.Scanner;

import entidades.funcionario;

public class exercicio2 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		funcionario func = new funcionario();
		
		System.out.println("Qual o nome do funcionario?");
		func.nome = num.next();
		System.out.println("Qual o salario?");
		func.salario = num.nextDouble();
		System.out.println("Qual o valor do imposto?");
		func.imposto = num.nextDouble();
		
		System.out.println("Funcionario: " + func.nome + ", $" + func.salario );
		
		System.out.println("Qual a porcentagem que deseja dar de bonus?");
		func.bonus = num.nextDouble();
		
		System.out.println("Valor atualizado: " + func.nome + ", $" + func.attsalario());
		
		
		num.close();
	}
}
