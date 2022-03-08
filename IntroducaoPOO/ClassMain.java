package IntroducaoPOO;

public class ClassMain {

	public static void main(String[] args) {
		/*Questão 1 POO cliente
		 * POOQuestao1 cli = new POOQuestao1("Joaquim da silva", "198.989.926-70");
		
		cli.entrar();
		
		System.out.println("Nome completo: " + cli.nomeCompleto + 
				"\nCPF: " + cli.cpf);
		
		cli.comprando();
		
		cli.pagar(350.00);
		
		System.out.println("Total gasto: " + cli.gastoTotal + " reais" + 
				"\nPontos: " + cli.pontos + 
				"\nEstado atual: " + cli.estadoAtual);
		
		cli.sair();
		
		*/
		
		/*Questão 2 POO Avião
		 * POOQuestao2 aviao = new POOQuestao2("72 metros", "24 metros", 
		  										"Azul", "Avianca", 400,1000);
		
		aviao.voando(379);
		aviao.aumentarVel(500);
		aviao.diminuirVel(75);
		aviao.estado();
		aviao.chao();
		*/
		
		
		/* Questao 3 POO Aparelho
		 * POOQuestao3 aparelho = new POOQuestao3("Fone de ouvido", 
				"Amarelo", "Sem fio / Bluetooth", "10 metros", 20);
		
		aparelho.conectado();
		aparelho.aumentarVol(16);
		aparelho.status();*/
		
		/*Questao 4 POO Funcionário
		 * 
		POOQuestao4 funcionario = new POOQuestao4("Ricardo Souza Filho", 
				"151.515.151-14", "12.345.678-9", "Caixa", 1400.00, 36);
		
		funcionario.status("Trabalhando");
		
		funcionario.statusFunc();*/
		
		
		/*Questao 5 POO patinete
		 * 
		POOQuestao5 patinete = new POOQuestao5("Rosa", "1 metro", 
				"70 centímetros", 100, false);
		
		patinete.aumentarVel(20);
		
		patinete.status();*/
		
		
		/*Questao 6 POO conta bancaria
		POOQuestao6 conta = new POOQuestao6("Cintilante Ferreira", 
				"123456qq", "123.456.789-09", "24.690.356-8");
		
		conta.depositar(3000);
		conta.saldo();
		conta.sacar(1200);
		
		conta.info();*/
		
		
		//Questao 7 POO paciente
		POOQuestao7 paciente = new POOQuestao7("Josivaldo Antonies", "111.222.333-45");
		
		paciente.sintomas("Dor de cabeça e cansaço");
		
		paciente.diagnostico("Enxaqueca");
		
		paciente.statusPac();
	}

}
