package com.colaresamanda.aula01.exercicio02;

import java.util.Scanner;

public class PrincipalA01E02 {
    //    Crie um programa que receba 2 números e imprima na tela.

    public void run(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter another number: ");
        int number2 = scanner.nextInt();

        System.out.printf("Number 1: %d\nNumber 2: %d", number1, number2);
    }
}
