package LacosDeDecisao;

import java.util.Scanner;

public class LDQuestao2 {

	public static void main(String[] args) {
		double n1,n2,n3, maior,meio,menor;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		n1 = ler.nextDouble();
		
		maior = n1;
		
		System.out.print("Digite o segundo n�mero: ");
		n2 = ler.nextDouble();
		
		if(n1 > n2)menor = n2;
		else {maior = n2; menor = n1;}
		
		System.out.print("Digite o terceiro n�mero: ");
		n3 = ler.nextDouble();
		
		if(n3 > maior) 
		{
			meio = maior;
			
			maior = n3;
		}
		
		else if(n3 > menor) meio = n3;
		
		else 
		{
			meio = menor;
			
			menor = n3;
		}
		
		System.out.print("\nOrdem crescente: " + menor 
				+ ", " + meio + ", " + maior + "\nN1 " + n1 + "\nN2 " + n2 + "\nN3 " + n3);
	}

}
