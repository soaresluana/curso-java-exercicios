package ExerciciosAula01;

import java.util.Scanner;

public class ExerciciosAreaCirculo {
    public static void main(String[] args) {
        // Faça um programa que peça o raio de um círculo, calcule e mostre sua área

        Scanner scan = new Scanner(System.in);
        System.out.println("Raio do círculo:");
        double raio = scan.nextDouble();
        double area = Math.PI * raio * raio;
        //final double Pi = 3.1416;
        //double area = Pi * Math.pow(raio, raio);
        System.out.println("O valor da área é " + area);

    }
}
