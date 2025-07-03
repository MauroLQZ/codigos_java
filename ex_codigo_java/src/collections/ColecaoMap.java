package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ColecaoMap {

	public static void main(String[] args) {

		//dois parametro 1 tipo da chave e outro tipo do vlr q vai ta vinculado a chave
		Map<String, String> pais = new HashMap<>();
		pais.put("BR" , "Brasil");
		pais.put("RU" , "Russia");
		pais.put("IN" , "India");
		pais.put("CN" , "China");
		System.out.println(pais);
		
		//Descobrir se uma determinada chave existe no mapa
		System.out.println(pais.containsKey("BR"));
		System.out.println(pais.containsKey("US"));
		System.out.println(pais.containsValue("Brasil"));
		
		//Recuperar um conteudo pela chave
		System.out.println(pais.get("CN"));
		
		//Remover um conteudo pela chave
		pais.remove("RU");
		System.out.println(pais);
		
		//Recuperar todas as chaves de um map
		//nao aceita registro duplicados
		Set<String> keys = pais.keySet();
		for (String key : keys) {
		    System.out.println(key + ":" + pais.get(key));
		}
	}

}
