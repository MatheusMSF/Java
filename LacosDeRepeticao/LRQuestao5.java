package LacosDeRepeticao;

import java.util.Scanner;

public class LRQuestao5 {

	public static void main(String[] args) {
		int n,soma = 0;
		
		Scanner ler = new Scanner(System.in);
		
		do 
		{
			System.out.print("Digite um n�mero: ");
			n = ler.nextInt();
			
			soma += n;
			
		}while(n != 0);
		
		System.out.print("Soma dos n�meros digitados: " + soma);

	}

}
