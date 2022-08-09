package ExerciciosAula05;

import java.util.Scanner;
/* Criar um vetor A do tipo inteiro com 20 elementos. Criar um vetor B de mesmo tipo
que separe os pares e impares de A, respectivamente.
*/
public class Exercicio30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor do vetor na posição " + (i+1));
            vetorA[i] = scan.nextInt();
        }
        System.out.println();

        int posB = 0;

        for (int i = 0; i < vetorA.length; i++) {

            if (vetorA[i] % 2 == 0) {
                vetorB[posB] = vetorA[i];
                posB++;
            }

            if (vetorA[i] % 2 != 0) {
                vetorB[posB] = vetorA[i];
                posB++;
            }
        }

        System.out.println();

        System.out.print("VETOR A = ");
        for (int i = 0; i < vetorA.length; i ++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("VETOR B = ");
        for (int i = 0; i < vetorB.length; i ++) {
            System.out.print(vetorB[i] + " ");
        }

    }
}
