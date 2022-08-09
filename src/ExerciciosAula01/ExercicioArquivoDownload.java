package ExerciciosAula01;

import java.util.Scanner;

public class ExercicioArquivoDownload {
    /* Faça um programa que mostre o tamanho de um arquivo para Download(em MB),
    e a velocidade de um link de internet ( em Mbps), calcule e mostre o tempo
    aproximado de Download do arquivo usando este link (em minutos).
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o tamanho do arquivo: ");
        double tamanhoArquivo = scan.nextDouble();
        System.out.println("Entre com a velocidade da internet: ");
        double velInternet = scan.nextDouble();

        double tempo = tamanhoArquivo / velInternet;
        System.out.println("Tempo de download: " + tempo);

    }
}
