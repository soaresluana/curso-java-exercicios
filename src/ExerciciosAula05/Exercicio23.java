package ExerciciosAula05;
/* Verificar se um dado vetor A de 10 elementos inteiros é um palíndromo, ou seja,  se o primeiro elemento
 do vetor é igual ao ultimo, se o segundo é igual ao penúltimo e assim por diante, até verificar todos os
 elementos ou chegar à conclusão que o vetor não é um palíndromo.

 */
import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {

            System.out.println("Entre com o numero na posição " + i);
            vetor[i] = scan.nextInt();
        }

        // 1221
        // i = 2
        boolean palindromo = true;
        for (int i = 0; i < (vetor.length / 2 ); i++) {

            if (vetor[i] != vetor[vetor.length - 1]) {
                palindromo = false;
                break;
            }
        }

        System.out.print("Vetor = ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        if (palindromo) {
            System.out.println("palindromo");
        } else {
            System.out.println("Não é palindromo.");
        }
    }
}
