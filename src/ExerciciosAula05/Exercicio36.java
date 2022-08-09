package ExerciciosAula05;

import java.util.Scanner;

/* Criar um vetor A com 15 elementos do tipo inteiro.Construir um vetor B
de mesmo tamanho, sendo que cada elemento do vetor B seja o fatorial do
elemento correspondente em A.
 */
public class Exercicio36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {

            System.out.println("Valor do vetor na posição " + (i+ 1));
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {

            vetorB[i] = 1; // opcional
            for (int j = 1; j <= vetorA[i]; j++) {
                vetorB[i] *= j;
            }
        }

        System.out.print("VETOR A = ");
        for (int i = 0; i< vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("VETOR B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
    }
}
