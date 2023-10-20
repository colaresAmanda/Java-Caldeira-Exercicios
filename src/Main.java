import com.colaresamanda.aula01.exercicio01.PrincipalA01E01;
import com.colaresamanda.aula01.exercicio02.PrincipalA01E02;
import com.colaresamanda.aula01.exercicio03.PrincipalA01E03;
import com.colaresamanda.aula01.exercicio04.PrincipalA01E04;
import com.colaresamanda.aula01.exercicio05.PrincipalA01E05;

public class Main {
    public static void main(String[] args) {
        // Exercício 01:  Crie um programa que leia seu nome e imprima na tela.
        var A01E01 = new PrincipalA01E01();
//        A01E01.run();

        // Exercício 02: Crie um programa que receba 2 números e imprima na tela.
        var A01E02 = new PrincipalA01E02();
//        A01E02.run();

        // Exercício 03: Crie um programa que leia 3 números, imprima o maior, o menor e a média aritmética.
        var A01E03 = new PrincipalA01E03();
//        A01E03.run();

        // Exercício 04: Crie um programa que leia o valor do salário mínimo e o valor do salário de um usuário, calcule a quantidade de salários mínimos que esse usuário ganha e imprima o resultado, assuma que o salário mínimo é R$1.320.
        var A01E04 = new PrincipalA01E04();
//        A01E04.run();

        // Exercício 5: Crie um programa que armazene um horário (hora, minuto e segundo) em variáveis, depois, determine e exiba a quantidade de segundos que se passaram desde as 0h00min0s e a quantidade de segundos que faltam para a meia-noite.
        var A01E05 = new PrincipalA01E05();
        A01E05.run();
    }
}