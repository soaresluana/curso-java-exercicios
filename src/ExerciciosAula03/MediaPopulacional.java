package ExerciciosAula03;

import java.util.Scanner;

public class MediaPopulacional {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pop, filhos, totalFilhos = 0, i, y = 1;
        float salario, totalSalario = 0, mediaSalario, mediaFilhos = 0, maiorSalario = 0, percSalario = 0;

        System.out.println("Qual o numero da população da cidade? ");
        pop = scan.nextInt();

            do {
                System.out.println("Qual o salario? ");
                salario = scan.nextFloat();
                System.out.println("Quantidade de filhos: ");
                filhos = scan.nextInt();

                // soma dos salarios
                totalSalario += salario;

                //soma dos filhos
                totalFilhos += filhos;

                //maior salario
                if (maiorSalario < salario) {
                    maiorSalario = salario;
                }
                // porcentagem ate R$100,00
                if (salario <= 100) {
                    percSalario = (y * 100) / pop;
                    y++;
                }
            } while (salario > 0 );

         // media dos salarios
        mediaSalario = totalSalario / pop;
        //media de filhos
        mediaFilhos = totalFilhos / pop;

        System.out.println("\n A média de salário da população é " + mediaSalario);
        System.out.println("\n A média do numero de filhos é " + mediaFilhos);
        System.out.println("\n O maior salário é " + maiorSalario);
        System.out.println("\n A porcentagem de pessoas com salaŕios até R$ 100,00 é " + percSalario +  "%");

    }
}
