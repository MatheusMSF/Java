package LacosDeDecisao;

import java.util.Scanner;

public class LDQuestao1 {

	public static void main(String[] args) {
		int n1,n2,n3,maior;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Primeiro n�mero: ");
		n1 = ler.nextInt();
		
		maior = n1;
		
		System.out.print("\nSegundo n�mero: ");
		n2 = ler.nextInt();
		
		System.out.print("\nTerceiro n�mero: ");
		n3 = ler.nextInt();
		
		if(n2 > maior) maior = n2;
		if(n3 > maior) maior = n3;
		
		System.out.print("\n\nMaior n�mero: " + maior);
	}

}
