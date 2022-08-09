package ExerciciosAula02;

import java.util.Scanner;

/* Faça um programa que verifique se uma letra digitada é "F" ou "M".
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.

 */
public class MasculinoOuFeminino {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a letra correspondente ao sexo: ");
        String letra = scan.nextLine();

        switch (letra) {
            case "F": System.out.println("- Feminino"); break;
            case "M": System.out.println("- Masculino"); break;
            default: System.out.println("Sexo Inválido");
        }

    }
}
