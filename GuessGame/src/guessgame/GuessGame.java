package guessgame;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 * @Author: Niranjan Bekoju
 * @Address: Liwali Bhaktapur
 * @College: Khwopa College of Engineering
 */
public class GuessGame {

    public static void main(String[] args) {
        Random r = new Random();
        int a;
        int check;
        do {
            do {
                a = r.nextInt(6);
            } while (a == 0);
            String s = JOptionPane.showInputDialog("Enter A number from 1 to 6");
            if (a == Integer.parseInt(s)) {
                JOptionPane.showMessageDialog(null, "You Win", "Congratulation", 2);
            } else {
                JOptionPane.showMessageDialog(null, "Computer number is " + a + " Your number is " + Integer.parseInt(s), "Try Again", 0);
            }
            check = JOptionPane.showConfirmDialog(null, "Do you want to continue");
            if (check == 0) {
                continue;
            } else {
                break;
            }
        } while (true);

    }
}
