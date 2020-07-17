package challenges;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for(int i=1; i<=10; i++) {
            System.out.println(String.format("%d X %d = %d ", N, i, (i*N)));
        }
        scan.close();
    }
}
