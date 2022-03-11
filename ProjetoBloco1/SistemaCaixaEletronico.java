package ProjetoBloco1;

import java.util.Scanner;

import java.util.ArrayList;

public class SistemaCaixaEletronico {

	public static void main(String[] args) {
		
	boolean sessao = true;
	int opcao = 0;
	String cartao = "", nome = "", senha = "", cpf = "", saldo ="";
	
	Scanner ler = new Scanner(System.in);
	
	ArrayList<String> pessoa = new ArrayList<>();
		
	while(sessao) 
	{
		System.out.println("Digite 1 para se cadastrar\nDigite 2 para logar");
		opcao = ler.nextInt();
		
		
		switch (opcao) {
		case 1:
			
			System.out.println("Digite o número do seu cartão");
			cartao = ler.next();
			
			System.out.println("Digite o sua senha");
			senha = ler.next();
			
			System.out.println("Digite seu nome");
			nome = ler.next();
			
			System.out.println("Digite seu cpf");
			cpf = ler.next();
			
			System.out.println("Depositar valor de entrada");
			saldo = ler.next();
			
			pessoa.add(cartao);
			pessoa.add(senha);
			pessoa.add(nome);
			pessoa.add(cpf);
			pessoa.add(saldo);
			
			
			break;
			
		case 2:
			
			System.out.println("Digite o número do seu cartão");
			cartao = ler.next();
			
			System.out.println("Digite o sua senha");
			senha = ler.next();
			
			
			
			int indice = pessoa.indexOf(cartao);
			
			if(indice != -1) 
			{
				nome = pessoa.get(indice + 2);
				cpf = pessoa.get(indice + 3);
				saldo = pessoa.get(indice + 4);
			}
			else 
			{
				System.out.println("Você não tem cadastro!!!");
			}
			
			break;
			
		case 3:
			
			System.out.println("Seu nome: " + nome +
								"Seu cpf: " + cpf +
								"Seu saldo: " + saldo);
			break;
			
		case 4:
			
			sessao = false;
			
			break;

		default:
			
			System.out.println("Digite um número valido");
			break;
		}
	}
		
		
		
		
		
		
		
	/*CaixaEletronico c1 = new CaixaEletronico();
	c1.login();
	
	c1.consultarSaldo();
	c1.sacar(20);
	c1.consultarSaldo();
	c1.depositar(30);
	c1.consultarSaldo();
	c1.informarCredito();*/
	
	}
}