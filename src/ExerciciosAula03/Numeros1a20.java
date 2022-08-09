package ExerciciosAula03;
/*  Faça um programa que imprima na tela os numeros de 1 a 20, um abaixo do outro.
Depois modifique o programa e para que ele mostre um ao lado do outro.
*/
public class Numeros1a20 {
    public static void main(String[] args) {

        int cont = 0;
        for (int i = 0, j = 20; i <= j; i++) {
            System.out.println(i);
            cont ++;
        }
        /*
         int cont = 0;
         for (int i = 0, j = 20; i <= j; i++) {
            System.out.print(i + ", "); -> Um ao lado do outro.
            cont ++;
         }
         */
    }
}
