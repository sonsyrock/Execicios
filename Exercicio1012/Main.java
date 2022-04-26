package Exercicio1012;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws IOException {
        Locale.setDefault(Locale.US);
        try (Scanner s = new Scanner(System.in)) {
            DecimalFormat df = new DecimalFormat(".000");

            double PI = 3.14159;
            double A = s.nextDouble();
            double B = s.nextDouble();
            double C = s.nextDouble();

            double areaTrianguloRetangulo = (A*C)/2.0;
            double areaCirculo = PI * Math.pow(C,2);
            double areaTrapezio = ((A+B)*C)/2.0;
            double areaQuadrado = B*B;
            double areaRetangulo = A*B;
            

            System.out.println("TRIANGULO: " + df.format (areaTrianguloRetangulo));
            System.out.println("CIRCULO: " + df.format(areaCirculo));
            System.out.println("TRAPEZIO: " + df.format(areaTrapezio));
            System.out.println("QUADRADO: " + df.format(areaQuadrado));
            System.out.println("RETANGULO: " + df.format(areaRetangulo));
        }
    }
}
