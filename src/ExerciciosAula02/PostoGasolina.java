package ExerciciosAula02;

import java.util.Scanner;

/* um posto esta vendendo combustiveis com a seguinte tabela de descontos:
   - Alcool:
   Até 20 litros, desconto de 3% por litro;
   Acima de de 20 litros, desconto de 5% por litro;
   - Gasolina:
   Até 20 litros, desconto de 4% por litro;
   Acima de 20 litros, desconto de 6% por litro;
   Escreva um algoritmo que leia o numero de litros vendidos, o tipo de combustivel, (codificado da seguinte forma:
   A-Alcool, G-Gasolina). Calcule e imprima  valor a ser pago pelo cliente. Sabendo-se que o  preço do litro do Alccol é
   R$1,90, e o preço do litro da gasolina é R$2,50.
   */
public class PostoGasolina {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantidade de litros vendidos: ");
        double litros = scan.nextDouble();

        System.out.println("Tipo de combustível : ");
        String tipo = scan.next();

        double precoGas = 2.5;
        double precoAl = 1.9;
        int percentDesconto = 0;
        double total = 0;
        double totDesconto = 0;

        if (tipo.equalsIgnoreCase("a")) {
            if (litros <=20) {
                percentDesconto = 3;
            } else {
                percentDesconto = 5;
            }
            total = litros * precoAl;

        }

        if ( tipo.equalsIgnoreCase("g")) {

            if (litros <= 20) {
                percentDesconto = 4;
            } else {
                percentDesconto = 6;
            }
            total = litros * precoGas;
        }
        totDesconto = (total / 100) * percentDesconto;
        double precoApagar = total - totDesconto;
        System.out.println("Valor total a ser pago:" + precoApagar);
    }
}
