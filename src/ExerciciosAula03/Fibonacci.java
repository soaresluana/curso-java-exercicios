package ExerciciosAula03;

import java.util.Scanner;

/* A serie de Fibonacci é formada pela sequencia 1,1,2,,3,5,8,13,21,34,55.. Faça um programa
   capaz de gerar a serie ate o n-esimo termo.

 */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o n-ésimo termo da serie de fibonacci: ");
        int n = scan.nextInt();

        int primeiro = 1;
        int segundo = 1;
        int proximo;

        System.out.println(primeiro);
        System.out.println(segundo);

        /* 1,1,2,3,5
        primeiro = 1;
        segundo = 2;
        proximo = 3;
         */
        for (int i = 3; i <= n ; i++) {
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;

            System.out.println(proximo);
        }
    }
}
