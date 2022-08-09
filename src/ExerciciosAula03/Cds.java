package ExerciciosAula03;

import java.util.Scanner;

/* Faça um programa que calcule o valor total investido por um colecionador
em sua coleção de CDs e o valor médio gasto em cada um.O usuario devera informar
a quantidade de CDs e o valor pago em cad um.
 */
public class Cds {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de CDs da coleção: ");
        int qtdCds = scan.nextInt();

        double preco;
        int soma = 0;

        for (int i = 1; i< qtdCds; i++ ) {
            System.out.println("Digite o valor do " + i + "º CD: ");
            preco = scan.nextDouble();
            soma += preco;
        }
        double media = soma / qtdCds;

        System.out.println("Soma total do preço dos CDs: " + soma);
        System.out.println("Média de preço dos Cds: " + media);

    }
}
