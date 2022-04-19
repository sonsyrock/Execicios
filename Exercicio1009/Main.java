package Exercicio1009;

import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;


public class Main {
    public static void main (String [] args) throws IOException{
        Scanner s = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat(".00");

        //String nome = s.next();
        double salario = s.nextDouble();
        double vendas = s.nextDouble();

        double total =  vendas * 15/100;

        System.out.println("TOTAL = " + total);

       
    }
}
