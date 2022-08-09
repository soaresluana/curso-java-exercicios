package ExerciciosAula02;

import java.util.Scanner;

/* Faça um Programa para a leitura de duas notas parciais de um aluno.
O programa deve calcular a média alcançada por aluno e apresentar:
-> A mensagem "APROVADO", se a média alcançada for maior ou igual a 7;
-> A mensagem "REPROVADO", se a média for menor que 7
-> A mensagem "APROVADO COM DISTINÇÃO", se a média for igual a 10.
 */
public class MediaAluno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;
        System.out.println("Sua média foi: " + media);
        if (media >= 7 && media <= 9) {
            System.out.println("RESULTADO: APROVADO.");
        } else if (media < 7) {
            System.out.println("RESULTADO: REPROVADO.");
            }else if (media == 10) {
            System.out.println("RESULTADO: APROVADO COM DISTINÇÃO.");
        }
    }
}
