package ExerciciosAula05;
/*  Ler um vetor com 10 elementos inteiros correspondente ás idades de um
grupo de pessoas. Exibir a quantidade de pessoas com idade superior à 35.
*/
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorIdade = new int[10];

        for (int i = 0; i < vetorIdade.length; i++) {
            System.out.println("Idade cidadão nº " + (i+1));
            vetorIdade[i] = scan.nextInt();
        }

        int maior35 = 0;
        //int somaMaior35 = 0;

        for (int i = 0; i < vetorIdade.length; i++) {
            if (vetorIdade[i] > 35) {
                maior35++;
                //somaMaior35 += vetorIdade[i];
            }
        }
        System.out.println();

        System.out.print("VETOR IDADE = ");
        for(int i = 0; i < vetorIdade.length; i++) {
            System.out.print(vetorIdade[i] + " ");
        }
        System.out.println();
        System.out.println("Quantidade de pessoas com idade superior a 35: " + maior35);
        //System.out.println("Soma das idades superiores a 35: " + somaMaior35);
    }
}
