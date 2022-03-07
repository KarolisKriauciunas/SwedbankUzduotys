package itacademy.java.oop.basics.task2;

public class BicycleApplication {
    public static void main(String[] args) {
        Bicycle Bike1 = new RoadBike();
        Bicycle Bike2 = new MountainBike();
        Bike1.speedUp(50);
        Bike2.speedUp(40);
      // System.out.println("Winner is : " + Speedometer.chooseWinner(Bike2, Bike1));

    }

}
