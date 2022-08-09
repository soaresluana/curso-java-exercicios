package ExerciciosAula02;

import java.util.Scanner;

/* Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
   "Telefonou para a vítima? ";
   "Esteve no local do crime?";
   "Mora perto da vítima?"
   "Devia para a vitima?";
   "Ja trabalhou com a vítima?";
   O programa deve no final emitir uma classificação sobre a participação da pessoa no
   crime.Se a pessoa responder positivamente a 2 questões ela deve ser classificada como
   "Suspeita", entre 3 e 4 como "Cumplice", e 5 como "Assassino". Caso contrario, sera
   classificada como "Inocente".
 */
public class CenaDeCrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Telefonou para a vítima no dia do crime? ");
        String resp1 = sc.nextLine();
        System.out.println("Esteve no local do crime? ");
        String resp2 = sc.nextLine();
        System.out.println("Mora perto da vítima? ");
        String resp3 = sc.nextLine();
        System.out.println("Devia para a vítima? ");
        String resp4 = sc.nextLine();
        System.out.println("Já trabalhou com a vítima? ");
        String resp5 = sc.nextLine();

        int cont = 0;
        if (resp1.equalsIgnoreCase("s")) {
            cont++;
        }
        if (resp2.equalsIgnoreCase("s")) {
            cont++;
        }
        if (resp3.equalsIgnoreCase("s")) {
            cont++;
        }
        if (resp4.equalsIgnoreCase("s")) {
            cont++;
        }
        if (resp5.equalsIgnoreCase("s")) {
            cont++;
        }

        if( cont == 2) {
            System.out.println("Suspeito.");
        } else if (cont == 3 || cont == 4) {
            System.out.println("Cumplice.");
        } else if (cont == 5) {
            System.out.println("Assassino.");
        } else {
            System.out.println("Inocente.");
        }











    }


}

