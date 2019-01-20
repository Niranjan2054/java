/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicledemo;

/**
 *
 * @author Niranjan
 */
public class Truck extends Vehicle {

    double price = 1000000.0;

    public Truck() {
        this.setHighSpeed(80);
    }

    public void controlSpeed(String a) {
        if (this.isStart()) {
            int sp = this.getSpeed();
            this.setTurn("");

            if (a.equalsIgnoreCase("w") && sp < this.getHighSpeed()) {
                sp += 5;
            } else if (a.equalsIgnoreCase("s") && sp > 0) {
                sp -= 5;
            } else if (a.equalsIgnoreCase(" ") && sp < 30) {
                sp = 0;
            } else if (a.equalsIgnoreCase("p") && sp == 0) {
                this.setStart(false);
            } else if (a.equalsIgnoreCase("a")) {
                this.setTurn("Left");
            } else if (a.equalsIgnoreCase("d")) {
                this.setTurn("Right");
            }
            if (sp < 30 && sp > 0) {
                this.setInstruction("You can press disc brake pressing space bar");
            } else if (sp >= 30) {
                this.setInstruction("Your Disc Brake will not work");
            } else if (sp == 0) {
                this.setInstruction("You can Stop Your Engine Now\nPress p to Stop Engine");
            }
            this.setSpeed(sp);

        }
    }
}
