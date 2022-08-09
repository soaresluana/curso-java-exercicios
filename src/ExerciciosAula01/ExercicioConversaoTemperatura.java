package ExerciciosAula01;

import java.util.Scanner;

public class ExercicioConversaoTemperatura {
    /*Faça um programa que peça a temperatura em graus Farenheit, transforme e mostre
    a temperatura em graus celsius e vice versa.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual a temperatura em Farenheit? ");
        float F = scan.nextFloat();
        float C = (float) ((F -32)/1.8);
        System.out.println("No Brasil estaria " + C + "graus");

        System.out.println(" ");

        System.out.println("Qual a temperatura em graus Celsius? ");
        float Celsius = scan.nextFloat();
        float Fahrenheit = (float) ((Celsius * 1.8) + 32);
        System.out.println("A temperatura em Fahrenheit seria " + Fahrenheit);
    }
}
