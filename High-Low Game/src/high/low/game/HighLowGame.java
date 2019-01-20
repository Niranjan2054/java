package high.low.game;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * @Author: Niranjan Bekoju
 * @Address: Liwali Bhaktapur
 * @College: Khwopa College of Engineering
 */
public class HighLowGame {

    public static void main(String[] args) {
        Random r = new Random();
        int rand = r.nextInt(99);
        Scanner s = new Scanner(System.in);
        int guess;
        int iteration = 1;
        boolean b = true;
        while (b) {
            guess = s.nextInt();
            try {
                if (rand == guess) {
                    System.out.println("Your Win");
                    System.out.println("You finish in " + iteration + " attempt");
                } else if (rand * 2 < guess) {
                    System.out.println("Too high Guess");
                } else if (rand < guess) {
                    System.out.println("High Guess");
                } else if (rand > 2 * guess) {
                    System.out.println("Too Low Guess");
                } else if (rand > guess) {
                    System.out.println("low Guess");
                }
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Error :" + e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Input Mismatch Exception :" + e.getMessage());
            } finally {
                if (rand == guess) {
                    b = false;
                } else {
                    iteration++;
                }
            }
        }

    }
}
