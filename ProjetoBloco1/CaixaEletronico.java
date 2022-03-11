package ProjetoBloco1;

import java.util.Scanner;

public class CaixaEletronico {
		
	Conta contaLogada;
	boolean contaAutenticada;
	
	Scanner leitura = new Scanner(System.in);
		
	public  void login()
	{
		System.out.print("Insira seu cartão:");
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
			System.out.println("Seu saldo é de: R$"+ consulta+ " reais.");
		}
	}
	
	public void sacar(double valorDoSaque) {
		if(contaAutenticada) 
		{
			if(valorDoSaque>0)
			{
				System.out.println("Você sacou: R$"+valorDoSaque+ " reais.");

				if(valorDoSaque>contaLogada.consultarSaldo()) 
				{
					chequeEspecial();
				}
				contaLogada.debitarSaldo(valorDoSaque);
			}else 
			{
				System.out.println("Você não pode sacar um valor negativo ou igual a zero, "+
						"digite outro valor de saque.");
			}
		}else {
			System.out.println("Senha inválida, operação de saque não autorizada.");
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
			System.out.println("Senha inválida, operação de deposito não autorizada.");
		}
	}

	private void chequeEspecial()
	{
		System.out.println("Você entrou no cheque especial, empréstimo sem juros por 10 dias.");
	}
	
	public void informarCredito()
	{
		if(contaAutenticada){
			contaLogada.verificarCredito();
		}else {
			System.out.println("Senha inválida, impossível mostrar se há créditos disponíveis.");
		}
	}
}