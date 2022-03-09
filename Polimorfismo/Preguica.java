package Polimorfismo;

public class Preguica extends Animal{
	
	public Preguica(String nome, int idade) 
	{
		super(nome, idade);
	}
	
	@Override
	public String som() 
	{
		return "Aaaaan";
	}
	
	@Override
	public String acao() 
	{
		return "A preguiça está subindo uma árvore...";
	}
}
