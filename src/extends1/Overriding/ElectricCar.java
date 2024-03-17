package extends1.Overriding;

public class ElectricCar extends Car {
    @Override
    public void move() {

        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("충전 합니다");
    }
}
