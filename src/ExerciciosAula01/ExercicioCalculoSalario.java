package ExerciciosAula01;

import java.util.Scanner;

public class ExercicioCalculoSalario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o valor ganho por hora?");
        double valorHora = scan.nextDouble();
        System.out.println("Número de horas trabalhadas no mês: ");
        int horasTrabalhadas = scan.nextInt();
        double valorMes = (valorHora * horasTrabalhadas);
        System.out.println("Seu salário mensal será " + valorMes);

        /* double valorHora;
        double horasTrabalhadas
        double valorMes;

        System.out.println("Informe o valor ganho por hora: ");
        valorHora =  Double.parseDouble(JOptionPane.showInputDialog("Informe o valor ganho por hora: ");
        System.out.println("Informe a quantidade de horas trabalhadas no mês : ");
        horasTrabalhadas = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de horas trabalhadas no mes: ");

        valorMes = (valorHora * horasTrabalhadas);
        System.out.println("O valor do salario no mês é de " + valorMes);


         */

    }
}
