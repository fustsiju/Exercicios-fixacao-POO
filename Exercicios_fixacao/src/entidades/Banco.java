package entidades;

public class Banco {
	private int codigo;
	private String nome;
	private double deposito;

	public Banco(int codigo, String nome, double deposito) {
		this.codigo = codigo;
		this.nome = nome;
		this.deposito = deposito;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

	public double getDeposito() {
		return deposito;
	}

	public void getUsuarioinfo() {
		System.out.printf("Dados do cliente: \n " + " Codigo: " + this.codigo + ", Nome: " + this.nome // linhas profissionais by art
				+ ", Conta: R$ " + this.deposito);
	}

}
