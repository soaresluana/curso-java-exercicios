package ExerciciosAula01;

import java.util.Scanner;

public class ExerciciosConversao {
    public static void main(String[] args) {

        //Faça um programa que converta metro para centímetro

        Scanner scan = new Scanner(System.in);
        System.out.println("Quantidade de metros: ");
        double metros = scan.nextInt();
        double centimetro;
        centimetro = metros * 100;
        System.out.println("Centimetros: " + centimetro);

        /* kilometro = metros / 1000;
           milimetro = metros * 1000;
           System.out.println("Kilômetro: " + kilometro);
           System.out.pritln(" Milimetro: " + milimetro);
         */



    }
}
