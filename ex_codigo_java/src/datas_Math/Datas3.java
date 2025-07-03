package datas_Math;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Datas3 {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		c.set(1980, Calendar.FEBRUARY, 12);
		Date date = c.getTime();
		//Formatacao padrao da data
		System.out.println(date);
		
		//para recuperar a data na localizacao q se esta
		Locale padrao = Locale.getDefault();
						
		DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(f.format(date));
        
      //para criar um locale codigo lingua e o pais da sua localizacao
      //lingua iso 639 e pais iso 3166
      //localizacao brasil e lingua portuguesa
        Locale brasil = new Locale("pt" , "BR");
        Locale india = new Locale("hi" , "IN");
        Locale eua = Locale.US;
        Locale japao = Locale.JAPAN;
        Locale italia = Locale.ITALIAN;

        f = DateFormat.getDateInstance(DateFormat.FULL, brasil);
        System.out.println(f.format(date));//Brasil
        
        f = DateFormat.getDateInstance(DateFormat.FULL, india);
        System.out.println(f.format(date));//India
        
        f = DateFormat.getDateInstance(DateFormat.FULL, eua);
        System.out.println(f.format(date));//Estados unidos
        
        f = DateFormat.getDateInstance(DateFormat.FULL, japao);
        System.out.println(f.format(date));//Japao
        
        f = DateFormat.getDateInstance(DateFormat.FULL, italia);
        System.out.println(f.format(date));//Japao
        
        
        
	}

}
