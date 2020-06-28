package challenges;
import java.util.Scanner;

public class Exercise01 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        String course = scan.nextLine();
        int num =  scan.nextInt();
        System.out.println(course+"\n"+num);
        scan.close();
    }
}
