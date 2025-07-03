package ExpressoesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressaoRegular {

	public static void main(String[] args) {
		
		String padrao = "Java";
		String texto = "Java";
		boolean b;
		
		//metodo q valida a ocorrencia de texto .matches q recebe uma expressao regular
		//mesma linha texto e metodo p economizar espaco
		/* b = "Java".matches("Java");   */
				
		/*MODIFICADORES 
		  (?i), Ignora maiusculas minusculas
		  (?x), Comentarios
		  (?m), Multilinhas
		  (?s), Dottal	  
		 */
		b = "Java".matches("(?i)java" );
		b = "Java".matches("(?im)java" );
		
		/*METACARACTERES 
		  . qualquer caracter
		  \d digitos          [0-9]
		  \D nao e digito     [^0-9]
		  \s espacos          [ \t\n\x0B\f\r]
		  \S nao e espaco     [^\s]
		  \w letra            [a-zA-Z_0-9] 
		  \W nao e letra      [^a-zA-Z_0-9] 
	    */
		
		b = "@".matches(".");
		b = "2".matches("\\d");
		b = "A".matches("\\w");
		b = " ".matches("\\s");
		//Metacaracteres especiais
		b = "Pi".matches("..");
		b = "Pie".matches("...");
		b = "21".matches("\\d\\d");
		//Validacao do CEP
		String cep = "\\d\\d\\d\\d\\d-\\d\\d\\d";
		b = "70294-070".matches(cep);
		
		/* QUANTIFICADORES
		  X{n}         X, exatamente n vezes 
		  X{n,}        X, pelo menos n vezes
		  X{n,m}       X, pelo menos n mas nao mais do que m vezes
		  X?           X, 0 ou 1 vez
		  X*           X, 0 ou + vezes
		  X+           X, 1 ou + vezes
		 */
		b = "21".matches("\\d{2}");
		b = "123".matches("\\d{2,}");
		
		b = "".matches(".?");//0 ou 1
		b = "ab".matches(".*");//0 ou +
		b = "123".matches(".+");//1 ou + 
		
		//avaliando o CEP
		b = "70294-070".matches("\\d{5}-\\d{3}");
		 
		b = "Pier21".matches("\\d{2,5}");   
		b = "12/02/1980".matches("\\d{2}/\\d{2}/\\d{4}");//para colocar / e so colocar ela 
				
		/* METACARACTER DE FRONTEIRA
		  ^ inicia   $ finaliza    | ou   */
		b = "Pier21".matches("^Pier.*");
		b = "Pier21".matches(".*21$");
		b = "tem java aqui".matches(".*java.*");
		b = "tem java aqui".matches("^tem.*aqui$");
		b = "sim".matches("sim|nao");   
		
		/* AGRUPADORES
		  [...]            Agrupamento
		  [a-z]            Alcance
		  [a-e][i-u]       Uniao
		  [a-z&&[aeiou]]   Interseçao
		  [^abc]           Excecao
		  [a-z&&[^m-p]]    Subtração
		  \x               Fuga literal
		     */
		b = "True".matches("[tT]rue");//True true
		b = "True".matches("[tT]rue|[yY]es");//True true yes Yes
		b = "Beatriz".matches("[A-Z][a-z]*");//Primeiro Nome letra maiscula
		b = "alho".matches("[^abc]lho");//Palavras q nao tenham abc na frente
		b = "crau".matches("cr[ae]u");//crau creu
		
		b = "rh@xtiuniversity.com".matches("\\w+@\\w+\\.\\w{2,3}");//validacao de email
		//System.out.println(b);	
		String doce = "Qual e o Doce mais doCe que o doce?";
		/*Encontrar e localizar todas as ocorrencias da palavra doce
			Classe especial p manipulacao de expressoes regulares
			Pattern tem o metodo compile expressao regular
			diferenca entre o metodo matches vai fazer todo o trabalho
		    de convertar essa expressao regular em algoritmo que consiga validar 
		    akele texto em tempo de execução.
		    Ja a classe Partern qdo vc pede p preparar a expressao regular q embreve
		    eu vou utilizar. Vc prepara ela uma vez p depois vc utilizar isso varias vezes.
		    como ex. se vc precisar utilizar varias vezes e melhor a classe Parttern
		*/
		Matcher matcher = Pattern.compile("(?i)doce").matcher(doce);
		//Para encontrar todas as ocorrencias da palavra doce. use o metodo 
		//metodo find q retornar um boolean
		while(matcher.find()){
			//metodo group recupera essa ocorrencia
			System.out.println(matcher.group());
		}
		/* SUBSTITUICAO */
		String r = doce.replaceAll("(?i)doce", "DOCINHO");
		String rato = "O rato roeu a roupa do rei de roma";
		r = rato.replaceAll("r[aeiou]", "XX");
		//trocar espacos por tabulacao
		r = "Tabular este texto".replaceAll("\\s", "\t");
		//criar variaveis dentro do seu texto e utilizar 
		//essas variaveis p formatacao de um conteudo.
		String url ="www.xti.com.br/clientes-2011.html";
		//alterar p //http://www.xti.com.br/2011/clientes.jsp//Objetivo
		//construir uma expressao regular q localize o padra de links
		String re = "www.xti.com.br/\\w{2,}-\\d{4}.html";
		b = url.matches(re);
		System.out.println(b);
		//Quando colocado entre parenteses o texto se torna uma variavel
		re = "(www.xti.com.br)/(\\w{2,})-(\\d{4}).html";
		//para recuperar a variavel utiliza $1
		r = url.replaceAll(re, "http://$1/$3/$2.jsp");
		System.out.println(r);
		System.out.println(url);
		
	}

}
