package ExerciciosAula05;

import java.util.Scanner;

/*Criar um vetor A com 15 elementos inteiros.Construir um vetor B de mesmo
tamanho, sendo que cada elemento do Vetor B deverá ser a raiz quadrada do
respectivo elemento de A, ou seja:
B[i] = sqrt(A[i])
 */
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorX = new int[15];
        int[] vetorY = new int[15];

        for (int i = 0; i < vetorX.length; i ++) {
            System.out.println("Digite o valor da posição " + (i+1));
            vetorX[i] = scan.nextInt();

            vetorY[i] = vetorX[i] * vetorX[i];
        }
        System.out.println(" ");

        System.out.print("VETOR X = ");
        for (int i = 0; i < vetorX.length; i++) {
            System.out.print(vetorX[i] + " ");
        }
        System.out.println(" ");

        System.out.print("VETOR Y = ");
        for (int i = 0; i < vetorY.length; i++) {
            System.out.print(vetorY[i] + " ");
        }

    }
}
