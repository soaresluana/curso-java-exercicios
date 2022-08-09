package ExerciciosAula02;

import java.util.Scanner;

/* Faça um Programa que peça um valor e mostre na tela se o valor é
positivo ou negativo.
 */
public class PositivoOuNegativo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        int numero = scan.nextInt();
        if (numero > 0 ) {
            System.out.println("O número é positivo.");
        } else {
            System.out.println("O numero é negativo.");
        }

    }
}
