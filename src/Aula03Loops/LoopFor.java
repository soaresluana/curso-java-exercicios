package Aula03Loops;

public class LoopFor {
    public static void main(String[] args) {

        for (int i =0; i < 5; i++) {
            System.out.print(i + "...");
        }

        for ( int i = 0, j = 10; i < j; i++, j--) {
            System.out.print(" i: " + i + " \nj: " + j);
        }

        int count = 0;
        for (; count < 10 ; ) {
            System.out.println(count);
            count += 2;
        }

        for (int cont = 0; cont < 10; cont += 2) {
            System.out.println(cont );
        }
        //loop sem corpo
        int soma = 0;
        for (int i = 1; i < 5 ; soma += i ++) {
            System.out.println("O valor da soma é: " + soma);
        }
    }
}
