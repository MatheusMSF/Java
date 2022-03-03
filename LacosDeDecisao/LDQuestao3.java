package LacosDeDecisao;

import java.util.Scanner;

public class LDQuestao3 {

	public static void main(String[] args) {
		int idade;
		String categoria;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		idade = ler.nextInt();
		
		if(idade > 9 && idade < 15) categoria = "infantil";
		else if(idade >= 15 && idade < 18) categoria = "juvenil";
		else if(idade >= 18 && idade < 26) categoria = "adulto";
		else categoria = "Sua idade não se encaixa em uma categoria";
		
		System.out.print("Categoria: " + categoria);
	}

}
