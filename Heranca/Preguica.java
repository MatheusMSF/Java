package Heranca;

public class Preguica extends Animal{
	
	public Preguica(String nome, int idade) 
	{
		super(nome, idade);
	}
	
	public void subir() 
	{
		System.out.println("A preguiça está subindo uma árvore!");
	}
}
