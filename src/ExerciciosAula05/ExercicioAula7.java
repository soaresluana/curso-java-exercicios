package ExerciciosAula05;

import java.util.Random;

/* Criar dois vetores, A e B, cada um com dez elementos inteiros. Construir
um vetor C, onde cada elemento de C é a subtração dos respectivos elementos
em A e B, ou seja: C[i] = A[i] - B[i]

 */
public class ExercicioAula7 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] vetorX = new int[10];
        int[] vetorY = new int[10];
        int[] vetorZ = new int[10];

        for (int i = 0; i < vetorX.length; i++) {
            int max =50;
            int min =5;
            vetorX[i] = random.nextInt((max - min) + 1) + min;
            vetorY[i] = random.nextInt(20);

            vetorZ[i] = vetorX[i] - vetorY[i];
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
        System.out.println(" ");

        System.out.print("VETOR Z = ");
        for (int i = 0; i < vetorZ.length; i++ ) {
            System.out.print(vetorZ[i] + " ");
        }
    }
}
