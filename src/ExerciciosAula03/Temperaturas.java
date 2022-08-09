package ExerciciosAula03;

import java.util.Scanner;

/* O Departamento Estadual de Metereologia lhe contratou para desenvolver um programa que leia
um conjunto indeterminado de temperaturas, e informe ao final a menor e a maior temperaturas
informadas, bem como a média das temperaturas.
*/
public class Temperaturas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade temperaturas a comparar: ");
        int qtdTemperauras = scan.nextInt();

        double temperatura;
        double soma = 0;
        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;

        for (int i = 1; i <= qtdTemperauras; i++) {
            System.out.println("Digite a temperatura " + i);
            temperatura = scan.nextDouble();

            soma += temperatura;

            if ( temperatura > maior) {
                maior = temperatura;
            } else {
                menor = temperatura;
            }
        }
        double media = soma / qtdTemperauras;

        System.out.println("A maior temperatura digitada foi: " + maior);
        System.out.println("A menor temperatura digitada foi: " + menor);
        System.out.println("A média das temperaturas digitadas foi: " + media);



    }
}
