package arquivos;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Numero {

	public static void main(String[] args) throws ParseException {
		
		double saldo = 123_456.789;
		
		//formata numero generico
		NumberFormat f = NumberFormat.getInstance();
        System.out.println(f.format(saldo));
        
        //formata numero inteiros
      	f = NumberFormat.getIntegerInstance();
        System.out.println(f.format(saldo));
        
        //formata numero percentuais
      	f = NumberFormat.getPercentInstance();
        System.out.println(f.format(0.25));
        
        //formata moedas
      	f = NumberFormat.getCurrencyInstance();
        System.out.println(f.format(saldo));
        
        //definir o numero de casas decimais
      	f.setMinimumFractionDigits(3);
        System.out.println(f.format(saldo));
        
        /* INTERNACIONALIZACAO DOS NUMEROS */
        //Locale eua = Locale.US;
        
        f = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(f.format(saldo));
        
        f = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println(f.format(saldo));
        
        /*CONVERSAO DE VALORES */
        f = NumberFormat.getCurrencyInstance();
        System.out.println( f.parse("R$ 1.100,25"));     
	}
}
