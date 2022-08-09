package ExerciciosAula02;

import java.util.Scanner;

/* Faça um programa que calcule as raizes de uma equação do segundo grau, na forma
ax2 + bx + c. O programa devera pedir os valores de a, b e c, e fazer as consistências,
informando ao usuario nas seguintes situações:
. Se o usuario informar um valor de A igual a 0, a equação não é de segundo grau e o
programa não deve pedir os demais valores, sendo encerrado.
.Se o delta calculado for negativo, a equação não possui raízes reais. Informe ao usuario
e encerre o programa.
.Se o delta for positivo, a equação possui duas raízes reais; informe-as ao usuario.

 */
public class Raizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o valor de a: ");
        int a = sc.nextInt();
        if ( a == 0) {
            System.out.println("Não é equação de segundo grau. Informe um valor válido.");
        } else {
            System.out.println("Entre com o valor de b: ");
            int b = sc.nextInt();
            System.out.println("Entre com o valor de c: ");
            int c = sc.nextInt();

            double delta = (b * b) - (4 * a * c);
            if (delta < 0) {
                System.out.println("Delta negativo.A equação não possui raízes reais.");
            } else {
                System.out.println("delta: " + delta);

                double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
                double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);

                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);

            }

        }

    }
}
