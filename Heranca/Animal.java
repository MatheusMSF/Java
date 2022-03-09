package Heranca;
	/*Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
	comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
	caracter�sticas de forma que tudo o que for comum a todos os animais fique na classe
	Animal:
	  */
public class Animal {
	private String nome;
	private int idade;
	
	public Animal(String nome, int idade) 
	{
		this.nome = nome;
		this.idade = idade;
	}
	
	public void som(String som) 
	{
		System.out.println("O animal emite o som: " + som);
	}

	public int getIdade() {
		return idade;
	}

	public String getNome() {
		return nome;
	} 
	
}
