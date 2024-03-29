package poly.diamond;

public class Child implements InterfaceA, InterfaceB{
    @Override
    public void methodA() {
        System.out.println("Child. MethodA");
    }

    @Override
    public void methodCommon() {
        System.out.println("child.methodCommon");
    }

    @Override
    public void methodB() {
        System.out.println("Child.methodB");
    }
}
