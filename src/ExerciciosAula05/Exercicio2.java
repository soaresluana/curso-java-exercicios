package ExerciciosAula05;
/* Criar um vetor A com 8 elementos inteiros.Construir um vetor B de mesmo tipo
e tamanho e com os elementos do vetor A multiplicados por 2, ou seja: B[i] = A[i] * 2
*/

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorC = new int[8];
        int[] vetorD = new int[8];

        for (int i = 0; i < vetorC.length; i++) {
            System.out.println("Digite o valor da posição " + i );
            vetorC[i] = scan.nextInt();

            vetorD[i] = vetorC[i] * 2;
        }

        System.out.println(" ");
        System.out.print("Vetor C = ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }
        System.out.println(" ");

        System.out.print("Vetor D = ");
        for (int i = 0; i < vetorD.length; i++) {
            System.out.print(vetorD[i] + " ");
        }
    }
}
