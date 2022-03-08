package Heranca;

public class Cachorro extends Animal{
	
	public Cachorro(String nomeDog, int idadeDog) 
	{
		setNome(nomeDog);
		setIdade(idadeDog);
	}
	
	public void correr() 
	{
		System.out.println("O cachorro está correndo!!!");
	}
}
