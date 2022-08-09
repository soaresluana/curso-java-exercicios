package ExerciciosAula01;

import java.util.Scanner;

public class ExercicioNumeros {
    /* Faça um programa que peça 2 numeros inteiros e um real.Calcule e mostre:
    a. O produto do dobro do primeiro  com a metade do segundo.
    b. A soma do triplo do primeiro com o terceiro.
    c. O terceiro elevado ao cubo
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe dois numeros inteiros, e um real: ");
        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();
        double numero3 = scan.nextDouble();

        int produto = (numero1 * 2) + (numero2/2);
        System.out.println("Resultado: o produto do dobro do primeiro numero com a metade do segundo é igual: " + produto);

        double soma = (numero1 * 3) + numero3;
        System.out.println("A soma do triplo do primeiro numero com o terceiro é " + soma);

        double elevadoCubo = (double) Math.pow(numero3, 3);
        System.out.println("O terceiro numero elevado ao cubo: " + elevadoCubo);

    }
}
