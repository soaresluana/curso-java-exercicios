package ExerciciosAula05;
/* -> Dois vetores A e B, com 10 elementos inteiros. Construir um Vetor C de mesmo tipo e
  tamanho, obedecendo as seguintes regras de formação:
  1. C[i] recebe 1 quando A > B;
  2. C[i] recebe 0 quando A == B;
  3. C[i] recebe - 1 quando A < B.
 */
import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor do vetor A na posição " + (i+1));
            vetorA[i] = scan.nextInt();
            System.out.println("Digite o valor do vetor B na posição " + (i+1));
            vetorB[i] = scan.nextInt();

            if (vetorA[i] > vetorB[i]) {
                vetorC[i] = 1;
            } else if (vetorA[i] == vetorB[i]) {
                vetorC[i] = 0;
            } else {
                vetorC[i] = -1;
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
        System.out.println();

        System.out.print("VETOR C = ");
        for (int i = 0; i < vetorC.length; i ++) {
            System.out.print(vetorC[i] + " ");
        }
    }
}
