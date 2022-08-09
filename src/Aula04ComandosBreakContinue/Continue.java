package Aula04ComandosBreakContinue;

import java.util.Scanner;

public class Continue {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite um numero: ");
    int num = scan.nextInt();

    System.out.println("Digite o numero limite: ");
    int max = scan.nextInt();
    for (int i = num; i <= max; i ++) {
        if (i % 7 == 0) {
            continue;
        }
        System.out.println("O valor divisível por 7 é: " + i);
    }
}
}
