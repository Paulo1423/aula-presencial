package com.backaofront;

import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        System.out.println("Exercicio 2");
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Digite 3 numeros para tirar a média aritmética:");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();

        System.out.println("A media aritmética desses numeros: " + (num1 + num2 + num3) / 3);
        input.close();
    }
}
