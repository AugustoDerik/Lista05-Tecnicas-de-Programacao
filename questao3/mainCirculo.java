package questao3;

import java.util.Scanner;

public class mainCirculo {

	public static void main(String[] args) {

		Circulo circle = new Circulo();

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o raio do círculo:");

		circle.raio = entrada.nextDouble();

		System.out.println("Área = " + circle.area(circle.raio));
		System.out.println("Circunferência = " + circle.circunferencia(circle.raio));

		double aumento = 0;
		double novoRaio = 0;

		System.out.println("Informe o percentual do aumento:");
		
		aumento = entrada.nextDouble();

		novoRaio = circle.aumentarCirculo(aumento, circle.raio);

		System.out.println("Novo raio = " + novoRaio);
		System.out.println("Nova área = " + circle.area(novoRaio));
		System.out.println("Nova circunferência = " + circle.circunferencia(novoRaio));
		
		//System.out.println(circle.raio);

		entrada.close();
	}

}
