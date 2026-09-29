package com.backaofront;

import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double saco_racao, gramas, refeicao, divisao, sobra;

        System.out.println("Insira o peso do saco de ração em quilos: ");
        saco_racao = input.nextDouble();

        gramas = saco_racao * 1000;

        System.out.println("Quantidade de ração para os gatos: ");
        refeicao = input.nextDouble();

        divisao = refeicao * 2;
        sobra = gramas - divisao * 5;

        System.out.printf("A ração que resta no saco em 5 dias é de: %.2fKg", sobra / 1000);
        input.close();
    }
}
