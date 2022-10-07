package questao6;

public class mainElevador {

	public static void main(String[] args) {

		Elevador e = new Elevador();

		e.inicializa(0, 0);
		e.setCapacidade(10);
		e.setAndares(5);

		e.sobe();
		e.sobe();
		System.out.println(e.getAndarAtual());
		e.desce();
		System.out.println(e.getAndarAtual());
		e.entra();
		e.entra();
		System.out.println(e.getPessoas());

	}

}
