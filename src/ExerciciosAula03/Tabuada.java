package ExerciciosAula03;

import java.util.Scanner;

/* Desenvolva um programa que faça a tabuada de um numero qualquer inteiro que sera digitado pelo usuario, mas a tabuada
   nao deve necessariamente iniciar em 1 terminar em 10, o valor inicial e final devem ser informados tambem pelo usuario,
   conforme exemplo:
   Montar a tabuada de : 5
   Começar por : 4
   Terminar em: 7
   obs: voce deve verificar se o usuario nao digitou o final menor que o inicial.
*/
public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o numero para gerar a tabuada: ");
        int num = scan.nextInt();

        boolean invalida = true;
        int numInicio, numFinal;

        do {
            System.out.println("Digite o numero de inicio: ");
            numInicio = scan.nextInt();

            System.out.println("Digite o numero final: ");
            numFinal = scan.nextInt();

            if (numInicio < numFinal) {
                invalida = false;
            }
        } while (invalida);

        System.out.println("Tabuada do " + num + ": ");
        System.out.println("Começar por:  " + numInicio);
        System.out.println("Terminar em:  " + numFinal);
        System.out.println(" ");


        for (int i =  numInicio; i <= numFinal; i++) {
            System.out.println(num + "x" + i + "= " + (num * i));

        }
    }
}
