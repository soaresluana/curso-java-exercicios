package ExerciciosAula02;

import java.util.Scanner;

/* O Hipermercado Tabajara esta com uma promoção de carnes.Confira:
   - File Duplo:
    ate 5kg : R$5,80 por Kg;
    acima de 5kg: R$4,90 por kg;
   - Alcatra:
   ate 5kg : R$6,80 por kg;
   acima de 5kg: R$5,90 por kg;
   - Picanha:
   ate 5kg: R$7,80 por kg;
   acima de 5kg: 6,90 por kg;
   Para atender todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção, porem não ha limites para a quantidade de carne
   por cliente. Se a compra for feita no Cartão Tabajara o cliente receberá ainda  um desconto de 5% sobre o total.Escreva um programa que peça o tipo e a quantidade
   de carne comprada pelo usuario e gere um cupom fiscal, contendo as informações
   da compra: tipo e quantidade de carne, preço total, tipo de pagamento, valor do  desconto e valor a pagar.
*/
public class PromocaoHipermercado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o tipo da carne: ");
        System.out.println(" 1- File duplo ");
        System.out.println(" 2- Alcatra ");
        System.out.println(" 3- Picanha ");
        int tipo = scan.nextInt();

        System.out.println(" Entre com a quantidade (Kg) ");
        double qtd = scan.nextDouble();

        double precoKg = 0;

        if (tipo == 1) {
            System.out.println(qtd + "kg - file duplo");
            if (qtd <= 5) {
                precoKg = 5.8;
            } else {
                precoKg = 4.9;
            }
        }
        if ( tipo == 2) {
            System.out.println(qtd + "kg - Alcatra");

            if (qtd <= 5) {
                precoKg = 6.8;
            } else{
                precoKg = 5.9;
            }
        }
        if ( tipo == 3) {
            System.out.println(qtd + "kg - Picanha");

            if (qtd <= 5) {
                precoKg = 7.8;
            } else {
                precoKg = 6.9;
            }
        }
        double total = qtd * precoKg;
        System.out.println(qtd + "kg * " + precoKg + " = " + total);

        System.out.println("Compra no cartão? Digite 1 para sim: ");
        int cartao = scan.nextInt();

        if (cartao == 1) {
            double desconto = (total / 100) * 5;
            System.out.println("Desconto de: " + desconto);
            System.out.println("Valor a pagar: " + (total - desconto));
        } else {
            System.out.println("Valor a pagar: " + total);

        }

    }
}
