package challenges;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise06 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> palavras = new ArrayList<String>();

        while(scanner.hasNext())
        {
            palavras.add(scanner.next());
        }

        //Coloque seu código aqui
        int  i = 0;
        for (String contato: palavras) {
            System.out.printf(" %s\n", contato);
            i++;
        }
        scanner.close();
    }

}
