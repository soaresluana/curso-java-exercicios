package ExerciciosAula05;
/* Ler 2 notas bimestrais de 10 alunos. Armazenar em vetores (Nota1, Nota2 : Real),
Calcular a média aritmética simples das notas informadas armazenando o resultado em
um vetor "Result", mesmo tipo e tamanho. Exibir ao final a situação de cada aluno
(aprovado/reprovado). Aprovado - media >=7.

 */
import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] notas1 = new double[10];
        double[] notas2 = new double[notas1.length];
        double[] resultado = new double[notas1.length];

        for (int i = 0; i< notas1.length; i++) {
            System.out.println("Entre com a nota 1 do aluno: " + (i+1));
            notas1[i] = scan.nextDouble();

            System.out.println("Entre com a nota 2 do aluno: " + (i+1));
            notas2[i] = scan.nextDouble();

            resultado[i] = (notas1[i] + notas2[i]) / 2;
        }
        System.out.println();

        System.out.print("Notas 1 = ");
        for (int i = 0; i< notas1.length; i++) {
            System.out.print(notas1[i] + " ");
        }
        System.out.println();

        System.out.print("Notas 2 = ");
        for (int i = 0; i< notas2.length; i++) {
            System.out.print(notas2[i] + " ");
        }
        System.out.println();

        System.out.println("Resultado = ");
        for (int i = 0; i< resultado.length; i++) {

            if (resultado[i] >= 7) {
                System.out.println(resultado[i] + " - APROVADO");
            } else {
                System.out.println(resultado[i] + " - REPROVADO");
            }
        }
    }
}
