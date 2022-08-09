package ExerciciosAula03;
/* Voce foi contratado para desenvolver o programa num site de uma panificadora, montando uma tabela de preço,
de 1 ate 50 pães, a partir do preço do pão informado pelo usuario, conforme exemplo abaixo:
-- Preço do pão: R$ 0.18
-- Tabela de Preços
- 1 - R$ 0.18
- 2 - R$ 0.36
.....
-50 - R$ 9.00
*/
public class TabelaPreco2 {
    public static void main (String[] args) {

        System.out.println("PANIFICADORA PÃO DE ONTEM - TABELA DE PREÇOS:");
        System.out.println("PREÇO DO PÃO: R$0.18");

        for (int i = 1; i <= 50; i ++) {
            System.out.println(i + "- R$ " + (0.18 * i));
        }
    }
}
