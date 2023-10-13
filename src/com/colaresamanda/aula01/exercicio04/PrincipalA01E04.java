package com.colaresamanda.aula01.exercicio04;

import java.util.Scanner;

public class PrincipalA01E04 {
//    Crie um programa que leia o valor do salário mínimo e o valor do salário de um usuário, calcule a quantidade de salários mínimos que esse usuário ganha e imprima o resultado, assuma que o salário mínimo é R$1.320.

    public static final double MINIMUM_WAGE = 1320.0;

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        double userSalary = scanner.nextDouble();

        double numberOfMinimumWages = userSalary / MINIMUM_WAGE;
        System.out.println(numberOfMinimumWages);
    }
}
