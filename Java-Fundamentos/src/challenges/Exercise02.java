package challenges;
import java.util.Scanner;

public class Exercise02 {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        if(N%2==0) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }
        scan.close();
    }
}
