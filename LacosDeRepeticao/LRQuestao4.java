package LacosDeRepeticao;

import java.util.Scanner;

public class LRQuestao4 {

	public static void main(String[] args) {
		int [][] pessoas = new int [1][3];
		int [] dados = {0,0,0,0,0,0};
		int x = 0;
			
		Scanner ler = new Scanner(System.in);
		
		while(x < pessoas.length) 
		{	
			System.out.print("Digite a sua idade: ");
			pessoas[x][0] = ler.nextInt();
			
			System.out.println("\n\nDigite o seu sexo: "
					+ "\n1 - feminino / 2 - masculino / 3 outros");
			pessoas[x][1] = ler.nextInt();
			
			System.out.println("Digite: "
					+ "\n1 - se a pessoa era calma"
					+ "\n2 - se a pessoa era nervosa"
					+ "\n3 - se a pessoa era agressiva");
			pessoas[x][2] = ler.nextInt();
				
			if(pessoas[x][2] == 1) dados[0]++;
			if(pessoas[x][1] == 1 && pessoas[x][2] == 2) dados[1]++;
			if(pessoas[x][1] == 2 && pessoas[x][2] == 3) dados[2]++;
			if(pessoas[x][1] == 3 && pessoas[x][2] == 1) dados[3]++;
			if(pessoas[x][0] > 40 && pessoas[x][2] == 2) dados[4]++;
			if(pessoas[x][0] < 18 && pessoas[x][2] == 1) dados[5]++;
			
			x++;
		}
		
		System.out.println(
				"\nNúmero de pessoas calmas: " + dados[0] +
				"\nNúmero de mulheres nervosas: " + dados[1] +
				"\nNúmero de homens agressivos " + dados[2] +
				"\nNúmero de outros calmos: " + dados[3] +
				"\nNúmero de pessoas nervosas com mais de 40 anos: " + dados[4] +
				"\nNúmero de pessoas calmas com menos de 18 anos: " + dados[5]);
		

	}

}
