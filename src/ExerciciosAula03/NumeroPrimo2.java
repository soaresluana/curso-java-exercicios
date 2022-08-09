package ExerciciosAula03;

import java.util.Scanner;

/* Faça um programa que gere uma lista de numeros primos existentes entre 1 e
   um numero inteiro informado pelo usuario.
 */
public class NumeroPrimo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um número");
        int num = scan.nextInt();

        boolean primo;

        for (int i=1; i<=num; i++){

            primo = true;

            for (int j=2; j<i; j++){
                if (i % j == 0){
                    //System.out.println("Não é primo - divisível por " + i);
                    primo = false;
                    //break;
                }
            }

            if (primo){
                System.out.print( i);
            }
        }
    }
}
