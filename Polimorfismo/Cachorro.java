package Polimorfismo;

public class Cachorro extends Animal{
	
	public Cachorro(String nome, int idade) 
	{
		super(nome, idade);
	}
	
	@Override
	public String som() 
	{
		return "AU AU AU";
	}
	
	@Override
	public String acao() 
	{
		return "O cachorro está correndo...";
	}
	
}
