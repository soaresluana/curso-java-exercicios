package ExerciciosAula05;
import java.util.Scanner;

/* Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho,
sendo que cada elemento do vetor B deverá ser o quadrado do respectivo elemento de A, ou seja:
B[i] = A[i] * A[i].
*/
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[15];
        int[] vetorB = new int[15];

        for (int i = 0; i <vetorA.length; i++) {
            System.out.println("Digite o valor da posição: " + i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i] * vetorA[i];
        }
        System.out.print(" ");

        System.out.print("VETOR A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println(" ");

        System.out.print("VETOR B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
    }
}
