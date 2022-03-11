package Collection;

import java.util.ArrayList;

public class Collection {

	public static void main(String[] args) {
		/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
		trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
		programa deverá atender as seguintes funcionalidades:
		Armazenar dados da List
		Remover dados da list;
		Atualizar dados da list.
		Apresentar todos os dados da list. 
	 	*/
		
		ArrayList<String> tatame = new ArrayList<>();
		
		tatame.add("Tatame rosa");
		tatame.add("Tatame amarelo");
		tatame.add("Tatame comestível");
		tatame.add("Tatame de telhado");
		tatame.add("Tatame vermelho");
		
		tatame.remove(3);
		
		tatame.set(2,"Tatame verde escuro");
		
		System.out.println(tatame);
	}

}
