package ExerciciosAula03;

import java.util.Scanner;

/* Faça um programa que peça dez numeros inteiros, calcule e mostre a quantidade de numeros pares e a
quantidade de numeros impares.
 */
public class ParesEImpares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a quantidade de numeros a serem listados: ");
        int cp = scan.nextInt();

        int totPar = 0, totImpar = 0;

        int num[] = new int[cp];

        for (int i = 0; i < num.length; i ++) {
            System.out.println("Digite o " + (i + 1) + "º numero: \n");
            num[i] = scan.nextInt();

            if (num[i] % 2 == 0) {
                System.out.println("Este numero é PAR.");
                totPar ++;
            } else {
                System.out.println("Este numero é IMPAR.");
                totImpar ++;
            }
        }
        System.out.println("Total de pares: " + totPar);
        System.out.println("Total de ímpares: " + totImpar);
    }
}

