package ExerciciosAula03;
/* Faça um programa que peça para  n pessoas a sua idade, ao final o programa devera verificar
se a média de idade da turma varia entre 0 e 25, 26 e 60 e maior que 60; e entao dizer se a
turma é jovem, adulta ou idosa, conforme a media calculada.
 */

import java.util.Scanner;

public class MediaIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o numero de idades: ");
        int qtdIdades = scan.nextInt();

        int soma = 0;
        double media;
        int idade;

        for (int i = 1; i <= qtdIdades; i ++) {
            System.out.println("Digite a " + i + "ª idade: ");
            idade = scan.nextInt();

            soma += idade;
        }
        media = soma / qtdIdades;

        System.out.println("Soma de todas as idades: " + soma);
        System.out.println("Média de idade : " + media);

        if (media >= 0 && media <=25) {
            System.out.println("Turma: Grupo Jovem ");
        } else if (media >=26 && media <= 60) {
            System.out.println("Turma: Grupo Adulto");
        } else {
            System.out.println("Turma: Grupo Terceira Idade");

        }
    }
}
