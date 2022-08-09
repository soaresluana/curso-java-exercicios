package ExerciciosAula03;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {

        Random rn = new Random();
        for (int i = 0; i <= 10; i++) {
            int num = rn.nextInt(10);
            System.out.print(num + ", ");
        }
    }
}
