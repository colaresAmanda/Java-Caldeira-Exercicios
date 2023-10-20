package com.colaresamanda.aula01.exercicio05;

import java.time.LocalDateTime;

public class PrincipalA01E05 {
    public void run() {

        //    Exercicio 05
//    Crie um programa que armazene um horário (hora, minuto e segundo) em variáveis,
//    depois, determine e exiba a quantidade de segundos que se passaram desde as 0h00min0s
//    e a quantidade de segundos que faltam para a meia-noite.
        // Get the current hour and save it in a variable
        int currentHour = LocalDateTime.now().getHour();
        int currentMinute = LocalDateTime.now().getMinute();
        int currentSecond = LocalDateTime.now().getSecond();

//       minutes from midnight
        int minutesFromMidnight = (((currentHour * 60) + currentMinute) * 60) + currentSecond;

        int secondsInADay = 24 * 60 * 60;
        int secondsUntilMidnight = secondsInADay - minutesFromMidnight;

        System.out.println("Seconds passed since midnight: " + minutesFromMidnight);
        System.out.println("Seconds remaining until midnight: " + secondsUntilMidnight);


    }
}
