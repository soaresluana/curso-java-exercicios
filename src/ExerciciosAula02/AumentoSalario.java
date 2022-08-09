package ExerciciosAula02;

import java.util.Scanner;

/* As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores,
e lhe contrataram para desenvolver o programa que calculará os reajustes.
Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte
citério, baseado no salário atual:
- salários até R$ 280,00: aumento de 20%;
- salários entre R$ 280,00 e R$700,00: aumento de 15%;
-salários entre R$700,00 e R$1500,00 : aumento de 10%;
-salários de R$1500,00 em diante: aumento de 5%.
Após o aumento ser realizado, informe na tela: o salario antes do reajuste, o percentual
de aumento aplicado, o valor do aumento, o novo salário, após o aumento.
*/
public class AumentoSalario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o salário do colaborador: ");
        double salario = scan.nextDouble();

        int percentualAumento = 0;
        if (salario <= 280) {
            percentualAumento = 20;
        } else if ( salario >= 280 && salario <= 700) {
            percentualAumento = 15;
        } else if (salario >= 700 && salario <= 1500) {
            percentualAumento = 10;
        } else if (salario >= 1500) {
            percentualAumento = 5;
        }

        double aumento = (salario / 100 ) * percentualAumento;
        double salarioAjustado = salario + aumento;

        System.out.println("Salário atual: " + salario);
        System.out.println("Percentual do aumento aplicado: " + percentualAumento + "%.");
        System.out.println("Valor do aumento: " + aumento);
        System.out.println("Valor do salario com reajuste: " + salarioAjustado);
    }

    }

