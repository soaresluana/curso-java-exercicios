package ExerciciosAula05;

import java.util.Scanner;

/* Criar um vetor A com 5 elementos inteiros.Construir um vetor B de
mesmo tipo e tamnaho e com os "mesmos" elementos do vetor A, ou seja,
B[i] = A[i].
 */
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        for (int i = 0; i < vetorA.length; i++ ) {
            System.out.println("Entre com o valor da posição: " + i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i];

        }
        /*for (int i =0; i < vetorA.length; i++) {
          *  vetorB[i] = vetorA[i];
        } */

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println(" ");

        System.out.print("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
    }
}
