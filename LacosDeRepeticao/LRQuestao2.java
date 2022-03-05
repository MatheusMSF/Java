package LacosDeRepeticao;

import java.util.Scanner;

public class LRQuestao2 {

	public static void main(String[] args) {
		int[] numero = new int [10]; 
		int par = 0, impar = 0;
		
		Scanner ler = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) 
		{
			System.out.printf("Número %d: ", i + 1);
			numero[i] = ler.nextInt();
			
			if(numero[i] % 2 == 0) par++;
			else impar++;
		}
		
		System.out.print("\nQuantidade de números pares: " + par +
						 "\nQuantidade de números ímpares: " + impar);
	}

}
