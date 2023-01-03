package entidades;

public class retangulo {

	public double l;
	public double h;
	
	public double area() {
		double area = l * h;
		return area;
	}

	public double perimetro() {
		double perimetro = 2 * (l + h);
		return perimetro;
	}
	
	public double diagonal() {
		double diagonal = Math.sqrt((l * l) + (h * h));
		return diagonal;
	}
	
}
