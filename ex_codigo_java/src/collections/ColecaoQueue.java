package collections;

import java.util.LinkedList;
import java.util.Queue;

public class ColecaoQueue {

	public static void main(String[] args) {
		
		//FIFO
		Queue<String> fila = new LinkedList<>();
		fila.add("Mauro");
		fila.add("Sandra");
		fila.add("Beatriz");
		System.out.println(fila);
		
		//Ql e o proximo elemento a ser atendido na fila
		System.out.println(fila.peek());
		//remover o elemento da fila q esta no inicio
		System.out.println(fila.poll());		
		System.out.println(fila);
		
		/*Outros metodos  */
		LinkedList<String> f = (LinkedList<String>) fila;
		//add primeiro na fila
		f.addFirst("Caio");
		//add ultimo na fila
		f.addLast("Juliana");
		System.out.println(f);
		//remove primeira pessoa da fila
		//f.poll();  ou 
		f.pollFirst();
		f.pollLast();
		System.out.println(f);
	}

}
