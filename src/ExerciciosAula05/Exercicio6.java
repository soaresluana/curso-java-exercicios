package ExerciciosAula05;
/* Criar dois vetores, A e B, cada um com 10 elementos inteiros.
Construir um vetor C, onde cada elemento de C é a soma dos respectivos
elementos em A e B, ou seja: C[i] = A[i] + B[i].
 */
import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = random.nextInt(30);
            vetorB[i] = random.nextInt(30);

            vetorC[i] = vetorA[i] + vetorB[i];
        }
        System.out.println(" ");

        System.out.print("VETOR A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println(" ");

        System.out.print("Vetor B = ");
        for (int i = 0; i < vetorB.length; i ++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println(" ");

        System.out.print("Vetor C = ");
        for (int i = 0; i < vetorC.length; i ++) {
            System.out.print(vetorC[i] + " ");
        }
    }
}
