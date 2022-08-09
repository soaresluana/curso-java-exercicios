package ExerciciosAula03;

import java.util.Scanner;

/* Faça um programa que peça uma nota, entre zero e dez.Mostre uma mensagem caso
   o valor seja invalido e continue pedindo até que o usuario informe um valor válido.

 */
public class Nota {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         boolean notaValida = false;
         do {
             System.out.println("Informe uma nota entre 0  e 10: ");
             double nota = scan.nextDouble();

             if (nota >= 0 && nota <= 10) {
                 notaValida = true;
                 System.out.println("A nota informada foi: " + nota);
             } else {
                 notaValida = false;
                 System.out.println("Informe uma nota válida! ");
             }
         } while (!notaValida);
    }
}
