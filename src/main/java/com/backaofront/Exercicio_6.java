package com.backaofront;

import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // defino as variaveis
        double r, calculo;
        // pego as informações com do usuario
        System.out.println("Digite raio do seu circulo: ");
        r = input.nextDouble();

        // faço o calculo usando "Math.PI" para ser mais exato o valor de pi, e "Math.pow" para elevar o raio ao quadrado
        calculo = Math.PI * Math.pow(r, 2);

        // mostro o resultado do calculo para o usuario
        System.out.printf("A area do seu circulo é de: %.2f", calculo);
        // fecho o input scanner para não dar erro
        input.close();
    }
}