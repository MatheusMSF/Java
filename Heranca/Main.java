package Heranca;

public class Main {

	public static void main(String[] args) {
		Cachorro dog = new Cachorro("Duck", 9);
		Cavalo cav = new Cavalo("Josivaldo", 12);
		Preguica pre = new Preguica("Sasa", 22);
		
		System.out.println(dog.getNome());
		dog.som("AU, AU, AU");
		dog.correr();
		
		System.out.println(cav.getNome());
		cav.som("Hinn in in");
		cav.correr();
		
		System.out.println(pre.getNome());
		pre.som("Aaaaan");
		pre.subir();
		
	}

}
