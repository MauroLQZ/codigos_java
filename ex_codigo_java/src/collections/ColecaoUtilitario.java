package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ColecaoUtilitario {

	public static void main(String[] args) {

		List<String> list = new ArrayList();
		list.add("Guarana");
		list.add("Uva");
		list.add("Manga");
		list.add("Coco");
		list.add("Acai");
		list.add("Banana");
		list.add("Pera");
		list.add("Maca");
        System.out.println(list);
        
        //coloca em ordem os elementos
        Collections.sort(list);
        System.out.println(list);
        
        //coloca inverte os elementos
        Collections.reverse(list);
        System.out.println(list);
        
        //embaralha os elementos
        Collections.shuffle(list);
        System.out.println(list);
        
      //colaca outros elementos na list
        Collections.addAll(list, "Cupuacu", "Laranja","Laranja");
        System.out.println(list);
        
      //Quantas vezes um elemento aparece na list
       System.out.println(Collections.frequency(list,"Laranja"));
        
       //Saber se dentro da list tem um conjunto de elementos
       List<String> list2 = Arrays.asList("Acelora", "Graviola");
       boolean d = Collections.disjoint(list, list2); 
        
//saber um indice de um elemento na list
       Collections.sort(list);
       int indice = Collections.binarySearch(list, "Guarana");
	System.out.println(indice);
	System.out.println(list);
	
	//preencher toda a colecao com um elemento
	Collections.fill(list, "Acai");
	System.out.println(list);
	
	//criar uma colecao q nao pode ser modificada
	Collection<String> constante = Collections.unmodifiableCollection(list);
	
	}

}
