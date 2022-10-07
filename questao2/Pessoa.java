package questao2;

public class Pessoa {

	public int idade;
	public int dia;
	public int mes;
	public int ano;
	public String nome;

	public String informaNome(String nome) {
		this.nome = nome;
		return nome;
	}

	public int informaIdade(int i) {
		this.idade = i;
		return i;
	}

	public void ajustaDataDeNascimento(int d, int m, int a) {
		this.dia = d;
		this.mes = m;
		this.ano = a;
	}

	public int calculaIdade(int d, int m, int a) {

		int total = d + (30 * m) + (365 * a);
		int oldTotal = dia + (30 * mes) + (365 * ano);
		int idade = (int) (total - oldTotal) / 365;

		return idade;

	}

}
