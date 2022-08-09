package Aula02Condicionais;

import java.util.Scanner;

public class IfElse {
    // if/ if - else / if - else aninhado
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com a idade: ");
        int idade = teclado.nextInt();

        if(idade >= 18) {
            System.out.println("É maior de idade.");
        } else {
            System.out.println("É menor de idade.");
        }

        System.out.println(" ");

        /*if - else aninhado
        barato <= 10
        15 <= valor 17 - pesquisar mais
        >= 17 - muito caro
         */

        System.out.println("Entre com o preço do item: ");
        double valor = teclado.nextDouble();
        if (valor <= 10) {
            System.out.println("Irá levar! Está muito barato.");
        } else if(valor >= 10 && valor <= 17) {
            System.out.println("Ainda vai continuar pesquisando. Ou pode pedir um desconto.");
        } else {
            System.out.println("Naõ vai levar, está muito caro.");
        }
        }
    }

