package Exercicio1003;
import java.io.IOException;
import java.util.Scanner;


public class Main {

public static void main (String [] args) throws IOException {
        Scanner a = new Scanner (System.in);
        int A = a.nextInt();
        int B = a.nextInt();

        int SOMA = A + B;
        System.out.println("SOMA = " + SOMA);
    }

}