package ExerciciosAula03;

import java.util.Scanner;

/* O cardapio de uma lanchonete é o seguinte:
 -Especificação    Código  Preço
 -Cachorro quente   100    R$1,20
 -Bauru simples     101    R$1,50
 -Bauru com ovo     102    R$1,50
 -Hamburguer        103    R$1,20
 -Chesseburguer     104    R$1,30
 -Refrigerante      105    R$1,00

 Faça um programa que leia o código dos itens pedidos e as quantidades desejadas.Calcule e mostre
 o valor a ser pago por item (preço * quantidade) e o  total geral do pedido.Considere que o cliente
 deve informar quando o pedido deve ser encerrado.
 */
public class Cardapio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean naoTerminar = true;
        int qtd;
        int cod;
        double total = 0;
        String output = "";

        do {
            System.out.println("Digite o código e a quantidade. Digite 0 0 para sair.");
            cod = scan.nextInt();
            qtd = scan.nextInt();

            if (cod == 0 && qtd == 0) {
                naoTerminar = false;
                output += "Total a pagar = R$" + total;
            } else {
                if (cod == 100) {
                    output += "Cachorro Quente -> R$ 1,20 * " + qtd;
                    output += " = " + (1.2 * qtd) + "\n";
                    total += (1.2 * qtd);
                } else if ( cod == 101) {
                    output += "Bauru Simples -> R$ R$ 1,50 * " + qtd;
                    output += " = " + (1.5 * qtd) + "\n";
                    total += (1.5 * qtd);
                } else if (cod == 102) {
                    output += "Bauru com ovo -> R$ 1,50 * " + qtd;
                    output += " = " + (1.5 * qtd) + "\n";
                    total += (1.5 * qtd);
                } else if (cod == 103) {
                    output += "Hamburguer -> R$ 1,20 * " + qtd;
                    output += " = " + (1.2 * qtd) + "\n";
                    total += (1.2 * qtd);
                } else if (cod == 104) {
                    output += "Cheeseburguer -> R$ 1,30 * " + qtd;
                    output += " = " + (1.3 * qtd) + "\n";
                    total += (1.3 * qtd);
                } else if (cod == 105) {
                    output += "Refrigerante -> R$ 1,00 * " + qtd;
                    output += " = " + (1.0 * qtd) + "\n";
                    total += (1.0 * qtd);
                }
            }
        } while(naoTerminar);

         System.out.println("Quantidade de itens : " + qtd);
        System.out.println(output);


    }
}
