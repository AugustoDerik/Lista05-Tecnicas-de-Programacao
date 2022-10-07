package questao6;

public class Elevador {

	private int andarAtual;
	private int andares;
	private int capacidade;
	private int pessoas;

	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getAndares() {
		return andares;
	}

	public void setAndares(int andares) {
		this.andares = andares;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getPessoas() {
		return pessoas;
	}

	public void setPessoas(int pessoas) {
		this.pessoas = pessoas;
	}

	public void inicializa(int andar, int p) {
		this.andarAtual = andar;
		this.pessoas = p;
	}

	public int entra() {
		if (pessoas < capacidade)
			return pessoas++;
		else
			return 0;
	}

	public int sai() {
		if (pessoas != 0)
			return pessoas--;
		else
			return 0;
	}

	public int sobe() {
		if (andarAtual < andares)
			return andarAtual++;
		else
			return andarAtual;
	}

	public int desce() {
		if (andarAtual != 0)
			return andarAtual--;
		else
			return 0;
	}

}
