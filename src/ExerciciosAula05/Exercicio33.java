package ExerciciosAula05;

import java.util.Scanner;
/*  Criar um vetor do tipo inteiro. Escrever um programa que imprima cada elemento,
 e a relação de todos os pares de 0 até o respectivo elemento.
*/
public class Exercicio33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Valor do vetor na posição " + (i+ 1));
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Analizando o numero" + vetorA[i]);

            for (int j = 2; j < vetorA[i]; j++) {
                if (j % 2 == 0) {
                    System.out.println(j + " é par");
                }
            }
            System.out.println();
        }
    }
}
