package ExerciciosAula05;
/* Criar um VETOR A com 10 elementos. Verificar se todos são PARES. Se pelo menos um elemento
   não for par, o processo de repetição para percorrer os elementos deve ser encerrado.
*/
import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        int pares = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Valor do vetor na posição " + (i+1));
            vetorA[i] = scan.nextInt();

            if(vetorA[i] % 2 == 0) {
                pares++;
                System.out.println("Todos os elementos do VETOR A são PARES. ");
            } else if (vetorA[i] % 2 != 0 ) {
                break;
            }
        }
        System.out.println();
        System.out.print(" Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
    }
}
