package com.backaofront;
import java.util.Scanner;

public class Exercicio_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int codigo;
		double quantidade, soma;
		System.out.println("Insira o codigo do produto: ");
		codigo = input.nextInt();

		switch(codigo){
			case 100:
				System.out.println("-------------------------");
				System.out.println("Produto = Cachorro quente");
				System.out.println("Selecione a quantidade: ");
				quantidade = input.nextDouble();
				soma = quantidade * 1.20;
				System.out.printf("Total a ser pago = R$%.2f", soma);
				break;
			case 101:
				System.out.println("-------------------------");
				System.out.println("Produto = Bauru simples");
				System.out.println("Selecione a quantidade: ");
				quantidade = input.nextDouble();
				soma = quantidade * 1.30;
				System.out.printf("Total a ser pago = R$%.2f", soma);
				break;
			case 102:
				System.out.println("-------------------------");
				System.out.println("Produto = Bauru com ovo");
				System.out.println("Selecione a quantidade: ");
				quantidade = input.nextDouble();
				soma = quantidade * 1.50;
				System.out.printf("Total a ser pago = R$%.2f", soma);
				break;
			case 103:
				System.out.println("-------------------------");
				System.out.println("Produto = Hamburguer");
				System.out.println("Selecione a quantidade: ");
				quantidade = input.nextDouble();
				soma = quantidade * 1.20;
				System.out.printf("Total a ser pago = R$%.2f", soma);
				break;
			case 104:
				System.out.println("-------------------------");
				System.out.println("Produto = Cheeseburguer");
				System.out.println("Selecione a quantidade: ");
				quantidade = input.nextDouble();
				soma = quantidade * 1.70;
				System.out.printf("Total a ser pago = R$%.2f", soma);
				break;
			case 105:
				System.out.println("-------------------------");
				System.out.println("Produto = Suco");
				System.out.println("Selecione a quantidade: ");
				quantidade = input.nextDouble();
				soma = quantidade * 2.20;
				System.out.printf("Total a ser pago = R$%.2f", soma);
				break;
			case 106:
				System.out.println("-------------------------");
				System.out.println("Produto = Refrigerante");
				System.out.println("Selecione a quantidade: ");
				quantidade = input.nextDouble();
				soma = quantidade * 1.30;
				System.out.printf("Total a ser pago = R$%.2f", soma);
				break;
			default:
				System.out.println("Codigo do produto não existe!!!");
		}

	}
}