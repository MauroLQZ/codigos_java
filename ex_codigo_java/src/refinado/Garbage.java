package refinado;

import java.util.ArrayList;
import java.util.List;

public class Garbage {
	
	//carrega na memoria varios elementos sobrecarregando a mem.
   public static long carregarMemoria(){
	List<Integer> lista = new ArrayList<>();
	for (int i = 0; i < 100_000 ; i++) {
		lista.add(i);
	}
	return Runtime.getRuntime().freeMemory();
   }
   
	public static void main(String[] args) {
		
		//recupera os metodos da classe Garbage Colector
		Runtime rt = Runtime.getRuntime();
		int MB = 1_048_576;//total de bytes em 1MB
		//verifica a qtde de bytes disponivel na memoria
		double total = rt.maxMemory()/MB;
		System.out.println("Memoria disponivel TOTAL : " + total);
		
		//Quantidade de memoria no inicio
		double inicio = total - (carregarMemoria()/MB);
		System.out.println("Memoria depois do metodo: " + inicio);
		
		//Executando os metodos de limpeza
	    //finalizando tudo q seja possivel na memoria
		rt.runFinalization();
		//metodo q força a execução do garbage colector
		rt.gc();
		//Calculo do total de memoria dps da limpeza
		double fim  = total - (rt.freeMemory()/MB);
		System.out.println("Inicio: "+ inicio +"Fim : " + fim);
	
	
	}

}
