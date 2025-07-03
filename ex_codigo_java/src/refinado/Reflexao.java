package refinado;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
//import java.text.DateFormat.Field;
import java.lang.reflect.Field;

/* 
 * A reflexao e utilizada em varios frameworks de persistencia,
 * camadas, integraçao.
 * para descobrir detalhes de uma classe
 * tambem conhecida como introspecção
 * */
public class Reflexao {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws Exception {

		String nome = "threads.ContaConjunta";
		// Construir uma classe apartir desse nome
		Class classe = Class.forName(nome);
		// pegando o nome da classe
		System.out.println(classe.getSimpleName());

		// Pegando todos os campos publicos da classe conta
		Field[] f = classe.getFields();
		for (Field field : f) {
			System.out.println(field);
		}

		/* METODOS DESSA CLASSE */
		// retorna um array de metodos: public, private etc...
		Method[] m = classe.getDeclaredMethods();
		for (Method method : m) {
			// imprime o nome do metodo
			System.out.println(method.getName());
		}

		/* CONSTRUTORES */
		// retorna todos os construtores de uma classe
		Constructor[] c = classe.getConstructors();
		for (Constructor constructor : c) {
			System.out.println(constructor);
		}
		/* CONSTRUIR OBJETOS */

		// utilizando a reflexao vc pode construir objetos
		Object o = classe.newInstance();
		// apartir dessa instancia vc pod recuperar um metodo
		Method md = classe.getMethod("sacar", int.class, String.class);
		// invocando metodo sem parametro
		Method me = classe.getMethod("getSaldo");
		// invocar o metodo
		md.invoke(o, 120, "Mauro");
		me.invoke(o);
		/*
		 * APENAS COMO EXEMPLO, POIS A CLASSE CONTACONJUNTA NAO TEM CONSTRUTOR
		 * COMO PARAMETRO
		 * 
		 * executar o construtor da conta que inicializa o cliente e o saldo
		 * Constructor co = classe.getConstructor(String.class, double.class);
		 * Object obj = co.newInstance("Mauro", 123_456.789); 
		 * me.invoke(obj);
		 */
	}

}
