package LacosDeDecisao;

import java.util.Scanner;

public class LDQuestao4 {

	public static void main(String[] args) {
		double numero, conta;
		String tipo;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		numero = ler.nextDouble();
		
		if(numero % 2 == 0) 
		{
			tipo = "par\nRaiz quadrada: ";
			conta = Math.sqrt(numero);
		}
		else 
		{
			tipo = "impar\nN�mero elevado ao quadrado: ";
			conta = Math.pow(numero, 2);
		}
		
		System.out.print("N�mero: " + numero + " � " + tipo + conta);

	}

}
