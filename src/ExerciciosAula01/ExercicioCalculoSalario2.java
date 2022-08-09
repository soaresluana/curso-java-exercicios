package ExerciciosAula01;

import java.util.Scanner;

public class ExercicioCalculoSalario2 {
    /* Faça um programa que pergunte quanto você ganha por hora e o numero de horas
    trabalhadas no mẽs.Calcule e mostre o total do seu salario no referido mẽs, sabendo-se
    que são descontados 11% para o imposto de renda, 8% para o INSS, e 5% para o Sindicato, nos dẽ:
    salario bruto.
    a.Quanto pagou ao INSS;
    b.Quanto pagou ao Sindicato;
    c.O salário líquido.
    d.Calcule os descontos e o salário liquido, conforme tabela abaixo:
    + Salario Bruto:R$ - IR(11%): R$ - INSS(8%): R$ - Sindicato(5%):R$ = Salario Liquido: R$
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o valor ganho por hora?");
        double vHora = scan.nextDouble();
        System.out.println("Número de horas trabalhadas no mês: ");
        int hTrabalhadas = scan.nextInt();
        double salarioBruto = (vHora * hTrabalhadas);
        double inss = (salarioBruto / 100) * 8;
        double sindicato = (salarioBruto / 100) * 5;
        double ir = (salarioBruto / 100) * 11;
        double totalDescontos = inss + sindicato + ir;
        double salarioLiquido = salarioBruto - totalDescontos;
        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("INSS: " + inss);
        System.out.println("Sindicato: " + sindicato);
        System.out.println("Imposto de renda: " + ir);
        System.out.println("Total de descontos: " + totalDescontos);
        System.out.println("Salário líquido: " + salarioLiquido);





    }
}
