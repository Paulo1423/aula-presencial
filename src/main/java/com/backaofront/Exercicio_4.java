package com.backaofront;

import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c, f;

        System.out.println("Insira a temperatura atual: ");
        c = input.nextInt();

        f = c * 9 / 5 + 32;

        System.out.println("Convertido para fahrenheit: " + f);
    }
}
