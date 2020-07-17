package challenges;
import java.util.Scanner;

public class Exercise03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        if(N%2==0 && N < 10) {
            System.out.println("Não é estranho ");
        } else if(N%2==0 && (N>10 && N<20)) {
            System.out.println("Estranho");
        } else if(N%2==0 && N>20) {
            System.out.println("Não é estranho ");
        }else {
            System.out.println("Estranho ");
        }

        scan.close();
    }
}
