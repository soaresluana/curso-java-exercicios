package ExerciciosAula03;

import java.util.Scanner;

/* Faça um programa que receba dois numeros inteiros e gere os numeros
inteiros que estão no intervalo compreendido entre eles.

 */
public class IntervaloEntreNumeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;

        System.out.println("Digite o primeiro numero: ");
        int num1 = scan.nextInt();

        System.out.println("Digite o segundo numero: ");
        int num2 = scan.nextInt();

        int soma = 0;

        for (int i = num1; i <= num2; i++) {
            System.out.println(i);
            soma += i;
        }
        System.out.println("Soma: " + soma);

    }
}
