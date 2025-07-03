package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


public class Colecao {

	public static void main(String[] args) {
		
		Collection<String> c = new ArrayList<>();
		//Add elementos
		c.add("A");
		c.add("B");
		c.add("C");
		//Imprime elementos
		System.out.println(c.toString());
		//Verifica se esta vazia
		System.out.println(c.isEmpty());
		//Verifica se tem elementos
		System.out.println(c.contains("A"));
		//remover elementos
		c.remove("A");
		System.out.println(c.toString());
		
		/*Grupos de Elementos */
		//convertendo um array em colecao
		Collection<String> c2 = Arrays.asList("O","U");
		//add todos elementos
		c.addAll(c2);
		System.out.println(c.toString());
		//verificar se existem um conjunto de elemnentos dentro da colecao
		System.out.println(c2.containsAll(c2));
		//remover todos os elementos da colecao
		c.removeAll(c2);
		System.out.println(c.toString());
		
		/*PERCORRER OS ELEMENTOS  */
		for (String s : c){
			System.out.println(s);
		}
		//Transformar uma colecao em um Array
		String[] s = c.toArray(new String[c.size()]);
		System.out.println(Arrays.toString(s));
		
		//Limpa toda a colecao
		System.out.println(c.toString());
	}

}
