package com.backaofront;

import java.util.Scanner;

public class Exercicio_8 {
    public static void main(String[] args){
			// declaro o scanner
			Scanner input = new Scanner(System.in);
			// declarar variavel
			int n1, n2, media;
			// peço as informações do usuario
			System.out.println("Digite a nota da primeira prova: ");
			n1 = input.nextInt();

			System.out.println("Digite a nota da segunda prova: ");
			n2 = input.nextInt();

			System.out.println("-------------------------------");

			// calculo
			media = (n1 + n2) /2 ;

			// declaro a condição do if
			if (media >= 6) {
				System.out.println("Media do aluno: " + media + ", aluno aprovado");
			} else {
				System.out.println("Media do aluno: " + media + ", aluno reprovado!!!");
			}
			input.close();
		}
}