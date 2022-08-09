package ExerciciosAula02;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import com.sun.xml.internal.ws.api.pipe.SyncStartForAsyncFeature;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Concessionaria {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do automóvel adiquirido:");
        double valorAutomovel = scan.nextDouble();
        System.out.println("Digite o numero de parcelas: ");
        int totParcelas = scan.nextInt();

        double desconto = 0, acrescimo = 0, valorParcial = 0, valorTotal = 0;

        if (totParcelas == 1) {
            desconto = 20;
            valorParcial = (valorAutomovel / 100 ) * desconto;
            valorTotal = valorAutomovel - valorParcial;
        } else if ( totParcelas >= 6 && totParcelas < 12) {
            acrescimo = 3;
            valorParcial = (valorAutomovel / 100) * acrescimo;
            valorTotal = valorAutomovel + valorParcial;
        } else if (totParcelas >= 12 && totParcelas < 18) {
            acrescimo = 5;
            valorParcial = (valorAutomovel / 100) * acrescimo;
            valorTotal = valorAutomovel + valorParcial;
        }  else  {
            acrescimo = 9;
            valorParcial = (valorAutomovel / 100 ) * acrescimo;
            valorTotal = valorAutomovel +  valorParcial;
        }

        System.out.println(" Valor do automóvel: " + valorAutomovel);
        System.out.println(" Total de parcelas: " + totParcelas);
        System.out.println(" Total de desconto: " + desconto + "%" );
        System.out.println(" Total de acréscimo : " + acrescimo + "%");
        System.out.println(" Total da aquisição: " + valorTotal);




    }
}
