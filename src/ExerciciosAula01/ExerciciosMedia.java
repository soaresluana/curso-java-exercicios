package ExerciciosAula01;

import java.util.Scanner;

public class ExerciciosMedia {

    // Faça um programa que peça as 4 notas bimestrais e mostre a média
    public static void main(String[] args ) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite suas notas do bimestre: ");
        double nota1 = teclado.nextDouble();
        double nota2 = teclado.nextDouble();
        double nota3 = teclado.nextDouble();
        double nota4 = teclado.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) /4;
        System.out.println("Sua média bimestral foi " + media);
        if (media <= 6) {
            System.out.println("RESULTADO: REPROVADO");
        } else {
            System.out.println("RESULTADO: APROVADO");
        }


    }
}
