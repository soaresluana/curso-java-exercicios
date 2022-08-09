package ExerciciosAula03;

import java.util.Scanner;

/* Faça um programa que leia 5 nuemros e informe o maior numero.
 */
public class MaiorNumero {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {

            System.out.println("Digite um numero: ");
            num = scan.nextInt();

            if ( num > maior) {
                maior = num;
            }
        }
        System.out.println("O maior numero digitado foi " + maior);
    }
}
