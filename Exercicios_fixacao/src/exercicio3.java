import java.util.Scanner;

import entidades.aluno;

public class exercicio3 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		aluno al = new aluno();
		
		System.out.println("Insira o nome do aluno:");
		al.nome = num.next();
		System.out.println("Insira a primeira nota do aluno:");
		al.n1 = num.nextDouble();
		System.out.println("Insira a segunda nota do aluno:");
		al.n2 = num.nextDouble();
		System.out.println("Insira a terceira nota do aluno:");
		al.n3 = num.nextDouble();
		
		if(al.resultado() >= 60) {
			System.out.println("Nota final: " + al.resultado() + " Passou!");
		} else {
			System.out.println("Nota final: " + al.resultado() + " Reprovado! \n Faltaram " + al.reprovado() + " Pontos para passar!");
		}
		
		num.close();
	}
}
