package ExerciciosAula03;

import java.text.DecimalFormat;

import static java.lang.String.format;

/* Um funcionario de uma empresa recebe aumento de salario anualmente. Sabe- se que :
- Esse funcionario foi contratado em 1995, com salario inicial de R$ 1.000,00
a. Em 1996 recebeu aumento de 1.5 % sobre seu salario inicial;
b. A partir de 1997(inclusive), os aumentos salariais sempre correspondem ao dobro do
percentual do ano anterior. Faça um programa que que determine o salario atual desse funcionario.
Após concluir isso, altere o programa permitindo que o usuario digite o salario inicial do funcionario.
*/
public class AumentoSalario {
    public static void main(String[] args) {
        double salario = 1000;
        double percentual = 1.5;

        salario += (salario / 100) * percentual;

        DecimalFormat format = new DecimalFormat("###,###.##");

        for (int i = 1997; i<= 2022; i ++) {
            percentual *= 2;
            salario += (salario / 100) * percentual;
            System.out.println(i + "= " + format.format(salario) + " - " + percentual + "%");
        }
    }
}
