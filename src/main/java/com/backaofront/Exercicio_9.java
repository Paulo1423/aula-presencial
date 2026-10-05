package com.backaofront;

import java.util.Scanner;

public class Exercicio_9 {
	public static void main(String[] args) {
		// declaro o scanner
		Scanner input = new Scanner(System.in);
		// declaro variavel
		int mes;
		// peço para o usuario escolher um mes
		System.out.println("Para saber o mês digite um numero de 1 a 12:");
		mes = input.nextInt();
		// com switch eu declaro onde cada mes vai ficar e oq acontece quando o usuario escolher
		switch(mes){
			case 1:
				System.out.println("Mês de janeiro");
				break;
			case 2:
				System.out.println("Mês de fevereiro");
				break;
			case 3:
				System.out.println("Mês de março");
				break;
			case 4:
				System.out.println("Mês de abril");
				break;
			case 5:
				System.out.println("Mês de maio");
				break;
			case 6:
				System.out.println("Mês de junho");
				break;
			case 7:
				System.out.println("Mês de julho");
				break;
			case 8:
				System.out.println("Mês de agosto");
				break;
			case 9:
				System.out.println("Mês de setembro");
				break;
			case 10:
				System.out.println("Mês de outubro");
				break;
			case 11:
				System.out.println("Mês de novembro");
				break;
			case 12:
				System.out.println("Mês de dezembro");
				break;
			// caso o usuario escolha um numero de mes que seja invalido
			default:
				System.out.println("Mês não existente.");
		}
			input.close();
	}
}