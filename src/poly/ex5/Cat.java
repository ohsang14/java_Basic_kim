package poly.ex5;

public class Cat implements InterfaceAnimal{
    @Override
    public void sound() {
        System.out.println("냐용");
    }

    @Override
    public void move() {
        System.out.println("고양이 이동");
    }
}
