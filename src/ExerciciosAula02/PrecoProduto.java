package ExerciciosAula02;

import java.util.Scanner;

/* Faça um programa que pergunte o preço de trẽs produtos e informe qual produto você
deve comprar, sabendo que a decisão é sempre pelo mais barato.
 */
public class PrecoProduto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o preço dos trẽs produtos: ");
        double caneta1 = scan.nextDouble();
        double caneta2 = scan.nextDouble();
        double caneta3 = scan.nextDouble();

        double maisBarato;
        if (caneta1 < caneta2 && caneta1 < caneta3) {
            maisBarato = caneta1;
            System.out.println("Vou levar a que está mais em conta! Essa de " + "R$" +caneta1);
        } else if (caneta2 < caneta1 && caneta2 < caneta3) {
            maisBarato = caneta2;
            System.out.println("Vou levar a que está mais em conta! essa de " + "R$" +caneta2);
        } else {
            maisBarato = caneta3;
            System.out.println("Vou levar a que está mais em conta! Essa de " + "R$" +caneta3);

        }


    }

}
