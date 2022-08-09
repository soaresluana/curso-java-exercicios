package ExerciciosAula02;
import java.util.Scanner;
//Faça um programa que leia três numeros e mostre-os em ordem decrescente.

public class OrdemDecrescente {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe três numeros: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (num1 > num2 && num1 > num3 && num2 > num3) {
            System.out.println("A ordem decrescente é " + num1 + "..." + num2 + "..." + num3);
        } else if (num2 > num1 && num2 > 3 && num1 > num3) {
            System.out.println("A ordem decrescente é " + num2 + "..." + num1 + "..." + num3);
        } else if(num3 > num2 && num3 > num1 && num2 > num1) {
            System.out.println("A ordem descrescente é " + num3 + "..." + num2 + "..." + num1);
        }
    }
}
