package Exercicio1012;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws IOException {
        Scanner s = new Scanner(System.in); 

            double PI = 3.14159;
            double A = s.nextDouble();
            double B = s.nextDouble();
            double C = s.nextDouble();

            double triangulo= (A * C) / 2;
            double circulo= PI * (C * C);
            double trapezio= (A + B) / 2 *  C;
            double quadrado= (B * B);
            double retangulo= (A * B);
            

        System.out.println(String.format("TRIANGULO: %.3f", triangulo));
        System.out.println(String.format("CIRCULO: %.3f", circulo));
        System.out.println(String.format("TRAPEZIO: %.3f", trapezio));
        System.out.println(String.format("QUADRADO: %.3f", quadrado));
        System.out.println(String.format("RETANGULO: %.3f", retangulo));  
        
    }
}