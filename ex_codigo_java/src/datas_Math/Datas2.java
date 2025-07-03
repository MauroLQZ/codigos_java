package datas_Math;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.zip.DataFormatException;

public class Datas2 {

	public static void main(String[] args) throws ParseException {
		
		/*FORMATACAO PADRA DE DATA */
		Calendar c = Calendar.getInstance();
		c.set(1980, Calendar.FEBRUARY, 12);
		Date date = c.getTime();
		//Formatacao padrao da data
		System.out.println(date);
		
		/* FORMATACAO DE DATAS */
		//DateFormat e usada p formatacao de datas brasil
		DateFormat f = DateFormat.getDateInstance();
		System.out.println(f.format(date));

		/* FORMATACAO DE DATA E HORA */
		//chamar instancia de getDateTimeInstance
		f = DateFormat.getDateTimeInstance();
		System.out.println(f.format(date));
		
		/* ESTILOS FORMATACAO DE DATA E HORA */
		//dentro da classe dateformat nos temos algumas contantes
		f = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(f.format(date));
		
		//Metodo p converter uma String em uma data
		Date data2 = f.parse("12/02/1980");
		System.out.println(data2);
		
		/* CLASSE SIMPLE DATE FORMAT : mais simples de ser utilizadas*/
	    //Passa no construtor o formato da data
		//consultar documentacao p saber o significado das data como parametro
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	    System.out.println(sdf.format(date));
	    
	    //converter objetos com o metodo parse com argumento string
	    System.out.println(sdf.parse("10/10/2010"));
	    
	}

}
