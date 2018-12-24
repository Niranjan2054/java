package pinbreakser;

import java.util.Random;

/**
 * @Author: Niranjan Bekoju
 * @Address: Liwali Bhaktapur
 * @College: Khwopa College of Engineering
 */
public class PINBreakser {

    public static void main(String[] args) {
        Random r = new Random();
        int PIN;
        do {
            PIN = r.nextInt(999);
            System.out.println(PIN);
        } while (PIN == 0);
        int tryPIN;
        do {
            tryPIN = r.nextInt(9) * 1000 + r.nextInt(9) * 100 + r.nextInt(9) * 10 + r.nextInt(9);
            System.out.println("tryPIN:" + tryPIN + "\tPIN:" + PIN);
        } while (tryPIN != PIN);
    }
}
