package Exercicio1002;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static final DecimalFormat df = new DecimalFormat("0.0000");
    public static void main (String [] args){
        Scanner a = new Scanner (System.in);

        double raio = a.nextDouble();

        double area = 3.14159 * raio * raio;

        System.out.println("A=" + df.format(area));
    }
};

