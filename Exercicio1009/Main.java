package Exercicio1009;

import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Locale;


public class Main {
    public static void main (String [] args) throws IOException{

        Locale.setDefault(Locale.US); //Foi importado para conseguir efetuar a operação com Porcentagem que não conseguimos com BigDecimal
        Scanner s = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat(".00");

        String nome = s.next();
        double salario = s.nextDouble();
        double vendas = s.nextDouble();

       
        double comissao = vendas * 0.15;
        double total = comissao + salario;

        System.out.println("TOTAL = R$ " + df.format(total));
        
       
    }
}
