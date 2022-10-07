package questao2;

import java.util.Scanner;

public class mainPessoa {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Pessoa einstein = new Pessoa();
		einstein.informaNome("Albert Einstein");
		einstein.ajustaDataDeNascimento(14, 3, 1879);

		System.out.println("Informe a data de hoje em dia, mês e ano:");
		int diaAtual = entrada.nextInt();
		int mesAtual = entrada.nextInt();
		int anoAtual = entrada.nextInt();

		einstein.idade = einstein.calculaIdade(diaAtual, mesAtual, anoAtual);

		System.out.println(einstein.nome + " teria " + einstein.idade + " anos caso estivesse vivo.");

		Pessoa newton = new Pessoa();
		newton.informaNome("Isaac Newton");
		newton.ajustaDataDeNascimento(4, 1, 1643);

		newton.idade = newton.calculaIdade(diaAtual, mesAtual, anoAtual);

		System.out.println(newton.nome + " teria " + newton.idade + " anos caso estivesse vivo.");

		entrada.close();
	}

}
