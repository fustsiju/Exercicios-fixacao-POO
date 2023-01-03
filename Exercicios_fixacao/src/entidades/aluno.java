package entidades;

public class aluno {
	public String nome;
	public double n1;
	public double n2;
	public double n3;
	public double resultado;
	
	public double resultado() {
		double resultado = n1 + n2 + n3;
		return resultado;
	}
	
	public double reprovado() {
		double resultado = n1 + n2 + n3;
		double reprovado = 60 - resultado;
		return reprovado;
	}
}