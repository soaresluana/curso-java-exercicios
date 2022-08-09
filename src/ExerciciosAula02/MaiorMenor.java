package ExerciciosAula02;
import java.util.Scanner;
// Faça um programa que leia três numeros e mostre o maior e o menor deles.

public class MaiorMenor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite trẽs valores: ");
        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();
        int numero3 = scan.nextInt();
        int maiorNumero;

       if (numero1 > numero2 && numero1 > numero3) {
           maiorNumero = numero1;
           System.out.println("O maior numero é o: " + numero1);
       } else if (numero2 > numero1 && numero2 > numero3) {
           maiorNumero = numero2;
           System.out.println("O maior numero é o: " + numero2);
       } else {
           maiorNumero = numero3;
           System.out.println("O maior numero é o: " + numero3);
       }

        int menorNumero;
        if (numero1 < numero2 && numero1 < numero3) {
            menorNumero = numero1;
            System.out.println("O menor numero é o: " + numero1);
        } else if (numero2 <numero1 && numero2 < numero3) {
            menorNumero = numero2;
            System.out.println("O menor numero é o: " + numero2);
        } else  {
            menorNumero = numero3;
            System.out.println("O menor numero é o: " + numero3);
        }
    }
}
