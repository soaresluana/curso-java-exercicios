package ExerciciosAula05;
import java.util.Scanner;

/* Criar um vetor com 11 elementos, indexados de 0 até 10. Sendo que cada elemento do
 vetor é formado pela potência de base 2 elevado ao expoente igual a posição do respectivo
 elemento, ou seja: A[i] = 2 elevado a i.
*/
public class Exercicio35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] vetorA = new double[11];

        for (int i = 0; i < vetorA.length; i++) {

            vetorA[i] = Math.pow(2, i);
        }

        System.out.print("VETOR A = " );
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println(" ");
    }
}
