package ExerciciosAula03;

import java.util.Scanner;

public class SomaMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        int soma = 0;
        double media = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero: ");
            num = scan.nextInt();
            soma += num;
        }

        System.out.println("Soma: " + soma);
        media = soma / 5;
        System.out.println("Média: " + media);


    }
    }

