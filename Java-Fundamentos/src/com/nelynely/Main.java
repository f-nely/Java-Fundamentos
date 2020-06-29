package com.nelynely;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1 = scan.nextInt();
        System.out.println("Inform the operation: ");
        char operation = scan.next().charAt(0);
        System.out.println("Enter the second number: ");
        int number2 = scan.nextInt();
        System.out.println(String.format("Do you want to do the operation %d %c %d ?", number1, operation, number2));
        float resul = 0;
        if (operation == '+'){
            resul = number1 + number2;
        } else if (operation == '-'){
            resul = number1 - number2;
        } else if (operation == '*'){
            resul = number1 * number2;
        } else if (operation == '/'){
            resul = number1 / number2;
        } else {
            System.out.println("Invalid operation: ");
        }
        System.out.println(String.format("%d %c %d = %.2f ", number1, operation, number2, resul));
        scan.close();
    }
}
