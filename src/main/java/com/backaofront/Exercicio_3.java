package com.backaofront;

import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira seu salario atual: ");
        double salario = input.nextDouble();

        double aumento = (salario * 25) / 100;
        double total = aumento + salario;

        System.out.printf("Seu salario se ajustou em: R$%.2f, com o salario total de R$%.2f",aumento, total);
        input.close();
    }
}