package ExerciciosAula03;

import java.util.Scanner;

/* Faça um programa que leia um nome de usuario  e a sua senha e não aceite  a senha igual ao
nome de usuario, mostrando uma mensagem de erro e voltando a pedir as informações.
*/
public class Usuario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean senhaValida = false;
        String nomeUsuario, senhaUsuario;

        do {
            System.out.println("Informe o nome de usario: ");
             nomeUsuario = scan.next();

            System.out.println("Informe a senha de usuario: ");
            senhaUsuario = scan.next();

            if (nomeUsuario.equalsIgnoreCase(senhaUsuario)) {
               // senhaValida = false;
                System.out.println("Sua senha precisa ser diferente de seu nome de usuario! Informe uma senha válida.");
            } else {
                senhaValida = true;
                System.out.println("Login validado com sucesso! ");
            }
        } while (!senhaValida);


    }
}
