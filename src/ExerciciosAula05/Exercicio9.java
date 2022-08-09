package ExerciciosAula05;

import java.text.DecimalFormat;
import java.util.Scanner;

// C[i] = A[i] / float(B[i])
public class Exercicio9 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        double[] vetorC = new double[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Valor do vetor A na posiçao " + (i+1));
            vetorA[i] = scan.nextInt();
        }
        for (int i = 0; i< vetorB.length; i++) {
            System.out.println("Valor do vetor B na posição" + (i+1));
            vetorB[i] = scan.nextInt();
        }
        for (int i = 0; i < vetorC.length; i ++) {
            vetorC[i] =  vetorA[i] /vetorB[i];
        }
        System.out.println(" ");

        System.out.print("VETOR A = ");
        for(int i =0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println(" ");

        System.out.print("VETOR B = ");
        for(int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println(" ");

        DecimalFormat df = new DecimalFormat("###,###.##");

        System.out.print("VETOR C = ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }
    }
}
