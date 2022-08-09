package ExerciciosAula05;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorB = new int[10];

        for (int i = 0; i < vetorB.length; i++) {
            System.out.print("Entre com o valor da posição " + (i +1) + ": ");
            vetorB[i] = scan.nextInt();
        }
        int soma = 0;
        for (int i = 0; i < vetorB.length; i++) {
            soma += vetorB[i];
        }

        System.out.print("Vetor B = ");
            for (int i = 0; i < vetorB.length; i++) {
                System.out.print(vetorB[i] + " ");
            }
        System.out.println();
        System.out.println("SOMA: " + soma);
    }
}
