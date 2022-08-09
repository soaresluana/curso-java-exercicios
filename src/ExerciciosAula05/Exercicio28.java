package ExerciciosAula05;
/* Ler um vetor A e B, com 10 elementos cada. Construir um vetor C, que seja uma junção
dos dois outros vetores. Os primeiros 10 elementos de C devem ser os elementos de A e
os 10 ultimos os elementos de B. * C devera ter 20 elementos *
*/
import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length * 2];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor do vetor A na posição" + (i + 1));
            vetorA[i] = scan.nextInt();

            vetorC[i] = vetorA[i];
        }
        System.out.println();

        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Digite o valor do vetor B na posição" + (i + 1));
            vetorB[i] = scan.nextInt();

            vetorC[vetorA.length + i] = vetorB[i];
        }
        System.out.println();


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

        System.out.print("VETOR C = ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }
    }
}
