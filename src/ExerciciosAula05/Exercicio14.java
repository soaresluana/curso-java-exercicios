package ExerciciosAula05;
// vetor com 10 elementos; exibir a média dos elementos ímpares.
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor do vetor na posição " + (i+1));
            vetor[i] = scan.nextInt();
        }

        int soma = 0;
        int impares = 0;
            for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 != 0) {
                soma += vetor[i];
                impares ++;
            }
        }

        System.out.println();

        System.out.print("VETOR = ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println();
        System.out.println("Valores ímpares: " + impares);
        System.out.println("Soma valores impares: " + soma);
        System.out.println("Média dos valores ímpares: " + (soma/impares));
    }
}
