package Exercicio1011;

import java.util.Scanner;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args)throws IOException {
        Scanner s = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        DecimalFormat df = new DecimalFormat(".000");

        

        double R = s.nextDouble();

        double pi = 3.14159;
        
        double total = (4.0/3) * pi * Math.pow(R,3);

        System.out.println("VOLUME = " + df.format(total));
    }
}