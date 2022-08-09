package ExerciciosAula05;
// vetor com 10 elementos; soma dos elementos que forem multiplos de 5.
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetor = new int[10];
        int multiplo = 0;
        int soma = 0;
        int i;

        for ( i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor do vetor na posição " + (i+1));
            vetor[i] = scan.nextInt();

            if(vetor[i] % 5 == 0) {
                multiplo += 1;
                soma = soma + vetor[i];
            }

        }

        System.out.println();

        System.out.print("VETOR = ");
        for ( i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        System.out.println("Multiplos de 5: " + multiplo );
        System.out.println("Soma dos elementos multiplos : " + soma);

    }
}
