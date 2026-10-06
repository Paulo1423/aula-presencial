package com.backaofront;

import java.util.Scanner;

public class Exercicio_10 {
	public static void main(String[] args) {
		// declaro o scanner
		Scanner input = new Scanner(System.in);
		// as variaveis
		int quantMaca;
		double precoUnitario, total;
	// capturo a informação do usuario
	System.out.println("Quantas maças foram compradas: ");
	quantMaca = input.nextInt();
	// uso if/else para fazer o calculo
	if (quantMaca < 12){
		precoUnitario = 0.30;
	}	else {
		precoUnitario = 0.25;
	} // faço a soma do total
	total = precoUnitario * quantMaca;
	// mostro pro usario o resultado
	System.out.printf("Total da compra: R$%.2f", total);

	}
}