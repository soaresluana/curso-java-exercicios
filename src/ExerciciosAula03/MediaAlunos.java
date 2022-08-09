package ExerciciosAula03;

import java.util.Scanner;

// Media de alunos por turma
public class MediaAlunos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantidade de turmas: ");
        int qtdTurmas = scan.nextInt();

        int soma = 0;
        int qtdAlunos = 0;
        boolean invalido = true;

        for (int i = 1; i <=qtdTurmas; i ++) {

            invalido = true;
            do {
                System.out.println("Quantidade de alunos da turma " + i + ":");
                qtdAlunos = scan.nextInt();

                if (qtdAlunos  <= 40) {
                    invalido = false;
                } else {
                    System.out.println("Informação inválida.Máximo de 40 alunos por turma.Digite novamente.");
                }
            } while (!invalido);
            soma += qtdAlunos;
        }
        double media = soma / qtdTurmas;

        System.out.println("Soma total de alunos: " + soma);
        System.out.println("Média de alunos por turma: " + media);
    }
}
