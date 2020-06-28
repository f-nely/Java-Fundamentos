package com.nelynely;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = scan.nextLine();
        System.out.println("Hey " + name);
        scan.close();
    }
}
