package Polimorfismo;

public class Cavalo extends Animal{
	
	public Cavalo(String nome, int idade) 
	{
		super(nome, idade);
	}
	
	@Override
	public String som() 
	{
		return "Hinn in in";
	}
	
	@Override
	public String acao() 
	{
		return "O cavalo está correndo...";
	}
}
