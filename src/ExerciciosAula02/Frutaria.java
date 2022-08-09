package ExerciciosAula02;

import java.util.Scanner;

/* Uma frutaria esta vendendo frutas com a seguinte tabela de preços:
   - Morango:
    ate 5kg : R$2,50 por kg
    acima de 5 kg: R$2,20 por kg
   - Maçã:
   ate 5kg : R$1,80 por kg
   acima de 5 kg: R$1,50 por kg
   Se o cliente comprar mais de 8kg de frutas, ou o valor total da compra ultrapassar R$25,00, recebera ainda um desconto
   de 10% sobre este total. Escreva um algoritmo
   para ler a quantidade em kg de morangos e maçãs adquiridas e escreva o valor a ser pago pelo cliente.
 */
public class Frutaria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       System.out.println("Quantidade (kg) de morangos: ");
       double qtdMorango = scan.nextDouble();

        System.out.println("Quantidade (kg) de maçãs: ");
        double qtdMaca = scan.nextDouble();

        double precoKgMorango = 0;
        if (qtdMorango <= 5) {
            precoKgMorango = 2.5;
        } else {
            precoKgMorango = 2.2;
        }

        double precoKgMaca = 0;
        if (qtdMaca <= 5) {
            precoKgMaca = 1.8;
        } else {
            precoKgMaca = 1.5;
        }

        double precoTotalMorango = qtdMorango * precoKgMorango;
        double precoTotalMaca = qtdMaca * precoKgMaca;

        double precoParcial = precoKgMorango + precoKgMaca;
        double totalCompra = precoParcial;

        if ((qtdMorango + qtdMaca > 8 || precoParcial > 25)) {
            totalCompra = precoParcial - ((precoParcial / 100 ) * 10);
        }
        System.out.println("O total da compra foi " + totalCompra);






    }
}
