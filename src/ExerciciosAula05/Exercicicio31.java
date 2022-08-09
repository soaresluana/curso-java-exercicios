package ExerciciosAula05;
/* Crie um vetor A com 5 elementos inteiros. Escreva um programa que imprima a tabuada
de cada um dos elementos do vetor A.
*/
import java.util.Scanner;

public class Exercicicio31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];

        for(int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor do vetor na posição " + (i+1));
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i< vetorA.length; i++) {
            System.out.println("Tabuada de " + vetorA[i]);

            for (int j = 0; j <= 10; j++) {
                System.out.println((j + " * " + vetorA[i] + " = " + (vetorA[i] * j)));
            }
            System.out.println();
        }
    }
}
