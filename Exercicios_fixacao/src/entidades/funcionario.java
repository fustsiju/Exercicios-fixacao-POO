package entidades;

public class funcionario {
	public String nome;
	public double salario;
	public double imposto;
	public double bonus;
	
	public double attsalario(){
		salario = (salario + (salario * (bonus/100)) - imposto);
		return salario;
	}
}
