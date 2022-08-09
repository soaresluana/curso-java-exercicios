package ExerciciosAula03;

import java.util.Scanner;

/* Altere o programa anterior permitindo ao usuario informar as populações e as taxas
de crescimento iniciais. Valide a entrada  e permita repetir a  operação.

 */
public class TaxaPopulacao2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double popA, popB, taxaA, taxaB;
        boolean valido = false;

        do {
            System.out.println("População do país A: ");
            popA = scan.nextDouble();

            if (popA > 0) {
                valido = true;
            } else {
                System.out.println("Resposta inválida.Populção menor do que 0.");
            }
        } while (!valido);

        valido = false;
        do {
            System.out.println("População do país B: ");
            popB = scan.nextDouble();

            if (popB > 0) {
                valido = true;
            } else {
                System.out.println("Resposta inválida.População menor do que 0.");
            }
        } while (!valido);

        valido = false;
        do {
            System.out.println("Taxa do crescimento anual do país A: ");
            taxaA = scan.nextDouble();

            if (taxaA > 0) {
                valido = true;
            } else {
                System.out.println("Resposta inválida.Taxa menor do que 0.");
            }
        } while (!valido);

        valido = false;
        do {
            System.out.println("Taxa do crescimento anual do país B: ");
            taxaB = scan.nextDouble();

            if (taxaB > 0) {
                valido = true;
            } else {
                System.out.println("Resposta inválida.Taxa menor do que 0.");
            }
        } while (!valido);

        int cont = 0;

        while (popA < popB) {
            popA += (popA / 100) * 3;
            popB += (popB / 100) * 1.5;
            cont ++;
        }
        System.out.println("População A: " + popA) ;
        System.out.println("Populaçaõ B: " + popB);
        System.out.println("O país A ultrapassa ou iguala a população do país B em " + cont + " anos.");








    }
}
