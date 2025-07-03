package Excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {
	//String
	public static void dividir(Scanner s)
	    throws InputMismatchException, ArithmeticException
	{
		System.out.println("Numero: ");
		int a = s.nextInt();
		System.out.println("Divisor: ");
		int b = s.nextInt();
		
		System.out.println(a / b);
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean continua = true;
		do {

			try {

				dividir(s);
				continua = false;
				// InputMismatchException entrar com letra
				// ArithmeticException entrar com zero.
			} catch (InputMismatchException | ArithmeticException e1) {
				System.out.println("Numeros devem ser inteiros");
				e1.printStackTrace();//imprime a pilha de erro encontrada nessa exceção
				s.nextLine();//descarta a entrada q deu erro e libera novamente p o usuario
			} 
			/*catch (ArithmeticException e2) {
				System.out.println("Divisor deve ser diferente de zero");
				s.nextLine(); 
			}*/
			finally {
				System.err.println("Finnaly executado....");
			}
		} while (continua);
	}
}
