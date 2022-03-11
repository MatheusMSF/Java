package ProjetoBloco1;

public interface InterfaceCaixa {

	void login();
	void consultarSaldo();
	void sacar(double valorDoSaque);
	void depositar(double deposito);
	void chequeEspecial();//Se não tiver saldo suficiente...
	void informarCredito();//Mostrar se a pessoa pode ter crédito;
	//aula.indexOf("Entrevista")
	/*Criar um switch case dentro de um while para operar o sistema, salvar os cadastros
	 em um array list e usar o número do cartão para pegar as informações com o 
	 valorDouble = Double.parseDouble( suaString );*/
}