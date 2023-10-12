package com.colaresamanda.aula01.exercicio03;

import java.util.Scanner;

public class PrincipalA01E03 {
    // Crie um programa que leia 3 números, imprima o maior, o menor e a média aritmética.
// A method to find the largest, smallest, and average of three numbers
    static void getLargestSmallestAverage(int value1, int value2, int value3) {
        int smallestNumber;
        int largestNumber;
        float average = (float) (value1 + value2 + value3) / 3; // Calculate the average of the three numbers
        // or
        // float average = (value1 + value2 + value3) / 3.0f;

        int[] numbersArr = new int[]{value1, value2, value3};

        smallestNumber = numbersArr[0];
        largestNumber = numbersArr[0];

        // Loop through the numbers to find the smallest and largest
        for (int i = 0; i < 3; i++) {
            if (numbersArr[i] < smallestNumber) {
                smallestNumber = numbersArr[i]; // Update smallest if a smaller number is found
            }

            if (numbersArr[i] > largestNumber) {
                largestNumber = numbersArr[i]; // Update largest if a larger number is found
            }
        }

        // Print the results
        System.out.printf("Largest number: %d\nSmallest number: %d\nAverage: %f", largestNumber, smallestNumber, average);
    }

    // A method to run the program
    public void run() {
        // Get user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Value 1: ");
        int value1 = scanner.nextInt();

        System.out.print("Value 2: ");
        int value2 = scanner.nextInt();

        System.out.print("Value 3: ");
        int value3 = scanner.nextInt();

        scanner.close(); // Close the scanner to release resources

        getLargestSmallestAverage(value1, value2, value3); // Call the method to find and print the results
    }
}
