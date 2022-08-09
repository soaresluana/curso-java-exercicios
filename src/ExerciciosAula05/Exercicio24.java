package ExerciciosAula05;
/* Construir: Vetor A com 10 elementos inteiros, vetor B de mesmo tipo e tamanho,
 obedecendo as regras de formação:
 1. B[i] recebe 1 quando A for PAR;
 2. B[i] recebe 0 quando A for IMPAR.
*/
import java.util.Scanner;

public class Exercicio24 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int [10];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor do vetor na posição " + (i+1));
            vetorA[i] = scan.nextInt();

            if (vetorA[i] % 2 == 0) {
                vetorB[i] = 1;
            } else {
                vetorB[i] = 0;
            }
        }
        System.out.println();

        System.out.print("VETOR A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("VETOR B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
    }
}
