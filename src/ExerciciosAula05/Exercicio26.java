package ExerciciosAula05;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor1 = new int[10];
        char[] vetor2 = new char[vetor1.length];

        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Digite o valor do vetor na posição " + (i+1));
            vetor1[i] = sc.nextInt();

            if (vetor1[i] < 7) {
                vetor2[i] ='a';
            } else if (vetor1[i] == 7) {
                vetor2[i] ='b';
            } else if (vetor1[i] > 7 && vetor1[i] < 10) {
                vetor2[i] ='c';
            } else if (vetor1[i] == 10) {
                vetor2[i] ='d';
            } else if (vetor1[i] > 10) {
                vetor2[i] ='e';
            }
        }
        System.out.println();

        System.out.print("VETOR 1 = ");
        for (int i = 0; i< vetor1.length; i++) {
            System.out.print(vetor1[i] + " ");
        }
        System.out.println();

        System.out.print("VETOR 2 = ");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print(vetor2[i] + " ");
        }
    }
}
