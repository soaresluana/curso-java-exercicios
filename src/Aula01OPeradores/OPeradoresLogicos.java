package Aula01OPeradores;

public class OPeradoresLogicos {

    public static void main(String[] args) {
        int valor1 = 10;
        int valor2 = 12;

        boolean resultado1 = (valor1 == 10) && (valor2 == 12);
        System.out.println("Valor1 é 10 AND Valor2 é 12 - resultado: " + resultado1);

        boolean resultado2 = (valor1 == 10) || (valor2 == 12);
        System.out.println("Valor1 é 10 OR Valor2 é 12 - resultado: " + resultado2);

        boolean verdadeiro = true;
        boolean falso = false;
        System.out.println(verdadeiro && falso);
        System.out.println(verdadeiro || falso);
        System.out.println(verdadeiro ^ falso);
        System.out.println(!verdadeiro && falso);

        //Ordem de precedẽncia

        int resultado = 1 + 1 - 1 + 1 * 1 / 1;
        System.out.println(resultado);




    }
}
