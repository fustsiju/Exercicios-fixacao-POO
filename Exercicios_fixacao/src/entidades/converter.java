package entidades;

public class converter {
	
	public static final double IOF = 0.06; //Utilizando método static final para constante
	
	public static double dolar;
	public static double compra;
	
	public static double CurrencyConverter() {
		
		double  valor = (compra * dolar) + (compra * dolar) * IOF;
		return valor;
	}
}
