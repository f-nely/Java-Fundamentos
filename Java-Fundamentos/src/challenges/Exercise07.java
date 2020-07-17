package challenges;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {

         Scanner scann = new Scanner(System.in);
        int t=scann.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x = scann.nextLong();

                System.out.println(x+" pode ser armazenado nos tipos:");

                //put code here
                long n = scann.nextLong();
                if(x>=-128 && x<=127)
                    System.out.println("* byte");
                if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE)
                    System.out.println("* short");
                if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)
                    System.out.println("* int");
                if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE)
                    System.out.println("* long");

                 }
            catch(Exception e)
            {
                System.out.println(scann.next()+" não pode ser armazenado em nenhum tipo numérico inteiro.");
            }

        }
    }
}



