package Aula01OPeradores;

import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        /*System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo é " + nomeCompleto);

        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = scan.next();
        System.out.println("Seu primeiro nome é " + primeiroNome);

        System.out.println("Digite a sua idade:");
        int idade = scan.nextInt();
        System.out.println("Sua idade é " + idade);

        System.out.println("Digite seu peso e sua altura : ");
        double peso = scan.nextDouble();
        double altura = scan.nextDouble();
        System.out.println("Seu peso é: " + peso + " e sua altura é " + altura);*/

        System.out.println("Digite seu primeiro nome, idade, quantidade de filhos, altura e se tem bichinho de estimação:");
        String nome = scan.next();
        int idade = scan.nextInt();
        byte qtFilhos = scan.nextByte();
        float altura = scan.nextFloat();
        boolean temPet = scan.nextBoolean();
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Quantidade de filhos: " + qtFilhos);
        System.out.println("Altura: " + altura);
        System.out.println("Quantidade de pets: " + temPet);


    }
}
