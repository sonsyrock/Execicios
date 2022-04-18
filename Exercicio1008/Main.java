package Exercicio1008;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(".00");
        int NUMBER = s.nextInt();
        int SALARY = s.nextInt();
        float horas = s.nextFloat();

        float valor = horas * SALARY;
        

        System.out.println("NUMBER = " + NUMBER + "\nSALARY = U$ " + df.format(valor));
    
    }
 
}


