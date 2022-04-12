package Exercicio1005;
import java.util.Scanner;
import java.io.IOException;
import java.text.DecimalFormat;

public class Main{
    public static void main (String [] args)throws IOException {
        Scanner s = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.00000");
        
        double A = s.nextDouble();
        double B = s.nextDouble();

        double peso = A*3.5 + B*7.5;

        double media = peso / 11;


        System.out.println ("MEDIA = " + df.format(media));

    }
};