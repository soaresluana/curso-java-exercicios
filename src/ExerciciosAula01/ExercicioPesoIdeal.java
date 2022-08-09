package ExerciciosAula01;

import java.util.Scanner;

public class ExercicioPesoIdeal {
    /* Tendo como entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal,
    usando a seguinte fórmula: (72.7 * altura) - 58.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual sua altura? ");
        float altura = scan.nextFloat();

        double pesoIdeal = (72.7 * altura) - 58;
        System.out.println("Seu peso ideal é: " + pesoIdeal);
    }

}
