package com.backaofront;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Exercicio 1");
        int num1, num2, num3, num4;

        System.out.println("Digite quatro numeros inteiros: ");
       num1 = input.nextInt();
       num2 = input.nextInt();
       num3 = input.nextInt();
       num4 = input.nextInt();

        System.out.println("A soma de todos juntos: " + (num1 + num2 + num3 + num4));
        }
    }
