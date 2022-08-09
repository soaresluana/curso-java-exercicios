package ExerciciosAula03;
/* Supondo que a população de um país A seja da ordem de 80000 habitantes com uma
   taxa anual de crescimento  de 3% e que a população de B seja 200000 habiantes com
   uma taxa de crescimento de 1.5%.Faça um programa que calcule e escreva o numero
   de anos necessarios para que a população do país A ultrapsse ou iguale a populção
   do país B, mantidas as taxas de crescimento.
 */
public class TaxaPopulacao {
    public static void main(String[] args) {
        int popPaisA = 80000;
        int popPaisB = 200000;
        int cont = 0;

        while (popPaisA < popPaisB) {
            popPaisA += (popPaisA / 100) * 3;
            popPaisB += (popPaisB / 100) * 1.5;
            cont ++;
        }
        System.out.println("População A: " + popPaisA) ;
        System.out.println("Populaçaõ B: " + popPaisB);
        System.out.println("O país A ultrapassa ou iguala a população do país B em " + cont + " anos.");

    }
}
