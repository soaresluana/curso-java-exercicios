package ExerciciosAula05;

import java.util.Scanner;

/* Criar um vetor com 10 elementos do tipo inteiro, escrever um programa que imprima
cada elemento, e a relação de todos os divisores do respectivo elemento.
 */
public class Exercicio34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Valor do vetor na posição " + (i+ 1));
            vetorA[i] = scan.nextInt();
        }
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Analizando o numero" + vetorA[i]);

            for (int j = 1; j < vetorA[i]; j++) {
                if (vetorA[i] % j == 0) {
                    System.out.println(j + " é divisor");
                }
            }
            System.out.println();
        }
    }
}
