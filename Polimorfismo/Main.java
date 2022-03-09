package Polimorfismo;

public class Main {

	public static void main(String[] args) {
		Cachorro duck = new Cachorro("Duck",8);
		Cavalo tomas = new Cavalo("Tomas", 15);
		Preguica tune = new Preguica("Tune", 20);
		
		System.out.println("O cachorro: " + duck.getNome() + 
				" tem " + duck.getIdade() + " anos, faz o som " 
				+ duck.som() + "\n" + duck.acao());
		
		System.out.println("O cavalo: " + tomas.getNome() + 
				" tem " + tomas.getIdade() + " anos, faz o som " 
				+ tomas.som() + "\n" + tomas.acao());
		
		System.out.println("A preguiça: " + tune.getNome() + 
				" tem " + tune.getIdade() + " anos, faz o som " 
				+ tune.som() + "\n" + tune.acao());	

	}

}
