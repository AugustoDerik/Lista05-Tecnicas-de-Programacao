package questao1;

public class MainControle {

	public static void main(String[] args) {
		
		ControleRemoto controle = new ControleRemoto();
		
		controle.canal = 12;
		controle.volume = 100;
		
		System.out.println(controle.canal);
		controle.upCanal();
		System.out.println(controle.canal);
		
		controle.mudarCanal(20);
		System.out.println(controle.canal);
		System.out.println(controle.volume);
		controle.downVolume();
		
		controle.consulta(); 
		
	}

}
