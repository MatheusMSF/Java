package LacosDeDecisao;

import java.util.Scanner;

public class LDQuestao4 {

	public static void main(String[] args) {
		double numero, conta;
		String tipo;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		numero = ler.nextDouble();
		
		if(numero % 2 == 0) 
		{
			tipo = "par\nRaiz quadrada: ";
			conta = Math.sqrt(numero);
		}
		else 
		{
			tipo = "impar\nNúmero elevado ao quadrado: ";
			conta = Math.pow(numero, 2);
		}
		
		System.out.print("Número: " + numero + " é " + tipo + conta);

	}

}
