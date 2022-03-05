package LacosDeRepeticao;

import java.util.Scanner;

public class LRQuestao3 {

	public static void main(String[] args) {
		int idade,somaVin = 0,somaCin = 0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		idade = ler.nextInt();
		
		while(idade != -99) 
		{	
			if(idade < 21) somaVin++;
			
			if(idade > 50) somaCin++;
			
			System.out.print("Digite sua idade: ");
			idade = ler.nextInt();
		}
		
		System.out.print(
				"\nTotal de pessoas com menos de 21 anos: " + somaVin +
				"\nTotal de pessoas com mais de 50 anos: " + somaCin);

	}

}
