package ExerciciosAula03;
/*O Sr. Manoel possui uma grande loja de artigos de 1,99, com cerca de 10 caixas.Para agilizar o
cálculo de quanto cada cliente deve pagar ele desenvolveu uma tabelaque contem o numero de itens
que o cliente comprou e ao lado o valor da conta. Desta forma a atendente do caixa precisa apenas
contar quantos itens o cliente esta levando e olhar na tabela de preços. Voce foi contratado para
desenvolver o programa que monta esta tabela de preços, que conterá os preços, que contera os preços
de 1 ate 50 produtos,conforme exemplo:
-- Lojas Quase Dois --
 - 1 - R$1.99
 - 2 - R$.3.98
 ...
 50 - R$99.50
 */
public class TabelaPrecos {
    public static void main(String [] args) {

        System.out.println("LOJAS QUASE DOIS - TABELA DE PREÇOS: ");
        for (int i = 1; i <= 50; i ++) {
            System.out.println(i+ " - R$ " + (1.99 * i));
        }

    }
}
