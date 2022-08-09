package ExerciciosAula05;
/* Criar um Vetor A com 10 elementos inteiros. Calcular e exibir: Soma dos elementos inferiores
*  a 15; quantidade de elementos iguais a 15; média dos elementos superiores a 15.
 */
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];


        for (int i = 0; i < vetorA.length; i ++) {
            System.out.println("Informe o valor da posição " + (i + 1));
            vetorA[i] = scan.nextInt();
        }

        int somaMenor15 = 0;
        int somaMaior15 = 0;
        int qtdMaior15 = 0;
        int igual15 = 0;

        for(int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] == 15) {
                igual15++;
            } else if (vetorA[i] < 15) {
                somaMenor15 += vetorA[i];
            } else {
                qtdMaior15++;
                somaMaior15 += vetorA[i];
            }
        }
        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Número de elementos iguais a 15: " + igual15);
        System.out.println("Soma dos elementos menores que 15: " + somaMenor15);
        System.out.println("Numero de elementos iguais a 15: " + igual15);
        System.out.println("Média dos elementos superiores a 15: " + somaMaior15/qtdMaior15);
    }
}
