package Exercicio1001;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){

        try (Scanner keyboard = new Scanner(System.in)) {
            int a = keyboard.nextInt();
            int b = keyboard.nextInt();
            int X = a+b;
      System.out.println("Entre com 2 valores");
            System.out.println("X = "+X);
        }
    }
};
