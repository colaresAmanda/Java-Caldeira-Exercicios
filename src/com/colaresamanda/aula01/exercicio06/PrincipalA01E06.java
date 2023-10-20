package com.colaresamanda.aula01.exercicio06;

import java.util.Scanner;

public class PrincipalA01E06 {
//    Escreva um programa que leia a idade do usuário e imprima respostas diferentes dependendo do número colocado:
//    Se for menor de 16 anos, avisar que não pode votar;
//    Se tiver 16 ou 17, avisar que o voto é facultativo;
//    Se tiver mais de 65, avisar que também é facultativo o voto;
//    De 18 até 65, é obrigatório votar.
    public void run(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int userAge = scanner.nextInt();

        if(userAge < 16){
            System.out.println("You are not allowed to vote");
        }else if(userAge >= 16 && userAge <= 17 || userAge > 65){
            System.out.println("You can vote, but is not mandatory");
        }else{
            System.out.println("You must vote");
        }

    }
}
