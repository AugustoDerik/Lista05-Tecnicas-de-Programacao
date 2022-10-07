package questao3;

public class Circulo {

	// attributes
	public double raio;

	// methods
	public double area(double r) {

		this.raio = r;
		double area = 0;
		area = 3.14 * (r * r);
		return area;
	}

	public double circunferencia(double r) {

		//this.raio = r;
		double circunferencia = 0;
		circunferencia = 2 * 3.14 * r;
		return circunferencia;
	}

	public double aumentarCirculo(double aumento, double r) {

		//this.raio = r;
		double novoRaio = 0;
		novoRaio = r + ((aumento / 100) * r);
		return novoRaio;
	}

}
