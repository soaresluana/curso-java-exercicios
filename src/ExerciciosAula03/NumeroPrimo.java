package ExerciciosAula03;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n = scan.nextInt();

        boolean primo = true;

        for ( int i = 2; i < n; i ++) {
            if (n % i == 0) {
                System.out.println("Não é um numero primo - divisível por " + i);
                primo = false;
                // break;
            }
        }
        if (primo) {
            System.out.println("O numero é primo.");
        }

    }
}
