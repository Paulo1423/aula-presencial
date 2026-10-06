package com.backaofront;

import java.util.Scanner;

public class Exercicio_11 {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int idade, ano, mesNascimento;
	int anoAtual = 2026;
	int mesAtual = 10;

	System.out.println("Digite o ano de nascimento para registrar sua idade: ");
	ano = input.nextInt();

	if (ano >= 1900 && ano <= anoAtual){
		System.out.println("Digite seu mês de nascimento de 1 a 12: ");
		mesNascimento = input.nextInt();

		idade = anoAtual - ano;

		if (mesNascimento > mesAtual){
			idade = idade - 1;
		}
		System.out.println("Sua idade registrada: " + idade + " anos");
	} else {
			System.out.println("Ano de nascimento invalido!!!");
	}
	input.close();
  }
}