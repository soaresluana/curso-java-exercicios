package ExerciciosAula02;

import java.util.Scanner;

/*  Faça um programa que leia 2 numeros e em seguida pergunte ao usuario qual operação
    deseja realizar.O resultado da operação deve ser acompanhado de uma frase que diga
    se o numero é: par ou impar, negativo ou positivo.
*/
public class Operacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        int num2 = sc.nextInt();

        System.out.println("Qual operação deseja realizar? ( + - / * )");
        String operacao = sc.next();

        double resultado = 0;
        boolean valida = true;

        switch (operacao) {
            case "+" : resultado = num1 + num2 ; break;
            case "-" : resultado = num1 - num2; break;
            case "/" : resultado = num1 / num2; break;
            case "*" : resultado = num1 * num2; break;
            default:
                System.out.println("Operação Inválida.");
                valida = false;
        }

        if (valida) {
            System.out.println("Resultado: " + resultado);

            if (resultado >= 0) {
            System.out.println("Resultado positivo");
            } else {
            System.out.println("Resultado negativo");}
        }
        if (resultado % 2 == 0) {
            System.out.println("O resultado é PAR.");
        } else {
            System.out.println("O resultado é IMPAR.");

        }
    }
}
