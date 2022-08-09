package ExerciciosAula03;
/* Uma loja utiliza código V para transações à vista e P para transações à prazo. Faça um
algoritmo que receba os dados de 5 transações, calcule e escreva: O valor total das compras
 à vista, das compras à prazo, o total das transações, o valor da primeira prestação de todas
 as compras à prazo, sabendo que as mesmas serão pagas em 3x.
*/
import java.util.Scanner;

public class Compras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalPrazo = 0, totalVista = 0, acrescimo = 5, prazo, vista = 0, totParcelas = 0;

        for (int i  = 1; i <=5; i++) {
            System.out.println("Informe o tipo da compra: (A vista - V / A prazo - P");
            String tipo = sc.next();
            System.out.println("Valor da compra: ");
            double compra = sc.nextDouble();

            if (tipo.equalsIgnoreCase("V")) {
                totalVista += compra;
                vista += totalVista;
                System.out.println("\nTotal de compras à vista: " + totalVista);
            } else if (tipo.equalsIgnoreCase("p")) {
                prazo = (compra / 100) * acrescimo;
                totalPrazo = compra + prazo;
                totParcelas += totalPrazo / 3;
                System.out.println("\nTotal compras a prazo: " + totalPrazo);
            }
        }
        double totalCompras = totalVista + totalPrazo;

        System.out.println("Total das compras à vista: " + vista);
        System.out.println("Primeira parcela compra à prazo: " + totParcelas);
        System.out.println("Valor total de todas as compras: " + totalCompras);
    }
}
