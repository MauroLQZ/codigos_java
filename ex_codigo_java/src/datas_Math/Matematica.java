package datas_Math;

import java.io.Console;
import java.io.PrintStream;

// Referenced classes of package exercicios:
//            Console

public class Matematica {

	public Matematica() {
	}

	public int soma(int valor1, int valor2) {
		int resultado = valor1 + valor2;
		return resultado;
	}

	public int subtracao(int valor1, int valor2) {
		int resultado = valor1 - valor2;
		return resultado;
	}

	public int multiplicacao(int valor1, int valor2) {
		int resultado = valor1 * valor2;
		return resultado;
	}

	public int divisao(int valor1, int valor2) {
		int resultado = valor1 / valor2;
		return resultado;
	}

	public static void main(String args[]) {
		
		System.out.print("Digite o Oper: ");
		/*
		int oper = Console.scanInt();
		System.out.print("Digite o Op1: ");
		int op1 = Console.scanInt();
		System.out.print("Digite o Op2r: ");
		int op2 = Console.scanInt();
		int resultado = 0;
		switch (oper) {
		case 1: // '\001'
			resultado = soma(op1, op2);
			break;

		case 2: // '\002'
			resultado = subtracao(op1, op2);
			break;

		case 3: // '\003'
			resultado = multiplicacao(op1, op2);
			break;

		case 4: // '\004'
			resultado = divisao(op1, op2);
			break;

		default:
			resultado = 0;
			break;
		}
		System.out.println((new StringBuilder()).append("Resultado final: ")
				.append(resultado).toString());
	*/
	}
	
}
