package ExerciciosAula03;
/* Faça um programa que peça dois numeros, base e expoente, calcule e e mostre
o primeiro elevado ao segundo numero.Não utilize a função de potencia da linguagem.
*/

import java.util.Scanner;

public class NumeroElevado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero (base): ");
        int base = scan.nextInt();

        System.out.println("Digite o segundo numero (expoente): ");
        int pot = scan.nextInt();

        // 2 ^ 2 = 2 * 2
        // 2 ^3 = 2 * 2 * 2
        int resultado = base;

        for (int i = 1; i < pot; i++) {
            resultado *= base;
        }
        System.out.println("Resultado: " + resultado);

    }
}
