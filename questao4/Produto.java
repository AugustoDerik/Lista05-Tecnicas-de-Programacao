package questao4;

public class Produto {

	private String nome;
	private double priceCusto;
	private double priceVenda;
	private double margemLucro;
	private double despesas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPriceCusto() {
		return priceCusto;
	}

	public void setPriceCusto(double priceCusto) {
		this.priceCusto = priceCusto;
	}

	public double getPriceVenda() {
		return priceVenda;
	}

	public void setPriceVenda(double priceVenda) {
		this.priceVenda = priceVenda;
	}

	public double getMargemLucro() {
		return margemLucro;
	}

	public void setMargemLucro(double margemLucro) {
		this.margemLucro = margemLucro;
	}

	public double getDespesas() {
		return despesas;
	}

	public void setDespesas(double despesas) {
		this.despesas = despesas;
	}

	public Produto(String nome, double custo, double venda) {
		this.nome = nome;
		this.priceCusto = custo;
		this.priceVenda = venda;
	}

}
