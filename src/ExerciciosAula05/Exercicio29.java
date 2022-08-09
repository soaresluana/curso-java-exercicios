package ExerciciosAula05;
/* Ler um vetor A com 20 elementos. Construir dois vettores B e C, sendo que nos
vetores B e C serão armazenados os valores pares e ímpares de A.

 */
import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length]; // pares
        int[] vetorC = new int[vetorA.length]; // impares


        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor do vetor na posição " + (i+1));
            vetorA[i] = scan.nextInt();
        }

        int posB = 0, posC = 0, totPares = 0, totImpares = 0;

        for (int i = 0; i < vetorA.length; i++) {

            if (vetorA[i] % 2 == 0) {
                totPares++;
                vetorB[posB] = vetorA[i];
                posB++;
            } else {
                totImpares++;
                vetorC[posC] = vetorA[i];
                posC++;
            }
        }
        System.out.println();

        System.out.print("VETOR A = " );
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println(" ");

        System.out.print("VETOR B = " );
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println(" ");
        System.out.print("VETOR C = " );
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }
        System.out.println(" ");

        System.out.println("Total de numeros pares : " + totPares);
        System.out.println("Total de numeros ímpares : " + totImpares);

    }
}
