package ExerciciosAula03;

import java.util.Scanner;

/*Faça um programa que calcule o fatorial de um numero inteiro
fornecido pelo usuario.Ex: 5! = 5.4.3.2.1 = 120
*/
public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        int f = 1;

        System.out.println(" -- FATORIAL --");
        System.out.println("Digite um numero: ");
        x = scan.nextInt();

        System.out.println(x + "! = ");
        for (int i = x; i > 0; i --) {
            f *= i;
            System.out.print(i + "x " );
        }
        System.out.println(" = " + f);
    }
}

