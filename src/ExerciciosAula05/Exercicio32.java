package ExerciciosAula05;
/*
Criar um vetor A do tipo inteiro, imprimir cada um dos elementos, verificar
e imprimir se são primos ou não.
 */
import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Valor do vetor na posição " + (i+ 1));
            vetorA[i] = scan.nextInt();
        }
        boolean primo;
        String msg = "";


        for (int i = 0; i < vetorA.length; i++) {
            primo = true;
            for (int j = 2; j < vetorA[i]; j++) {
                if (vetorA[i] % j == 0) {
                    primo = false;
                    break;
                }
            }

            msg = "";
            if(primo) {
                msg = " é primo!";
            } else {
                msg = " não é primo!";
            }
            System.out.println(vetorA[i] + msg);
        }
    }
}
