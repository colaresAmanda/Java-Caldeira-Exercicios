package com.colaresamanda.aula01.exercicio01;

import java.util.Scanner;

public class PrincipalA01E01 {
    //    Crie um programa que leia seu nome e imprima na tela.

    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Your name is: " + name);
    }
}
