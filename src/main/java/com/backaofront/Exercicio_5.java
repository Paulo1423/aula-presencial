package com.backaofront;

import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base, altura;

        System.out.println("Digite a base do seu triângulo:");
        base = input.nextInt();
        System.out.println("Digite a altura do seu triângulo:");
        altura = input.nextInt();

        System.out.println("A área do seu triangulo é de: " + (base * altura) /2);
    }
}
