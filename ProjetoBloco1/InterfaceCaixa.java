package ProjetoBloco1;

public interface InterfaceCaixa {

	void login();
	void consultarSaldo();
	void sacar(double valorDoSaque);
	void depositar(double deposito);
	void chequeEspecial();//Se n�o tiver saldo suficiente...
	void informarCredito();//Mostrar se a pessoa pode ter cr�dito;
	//aula.indexOf("Entrevista")
	/*Criar um switch case dentro de um while para operar o sistema, salvar os cadastros
	 em um array list e usar o n�mero do cart�o para pegar as informa��es com o 
	 valorDouble = Double.parseDouble( suaString );*/
}