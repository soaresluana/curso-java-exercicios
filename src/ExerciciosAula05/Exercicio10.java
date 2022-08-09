package ExerciciosAula05;

import java.text.DecimalFormat;
import java.util.Scanner;

/* Criar um vetor A com 10 elementos inteiros, um vetor B de mesmo tipo e
tamanho, sendo que cada elemento do vetor B deverá ser o resto da divisão
do respectivo elemento de A por 2, ou seja: B[i] = A[i] % 2
 */
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA =  new int [10];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o valor da posiçao " + (i + 1) + ": ");
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i] % 2;
        }
        System.out.println(" ");
        System.out.print("VETOR A = ");
        for (int i = 0; i < vetorA.length; i ++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println(" ");
        System.out.print("VETOR B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
    }
}
