package datas_Math;

import java.util.Calendar;
import java.util.Date;

public class Datas {

	public static void main(String[] args) {
		/*O tempo em Java e medido em milisegundos apartir de 01/01/1970 tempo zero*/ 
        //Recupera em milisegundos
		System.out.println(System.currentTimeMillis());
		//Criar um objeto do tipo Date retornando a data atual
		Date agora = new Date();
		System.out.println(agora);
		//passando os milesegundos atual como paramentro
		Date data = new Date(System.currentTimeMillis());
		//Criando uma data passando uma qtde de milisegundos
		//passando uma qtde de milisegundos como parametro
		Date dataMili = new Date(1_000_000_000_000L);
		System.out.println(dataMili);
		//Date data = new Date(System.currentTimeMillis());
        /*METODOS QUE PODEM SER UTILIZADOS */
		//recupera o tempo atual em milisegundos
		data.getTime();
		//definir um tempo em milisegundos
		data.setTime(1_000_000_000_000L);
		//comparar uma data com outra e se essa data for menor q a outra retorna -1,0,1
		System.out.println(data.compareTo(agora));
		//Nao usar outros metodos q nao serao mais usados.
		//apartir agora sera utilizada com a Calendar
		
		/*MANIPULAR DATAS COM CALENDAR - nao deve ser inicializada
		  e abstrata. */
		//getInsatance() retorna uma instancia de calendario q retorna calendario gregoriano
		//ou new GregorianCalendar(); - q retorna o calendario gregoriano.
		
		Calendar c = Calendar.getInstance();
		c.set(1980, Calendar.FEBRUARY, 12);
		System.out.println(c);
		//P pegar objeto do tipo Date usa getTime q retorna objeto do tipo Date
		//retorna o tempo em milisegundos
		System.out.println(c.getTime());
		//pegar um campo especifico como ano
		System.out.println(c.get(Calendar.YEAR));
		//o mes comeca a ser contado aparti de zero
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		//o metodo set e usado para definir os campos 
		c.set(Calendar.MONTH, 1972);//alterando o mes
		//ou dessa forma
		c.set(Calendar.MONTH, Calendar.MARCH);//alterando o mes
		//pega a data
		System.out.println(c.getTime());
		//limpar campos
		c.clear(Calendar.MINUTE);
		c.clear(Calendar.SECOND);
		System.out.println(c.getTime());		
		//ADD ou remover unidade de tempo ou diminuir
		c.add(Calendar.DAY_OF_MONTH, 1);
		c.add(Calendar.YEAR, 1);
		//diminuir o ano
		c.add(Calendar.YEAR, -2);
		System.out.println(c.getTime());
		//aumenta ou diminui a unidade de tempo mas nao altera tipos maiores
		//o metodo roll add os dias mas ele nao modifica a unidade de tempo superior
		//ex vc altera o dia e ele nao altera o mes ao contrario de add.
		c.roll(Calendar.DAY_OF_MONTH, -20);
		System.out.println(c.getTime());
		/* SAUDACAO COM BOM DIA, BOA TARDE OU BOA NOITE*/	
		//Criando uma instancia
		Calendar c1 = Calendar.getInstance();
		//pegar a h do dia
		int hora = c1.get(Calendar.HOUR_OF_DAY);
		if (hora <= 12)  { 
			System.out.println("Bom Dia!"); 		
			}
		else if(hora > 12 && hora < 18){   
			System.out.println("Bom Tarde!");
		}
		else {
			System.out.println("Bom Noite!");
		}	
	}

}
