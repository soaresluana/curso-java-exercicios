package ExerciciosAula03;
/* A serie de Fibonacci é formada pela sequencia 1,1,2,,3,5,8,13,21,34,55.. Faça um programa
   que gere a serie ate que o numero seja maior que 500.
 */

public class Fibonacci2 {
    public static void main(String[] args) {

        int primeiro = 1;
        int segundo= 1;
        int proximo = 0;

        System.out.println(primeiro);
        System.out.println(segundo);

        while (proximo <= 500) {
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;

            System.out.println(proximo);
        }
    }
}