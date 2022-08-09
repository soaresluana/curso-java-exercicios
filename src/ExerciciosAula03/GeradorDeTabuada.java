package ExerciciosAula03;

import com.sun.java_cup.internal.runtime.Symbol;

import java.util.Scanner;

/* DEssenvolva um gerador e tabuada, capaz de gerar a tabuada de qualquer numero
inteiro entre 1 a 10. O usuario deve informar de qual numero ele deseja ver a
tabuada.A saída deve ser conforme o exemplo abaixo:
- Tabuada de 5;
5 x 1 = 5;
...
5 x 10 = 10;
 */
public class GeradorDeTabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero: ");
        int num = scan.nextInt();

        System.out.println("Tabuada de " + num + ":");
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + "x" + i + " = " + num * i);
        }
    }
}
