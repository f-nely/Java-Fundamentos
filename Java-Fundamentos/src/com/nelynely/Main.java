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
        scan.close();
    }
}
