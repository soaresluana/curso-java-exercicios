package ExerciciosAula02;

import java.util.Scanner;

/* Faça um programa que peça os 3 lados de um triângulo. O programa deverá informar se
os valores podem ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo é:
Equilátero, Isósceles, ou Escaleno.
Dicas:
- Tres lados formam um triangulo quando a soma de quaisquer dois lados for maior que o terceiro;
- Triangulo Equilatero: tres lados iguais;
- Triangulo Isósceles : quaisquer dois lados iguais;
- Triangulo Escaleno: tres lados diferentes.
*/
public class Triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lado 1: ");
        int lado1 = sc.nextInt();
        System.out.println("Lado 2: ");
        int lado2= sc.nextInt();
        System.out.println("Lado 3: ");
        int lado3= sc.nextInt();

        if (((lado1 + lado2) > lado3) ||
                ((lado1 + lado3) > lado2) ||
                ((lado2 + lado3) > lado1)) {
            System.out.print("Formam um triângulo!");
        } else {
            System.out.print("Não formam um triângulo!");
        }
        if(lado1 == lado2 && lado2 == lado3 && lado1 == lado3) {
            System.out.print("Um Equilátero.");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.print("Um Isósceles.");
        } else {
            System.out.print("Um Escaleno."); // (lado1 != lado2 && lado1 != lado3 && lado2 != lado3)
        }
    }
}
