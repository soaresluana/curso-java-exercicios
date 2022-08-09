package ExerciciosAula05;

import java.util.Scanner;
/* Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo
e tamanho, sendo que cada elemento do vetor B deverá ser o respectivo elemento de A
multiplicado por sua posição (ou indice), ou seja: B[i] = A[i] * i.
*/
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor da posição " + (i+1));
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i] * i;
        }
        System.out.println(" ");

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println(" ");

        System.out.print("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
    }
}
