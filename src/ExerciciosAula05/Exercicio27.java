package ExerciciosAula05;
/* Ler um vetor A com elementos do tipo inteiro. Construir um  vetor B de mesmo
tipo e tamanho, que seja palindromo de A, ou seja, o primeiro elemento de A passa a
ser o ultimo de B, o segundo o penultimo de B, e assim por diante.
*/
import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {

            System.out.println("Digite o valor do vetor na posição" + (i +1));
            vetorA[i] = scan.nextInt();

            vetorB[vetorA.length - i - 1] = vetorA[i];
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
    }
}
