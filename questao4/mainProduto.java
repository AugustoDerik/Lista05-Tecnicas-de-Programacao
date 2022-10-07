package questao4;

import java.util.Scanner;

public class mainProduto {

	public static double calculoMargemLucro(Produto p) {

		p.setDespesas(20.5);

		double margemLucro = (p.getPriceVenda() - (p.getPriceCusto() + p.getDespesas()));
		margemLucro = margemLucro / p.getPriceVenda();

		p.setMargemLucro(margemLucro * 100);

		return p.getMargemLucro();

	}

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String op = "";

		do {
			System.out.println("\nInforme o nome do produto, preço de custo e preço de venda:");
			Produto p = new Produto(entrada.nextLine(), entrada.nextDouble(), entrada.nextDouble());

			System.out.print("\nMargem de lucro do produto " + p.getNome() + ": " + calculoMargemLucro(p));

			System.out.println("\n\nDigite sair ou qualquer tecla para adicionar novo produto:");
			op = entrada.next();
		} while (!(op.equals("sair")));

		entrada.close();
	}

}
