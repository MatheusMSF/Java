package Heranca;

public class Cavalo extends Animal{
	
	public Cavalo(String nome, int idade) 
	{
		super(nome, idade);
	}
	
	public void correr() 
	{
		System.out.println("O cavalo est� correndo!!!");
	}
}
