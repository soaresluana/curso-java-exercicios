package ExerciciosAula05;

public class OneArray {
    public static void main(String [] args) {

        int[] scores = {90,70,50,80,60,85}; // defina uma matriz unidimensional

        System.out.println(scores[2]);
        System.out.println(scores[4]);
        System.out.println(scores[1]);
        System.out.println(scores[3]);
        System.out.println(scores[5]);
        System.out.println(scores[0]);

        System.out.println(" ");
        // matriz bidimensional

        int [][] arrs = {
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };
        System.out.println(arrs[0][0]);
        System.out.println(arrs[0][2]);
        System.out.println(arrs[1][1]);
        System.out.println(arrs[2][2]);
    }
}
