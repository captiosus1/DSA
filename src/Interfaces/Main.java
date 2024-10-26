package Interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.engineStart();
        car.engineAcc();
        car.mediaStart();
        car.mediaStop();
        car.engineStop();
        car.breaks();
        Break.testing();
        int x=1;
        System.out.println(x);
        int y=x++;
        System.out.println(x);
        System.out.println(x++ + ++y);
        System.out.println(y);
    }
}
