package ProjetoBloco1;

import java.util.Scanner;

public class CaixaEletronico {
		
	Conta contaLogada;
	boolean contaAutenticada;
	
	Scanner leitura = new Scanner(System.in);
		
	public  void login()
	{
		System.out.print("Insira seu cart�o:");
		String cartao = leitura.nextLine();
		
		System.out.print("Insira sua senha:");
		String senha = leitura.nextLine();
		
		
		contaLogada = new Conta();
		contaLogada.setCartao(cartao);
		contaLogada.setSenha(senha);
		contaAutenticada = contaLogada.validarSenha();
	}
	
	public void consultarSaldo()
	{
		if(contaAutenticada){
			double consulta = contaLogada.consultarSaldo();
			System.out.println("Seu saldo � de: R$"+ consulta+ " reais.");
		}
	}
	
	public void sacar(double valorDoSaque) {
		if(contaAutenticada) 
		{
			if(valorDoSaque>0)
			{
				System.out.println("Voc� sacou: R$"+valorDoSaque+ " reais.");

				if(valorDoSaque>contaLogada.consultarSaldo()) 
				{
					chequeEspecial();
				}
				contaLogada.debitarSaldo(valorDoSaque);
			}else 
			{
				System.out.println("Voc� n�o pode sacar um valor negativo ou igual a zero, "+
						"digite outro valor de saque.");
			}
		}else {
			System.out.println("Senha inv�lida, opera��o de saque n�o autorizada.");
		}
	}
		
	
	public void depositar(double deposito)
	{
		if(contaAutenticada) {
			if(deposito>0) 
			{
				contaLogada.adicionarSaldo(deposito);
				System.out.println("Deposito de: R$"+deposito+", efetuado com sucesso!");
			}
		}else {
			System.out.println("Senha inv�lida, opera��o de deposito n�o autorizada.");
		}
	}

	private void chequeEspecial()
	{
		System.out.println("Voc� entrou no cheque especial, empr�stimo sem juros por 10 dias.");
	}
	
	public void informarCredito()
	{
		if(contaAutenticada){
			contaLogada.verificarCredito();
		}else {
			System.out.println("Senha inv�lida, imposs�vel mostrar se h� cr�ditos dispon�veis.");
		}
	}
}