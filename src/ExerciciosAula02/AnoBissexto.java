package ExerciciosAula02;

import java.time.LocalDate;
import java.util.Scanner;

/*
Faça um programa que peça um numero correspondente a um determinado ano e em
seguida informe se este ano é ou não Bissexto.
 */
public class AnoBissexto {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Informe um numero correspondente a um ano: ");
    int ano = scan.nextInt();
    boolean anoBissexto;

    if(ano % 4 == 0 && ano % 100 != 0) {
        anoBissexto = true;
        System.out.println("O ano é bissexto.");
    } else {
        System.out.println("O ano não é bissexto.");
    }

}


}
