package collections;

import java.util.ArrayList;

//classe do tipo generica
public class Generico <E>{

	/* Generico vieram pra resolver o problema de execução dos
	    programas com segurança*/
    	
    E elemento;

    public void setElemento(E elemento){
	    this.elemento = elemento;
    }
    public E getElemento(){
	    return elemento;
}
    
    //Caracteres coringas permitem especificar parametros 
    //que atuam como supertipos ou subtipos parametrizados
    //kero passar uma lista qualquer elemento q Number ou filho de Number
    //qualquer tipo q estenda number ou number
    public double soma(ArrayList<? extends Number> lista){
    	double total = 0;
    	for (Number number : lista){
    		total += number.doubleValue();
    	}
    	return total;
    }
    
    //Para pegar somente os pais de number
    //public double soma(ArrayList<? super Number> lista){ }
    public static void main(String[] args) {
    	/* Defeito
    	//apartir do momento q aceita um tipo de dado object
    	//pode aceitar qualquer tipo de elemento
    	Generico g = new Generico();
    	g.setElemento("Lago Paranoa!!!!");
    	g.setElemento(123456);
        */
    	//Qdo contruimos classe genericos precisamos informar o tipo
    	//de dado q ela vai manipular.
    	Generico<String> g = new Generico();
    	//tipo inteiro nao pode ser aplicado nesse caso.
    	g.setElemento("Lago Paranoa!!!!");
    	//g.setElemento(123456);
    	g.getElemento().toUpperCase();
    	
    	
    }
}	
                                                                                    
