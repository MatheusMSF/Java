package Heranca;

public class Cavalo extends Animal{
	
	public Cavalo(String nomeCav, int idadeCav) 
	{
		setNome(nomeCav);
		setIdade(idadeCav);
	}
	
	public void correr() 
	{
		System.out.println("O cavalo está correndo!!!");
	}
}
