package ExerciciosAula03;

import java.util.Scanner;

public class CaixaRegistradora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean sair = false;
        String continuarCompra;
        int qtdItens;
        double preco;
        double soma = 0;
        double pgt;
        double total;

        System.out.println("CONVENIENCIA TABAJARA\n");

        do {
            System.out.println("Deseja informar uma nova compra? S/N");
            continuarCompra = scan.next();
            if (continuarCompra.equalsIgnoreCase("s")) {
                System.out.println("Quantidade de itens: ");
                qtdItens = scan.nextInt();

                total = 0;
                for (int i = 1; i <=qtdItens; i++) {
                    System.out.println("Informe o preço do produto " + i);
                    preco = scan.nextDouble();
                    total += preco;
                    System.out.println("Produto " + i +": R$ " + preco + "\n");
                }

                System.out.println("Total: R$" + total);
                System.out.println("Valor pago: ");
                double pagamento = scan.nextDouble();

                System.out.println("Dinheiro: R$" + pagamento +"\n");

                double troco = total - pagamento;
                System.out.println("Troco: " + troco);

            } else {
                sair = true;
            }
        } while (!sair);
    }
}
