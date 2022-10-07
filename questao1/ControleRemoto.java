package questao1;

public class ControleRemoto {

	// atributos

	public int volume;
	public int canal;

	// métodos

	public int upVolume() {
		return volume++;
	}

	public int downVolume() {
		return volume--;
	}

	public int upCanal() {
		return canal++;
	}

	public int downCanal() {
		return canal--;
	} 

	public int mudarCanal(int canal_) {
		return this.canal = canal_;
	}

	public void consulta() {
		System.out.println("Canal: " + canal + "\nVolume: " + volume);
	}

}
