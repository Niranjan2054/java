package vehicledemo;

import java.util.Scanner;

/**
 * @Author: Niranjan Bekoju
 * @Address: Liwali Bhaktapur
 * @College: Khwopa College of Engineering
 */
public class VehicleDemo {

    public static void main(String[] args) {
        Truck truck1 = new Truck();
        Scanner s1 = new Scanner(System.in);

//        System.out.println("Press Space Bar to Start The Engine");
        System.out.println(truck1.getInstruction());
        String start;
        do {
            start = s1.nextLine();
            start = start.substring(0, 1);
            if (start.equalsIgnoreCase("n")) {
                truck1.setStart(true);
                truck1.setInstruction("Engine Started\nPress w to increase speed and s to lower speed");
                truck1.setSpeed(0);
            }
        } while (!start.equalsIgnoreCase("n"));
        System.out.println(truck1.isStart());
        do {
            System.out.println(truck1.getInstruction());
            int a = truck1.getSpeed();
            System.out.println("Speed = " + a);
            System.out.println(truck1.getTurn());
            String s = s1.nextLine();
            truck1.controlSpeed(s.substring(0, 1));
        } while (truck1.isStart());
        System.out.println("Your Engine Stops");
    }
}
