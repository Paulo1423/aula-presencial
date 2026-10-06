package com.backaofront;

import java.util.Scanner;

public class Exercicio_11 {
  public static void main(String[] args) {
		// declaro o scannor
	Scanner input = new Scanner(System.in);
	int idade, ano, mesNascimento;
	int anoAtual = 2026;
	int mesAtual = 10;
	// peço a info pro usuario
	System.out.println("Digite o ano de nascimento para registrar sua idade: ");
	ano = input.nextInt();
	// condição caso o usuario digite o ano fora do padrão
	if (ano >= 1900 && ano <= anoAtual){
		System.out.println("Digite seu mês de nascimento de 1 a 12: ");
		mesNascimento = input.nextInt();
		// conta para chegar na idade
		idade = anoAtual - ano;
		// condição por mes de nacimento
		if (mesNascimento > mesAtual){
			idade = idade - 1;
		} // mostro o resultado pro usuario
		System.out.println("Sua idade registrada: " + idade + " anos");
	} else { // caso a condição nao seja cumprida
			System.out.println("Ano de nascimento invalido!!!");
	}
	input.close();
  }
}