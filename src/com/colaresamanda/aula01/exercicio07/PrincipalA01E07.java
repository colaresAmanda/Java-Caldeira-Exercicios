package com.colaresamanda.aula01.exercicio07;

import java.util.Scanner;

public class PrincipalA01E07 {
//    Criar para uma empresa de consórcio. No teste inicial, você deve perguntar para o usuário a idade dele e o seu salário. A pessoa só pode comprar um automóvel se for de maior e ganhar mais de R$ 2.000,00.
    public void run(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int userAge = scanner.nextInt();

        System.out.print("Enter your age: ");
        double userSalary = scanner.nextDouble();

        if(userAge > 18 && userSalary > 2000){
            System.out.println("Congratulations! You can buy a car.");
        }else{
            System.out.println("Sorry! You can't buy a car.");
        }
    }
}
