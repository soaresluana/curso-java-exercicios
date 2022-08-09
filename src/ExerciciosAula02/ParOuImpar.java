package ExerciciosAula02;
import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int numero = scan.nextInt();

        if(numero % 2 == 0) {
            System.out.println("O numero informado é PAR.");
        } else {
            System.out.println("O numero informado é IMPAR.");
        }
    }
}
