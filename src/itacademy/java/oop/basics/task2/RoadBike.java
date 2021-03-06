package itacademy.java.oop.basics.task2;

public class RoadBike implements Bicycle {
    public final int maxSpeed = 50;
    public final int minSpeed = 0;
    private int gear = 1;
    private int speed = 0;
    public final int maxChangeGear = 2;
    public final int minChangeGear = -2;
    public final int maxGear = 10;
    public final int minGear = 0;

    @Override
    public void ChangeGear(int newGear) {

        if (newGear < minChangeGear || newGear > maxChangeGear) {
            System.out.println("Bad Input");
        } else {
            if (this.gear + newGear > maxGear) {
                System.out.println("Upper bound reached. Try decreasing gear!");
            } else if (this.gear + newGear < minGear) {
                System.out.println("Lower bound reached. Try increasing gear!");
            } else {
                this.gear += newGear;
                System.out.println("New Gear Status : " + this.gear);
            }

        }
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void applyBrakes(int increment) {
        if (increment > -1) {
            System.out.println("Input not negative!");
            return;
        }
        if (this.speed + increment < minSpeed) {
            System.out.println("You're breaking too fast! Lower bound Exited.");
        } else {
            this.speed += increment;
            System.out.println("New speed status : " + this.speed);
        }
    }

    @Override
    public void speedUp(int increment) {
        if (increment < 0) {
            System.out.println("Input not Positive!");
            return;
        }
        if (this.speed + increment > maxSpeed) {
            System.out.println("You're speeding up too fast! Upper bound Exited. You can speed up to :" + (this.maxSpeed - this.speed));
        } else {
            this.speed += increment;
            System.out.println("New speed status : " + this.speed);
        }
    }
    @Override
    public void applyBreaks(int increment) {
        if (increment > -1) {
            System.out.println("Input not negative!");
            return;
        }
        if (this.speed + increment < minSpeed) {
            System.out.println("You're breaking too fast!");
        } else {
            this.speed += increment;
            System.out.println("New speed status : " + this.speed);
        }
    }
}
