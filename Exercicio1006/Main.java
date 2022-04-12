package Exercicio1006;

import java.util.Scanner;
import java.io.IOException;
import java.text.DecimalFormat;

public class Main {
    public static void main (String [] args) throws IOException {
        Scanner s = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.0");
        double A = s.nextDouble();
        double B = s.nextDouble();
        double C = s.nextDouble();

        double peso = A*2 + B*3 + C*5;


        System.out.println("MEDIA = " + df.format(peso / 10));
    };

};