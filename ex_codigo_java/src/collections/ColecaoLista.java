package collections;

import java.util.List;
import java.util.ArrayList;

public class ColecaoLista {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList();
		list.add("Futebol");
		list.add("Basquete");
		list.add("Tenis");
		list.add("Volei");
		list.add("Natacao");
		list.add("Hockey");
		list.add("Boxe");
		list.add("Futebol");
        System.out.println(list);
        
        for(int i=0; i < list.size(); i++){
        	//recuperar um elemento da list
        	String letra = list.get(i);
        	//inserindo elemento com letra maiscula da list letra
        	list.set(i, letra.toUpperCase());
        }
        System.out.println(list);
        
        //localizar um elemento na listagem
        System.out.println(list.indexOf("BOXE"));
        //encontrar uma sub-listagem
        System.out.println(list.subList(2, 4));
        //remover sublist
        list.subList(2, 4).clear();
        System.out.println(list);
	}

}
