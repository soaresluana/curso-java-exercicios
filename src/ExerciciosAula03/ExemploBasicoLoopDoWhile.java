package ExerciciosAula03;

public class ExemploBasicoLoopDoWhile {
    public static void main(String[] args) {
        // primeiro executa o que esta dentro do loop e depois verifica se a condição foi satifeita.

        int i = 1;
        int j = 1;

        do {
            System.out.println(i);
            ++i;
        } while(i <= 100);

        System.out.println(" ");

        while ( j <= 100) {
            System.out.println(j);
            ++j;
        }
    }
}
