package LacosDeRepeticao;

import java.util.Scanner;

public class LRQuestao6 {

	public static void main(String[] args) {
		int n, media = 0, contagem = 0;
		
		Scanner ler = new Scanner(System.in);
		
		do{
			System.out.print("Digite um número: ");
			n = ler.nextInt();
			
			if(n % 3 == 0 && n != 0) 
			{
				media += n;
				contagem++;
			}
		}while(n != 0);
		
		if(contagem != 0) media = media / contagem;
		
		System.out.print("\nMédia dos números múltiplos de 3: " + media);

	}

}
