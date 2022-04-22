package Exercicio1010;

import java.util.Scanner;
import java.io.IOException;
import java.text.DecimalFormat;


public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat(".00");

        int cod1 = s.nextInt();
        int quantidade1 = s.nextInt();
        double valor1 = s.nextDouble();


        int cod2 = s.nextInt();
        int quantidade2 = s.nextInt();
        double valor2 = s.nextDouble();
        
        s.close();

        double total = quantidade1 * valor1 + quantidade2 * valor2;

      

        System.out.println("VALOR A PAGAR : R$" + df.format(total));
    }
}