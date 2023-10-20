package com.colaresamanda.aula01.exercicio08;

import java.util.Scanner;

public class PrincipalA01E08 {

    public void run(){
//        Criar um algoritmo para definir as filas prioritárias. Seu programa deve exibir um menu de opções, perguntando se a pessoa é Gestante, Idosa, PCD ou Nenhuma das alternativas. Se ela for PCD, Idosa ou Gestante, tem direito a fila prioritária. Se não, não tem direito.

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your condition?");
        System.out.println("1 - Pregnant");
        System.out.println("2 - Elderly");
        System.out.println("3 - PWD (Person with Disability)");
        System.out.println("4 - None of the above");
        System.out.print("Choose an option (1/2/3/4): ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You are entitled to a priority queue as a Pregnant individual.");
                break;
            case 2:
                System.out.println("You are entitled to a priority queue as an Elderly person.");
                break;
            case 3:
                System.out.println("You are entitled to a priority queue as a PWD (Person with Disability).");
                break;
            case 4:
                System.out.println("You do not have the right to a priority queue.");
                break;
            default:
                System.out.println("Invalid option. Please choose one of the valid options.");
        }

        scanner.close();
    }
}
