package ExerciciosAula02;

import java.util.Scanner;

//Faça um programa que leia três numeros e mostre o maior deles.
public class MaiorNumero2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite três numeros: ");
        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();
        int numero3 = scan.nextInt();
        int maiorNumero;

        if (numero1 > numero2 && numero1 > numero3) {
            maiorNumero = numero1;
            System.out.println("O maior numero é o primeiro: " + maiorNumero);
        } else if (numero2 > numero1 && numero2 > numero3) {
            maiorNumero = numero2;
            System.out.println("O maior numero é o segundo: " + maiorNumero);
        } else {
            maiorNumero = numero3;
            System.out.println("O maior numero é o terceiro: " + maiorNumero);
        }

    }
}
