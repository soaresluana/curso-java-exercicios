package ExerciciosAula02;

import java.util.Scanner;
// Faça um programa que verifique se uma letra é vogal ou consoante.

public class VogalOuConsoante {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        String letra = scan.nextLine();

        switch(letra) {
            case "a": System.out.println("A letra é uma vogal."); break;
            case "e": System.out.println("A letra é uma vogal."); break;
            case "i": System.out.println("A letra é uma vogal."); break;
            case "o": System.out.println("A letra é uma vogal."); break;
            case "u": System.out.println("A letra é uma vogal."); break;
            default: System.out.println("A letra é uma consoante.");



        }
    }
}
