package ExerciciosAula05;
/* Obter a cotação do Dólar(U$) em relação ao Real(R$), armazenar em um 'VETOR A' com
20 elementos as seguintes conversões: A[i] = cotçao do dolar * i, para todo i variando
de 1 a 20.
*/
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] vetorA = new double[20];
        double cotacao;

        System.out.println("Entre com a cotação do dólar: ");
        cotacao = scan.nextDouble();

        for(int i = 0; i < vetorA.length; i++) {
            vetorA[i] = cotacao * (i + 1);
        }

        DecimalFormat format = new DecimalFormat("###,##.#");
        System.out.print("Vetor A = ");
        for(int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
    }
}
