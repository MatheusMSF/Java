package Heranca;

public class Preguica extends Animal{
	
	public Preguica(String nomePre, int idadePre) 
	{
		setNome(nomePre);
		setIdade(idadePre);
	}
	
	public void subir() 
	{
		System.out.println("A pregui�a est� subindo uma �rvore!");
	}
}
