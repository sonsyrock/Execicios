package Exercicio1004;

import java.util.Scanner;
import java.io.IOException;

public class Main{

    public static void main (String [] args ) throws IOException{
        Scanner s = new Scanner (System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        int PROD = a*b;
        
        System.out.println("PROD = " + PROD);
    }

};