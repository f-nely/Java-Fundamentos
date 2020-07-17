package challenges;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int fat = 1;
        for(int i = 1; i<=N; i++) {
            fat *= i;
        }
        System.out.println(fat);
        scan.close();
    }
}
