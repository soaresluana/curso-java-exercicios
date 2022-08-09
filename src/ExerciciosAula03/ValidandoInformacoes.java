package ExerciciosAula03;

import java.util.Scanner;

/* Faça um rpgrama que leia e valide as seguintes informações:
   a. Nome: maior que 3 caracteres;
   b. Idade: entre 0 e 50;
   c. Salario: maior  que zero;
   d. Sexo: 'F' ou 'M';
   e. Estado civil: 's', 'c', 'v', 'd'.
 */
public class ValidandoInformacoes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean informacoesValidas = false;

        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;

        do {
            System.out.println("Informe o nome: ");
            nome = scan.next();

            if (nome.length() >= 3) {
                informacoesValidas = true;
            } else {
                System.out.println("Nome precisa conter no mínimo 3 caracteres.");
            }
        } while(!informacoesValidas);

        informacoesValidas = false;
        do {
            System.out.println("Idade: ");
            idade = scan.nextInt();

            if (idade > 0 && idade <= 50) {
                informacoesValidas = true;
            } else {
                System.out.println("Idade mínima: 0. Idade máxima: 50");
            }
        } while(!informacoesValidas);

        informacoesValidas = false;
        do {
            System.out.println("Salário: ");
            salario = scan.nextDouble();

            if (salario > 0) {
                informacoesValidas = true;
            } else {
                System.out.println("Salário precisa ser maior do que 0");
            }
        } while (!informacoesValidas);


        informacoesValidas = false;
        do {
            System.out.println("Sexo: (M/F) ");
            sexo = scan.next();

            if (sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("M")) {
                informacoesValidas = true;
            } else {
                System.out.println("Informação inválida. Digite o sexo: (M/F)");
            }
        } while(!informacoesValidas);

        informacoesValidas = false;
        do {
            System.out.println("Estado civil: (Solteiro(a)-S/ Casado(a)-C / Divorciado(a)-D /Viuvo(a)- V) ");
            estadoCivil = scan.next();

            if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") ||
                    estadoCivil.equalsIgnoreCase("d") || estadoCivil.equalsIgnoreCase("v")) {
                informacoesValidas = true;
            } else {
                System.out.println("Informação inválida. Digite o estado civil:  (Solteiro(a)-S/ Casado(a)-C / Divorciado(a)-D /Viuvo(a)- V)");
            }
        } while(!informacoesValidas);

        if(informacoesValidas) {
            System.out.println(" ");
            System.out.println( "Nome: " + nome + " \nidade: " + idade  + " \nsalario: R$" + salario + " \nsexo: " +
                    sexo + " \nestado civil: " + estadoCivil);
            System.out.println("Informações validadas com sucesso !");
        }


    }
}
