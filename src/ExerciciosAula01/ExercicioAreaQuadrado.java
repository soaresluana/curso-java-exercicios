package ExerciciosAula01;

import java.util.Scanner;

public class ExercicioAreaQuadrado {
    public static void main(String[] args) {
        /* Faça um programa que calcule a área de umm quadrado, em seguida
        mostre o dobro desta area para o usuario.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a medida do comprimento do quadrado: ");
        int comprimento = scan.nextInt();
        System.out.println("Digite a medida da largura do quadrado: ");
        int largura = scan.nextInt();

        double area = comprimento * largura;
        System.out.println("A area do quadrado corresponde a " + area * 2);
    }
}
