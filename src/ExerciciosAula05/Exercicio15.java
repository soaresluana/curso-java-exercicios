package ExerciciosAula05;
// Vetor com 10 elementos; exibir o percentual de numeros pares e ímpares.
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor da posição " + (i+1));
            vetorA[i] = scan.nextInt();
        }

        int impar = 0;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 != 0) {
                impar++;
            }
        }

        int par = vetorA.length - impar;

        //vetorA.length - 100%
        // par
        // = x * vetorA.length == par * 100
        // = x == (par * 100) / vetorA.length

        double porcPar = (par * 100) / vetorA.length;
        double porcImpar = 100 - porcPar;

        System.out.print("vetor A = ");
        for (int i = 0; i < vetorA.length; i ++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Porcentagem de PARES: " + porcPar + "%");
        System.out.println("Porcentagem de ÍMPARES: " + porcImpar + "%");

    }
}
