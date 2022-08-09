package ExerciciosAula03;

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o quantidade de notas: ");
        int qtdNotas = scan.nextInt();

        int soma = 0;
        int media;
        double nota;

        for (int i = 0; i < qtdNotas; i ++){
            System.out.println("Entre com a nota: " + (i +1));
            nota = scan.nextDouble();

            soma += nota;
        }
        media = soma / qtdNotas;
        System.out.println("Soma das notas: " + soma);
        System.out.println("Média: " + media);


    }
}
