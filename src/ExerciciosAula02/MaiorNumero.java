package ExerciciosAula02;

import java.util.Scanner;

// Faça um programa que peça dois números e imprima o maior deles.
public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe dois números: ");
        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();
        int maiorNumero;
        if (numero1 > numero2) {
            maiorNumero = numero1;
            System.out.println("O maior numero é " + maiorNumero);
        } else {
            maiorNumero = numero2;
            System.out.println("O maior numero é " + maiorNumero);
        }

    }
}
