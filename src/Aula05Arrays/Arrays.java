package Aula05Arrays;
//Problema: Armazenar a temperatura média diária por 1 ano

import java.util.Random;

public class Arrays {
    public static void main(String[] args) {

        final double[] temperaturas = new double[365];
        final Random r = new Random();
        for (int i = 0; i < temperaturas.length; i++) {
            temperaturas[i] = -10 + (60 - (-10)) * r.nextDouble();
        }

        System.out.println("A temperatura no dia 1 foi de " + temperaturas[0] + "º");

        System.out.println("Tamanho do array: (posições na memória) " + temperaturas.length);

        System.out.println("Valores do array: ");

        for ( int i = 0; i <temperaturas.length; i++) {
            System.out.println("A temperatura do dia " + (i + 1) + " é " + temperaturas[i]);
        }
    }
}
