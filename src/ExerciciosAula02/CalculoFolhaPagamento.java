package ExerciciosAula02;

import java.util.Scanner;

/* Faça um programa para o calculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda,
que depende do salario bruto(5%), 3% para o Sindicato e que o FGTS corresponde a 11% do salario bruto, mas não é
descontado(a empresa deposita). O salario liquido corresponde  ao salario bruto menos os descontos. O programa
deverá pedir ao usuário o valor de sua hora e a quantidade de horas trabalhadas no mês.
Desconto do IR:
- Salario Bruto até 900: Isento;
- Salario Bruto até 1500 : desconto de 5%;
- Salario Bruto até 2500 : desconto de 10%;
- Salario Bruto acima de 2500 : desconto de 20%.
Imprima na tela as informações.
*/
public class CalculoFolhaPagamento {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o valor ganho por hora?");
        double vHora = scan.nextDouble();
        System.out.println("Número de horas trabalhadas no mês: ");
        int hTrabalhadas = scan.nextInt();

        double salarioBruto = (vHora * hTrabalhadas);
        double sindicato = (salarioBruto / 100) * 3;
        double ir = 0;
        double totDescontos = sindicato + ir;
        double salarioLiquido = salarioBruto - totDescontos;

        if (salarioBruto <= 900) {
            ir = 0;
            System.out.println("Salario Liquido: " + salarioLiquido);
        } else if( salarioBruto > 900 && salarioBruto <= 1500) {
            ir = (salarioBruto / 100) * 5;
            System.out.println("Salario Líquido: " + salarioLiquido);
        } else if (salarioBruto >= 1500 && salarioBruto <= 2500) {
            ir = (salarioBruto/ 100) * 10;
            System.out.println("Salario Líquido: " + salarioLiquido);
        } else {
            ir = (salarioBruto / 100) * 20;
            System.out.println("Salario Líquido: " + salarioLiquido);
        }

    }
}
