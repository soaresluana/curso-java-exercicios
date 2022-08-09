package Aula03Loops;

public class LoopWhileDoWhile {
    public static void main(String[] args) {
        int i = 1; // count ou cont
        int max = 10;
        System.out.println("Contando até " + max);

        while (i <= max) {
            System.out.print( i + "...");
            i++;
        }
        System.out.println(i);

        do {
            i++;
            System.out.println(i + "...");
        } while ( i < 15);
        System.out.println (i);

    }
}
