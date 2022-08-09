package Aula02Condicionais;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        /* Suponhamos que desejemos fazer um Programa em que o usuario entre
        com um numero representando um dia da semana, que pode ser de 1 a 7, e,
        assim de acordo com esse numero será impresso o nome do dia da semana correspondente.
        Exemplo: 1 -> Domingo
        */
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um dia da semana: (1-7)");
        int diaSemana = scan.nextInt();
        if (diaSemana == 1) {
            System.out.println("Domingo");
        } else if (diaSemana == 2) {
            System.out.println("Segunda-Feira");
        } else if (diaSemana == 3) {
            System.out.println("Terça-Feira");
        } else if  (diaSemana == 4) {
            System.out.println("Quarta-Feira");
        } else if (diaSemana == 5) {
            System.out.println("Quinta-Feira");
        } else if (diaSemana == 6) {
            System.out.println("Sexta-Feira");
        } else if (diaSemana == 7) {
            System.out.println("Sábado");
        } else {
            System.out.println("Insira um dia válido!");
        }
        System.out.println(" ");

        switch (diaSemana) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6: System.out.println("Dia util"); break;
            case 1:
            case 7: System.out.println("Fim de semana"); break;
            default: System.out.println("Insira um dia válido! ");
        }

    }
}