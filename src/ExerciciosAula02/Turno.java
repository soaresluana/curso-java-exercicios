package ExerciciosAula02;
/* Faça um programa que pergunte em que turno vocẽ estuda.peça para digitar
M-Matutino, V-Vespertino ou N-Noturno.Imprima a mensagem de "Bom dia!", "Boa tarde!",
ou "Boa noite!", ou "Resposta Inválida", conforme o caso.

 */

import java.util.Scanner;

public class Turno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Em que turno você estuda? (M- Matutino, V- Vespertino, N-Noturno )");
        String turno = scan.nextLine();

        switch (turno) {
            case "M": System.out.println("BOM DIA!"); break;
            case "V": System.out.println("BOA TARDE!"); break;
            case "N": System.out.println("BOA NOITE!"); break;
            default: System.out.println("RESPOSTA INVÁLIDA."); break;
        }

    }
}
