package poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        //자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = " + child.value);
        child.method();

        System.out.println(" ========= ");
        // 부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("Value = " + parent.value);
        parent.method();

        System.out.println(" ========= ");
        // 부모 변수가 자식 인스턴스를 참조 ( 다형적 참조 )
        // Override 된 메소드가 1순위 .
        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("Value = " + poly.value);
        poly.method(); // 자식에 Override가 되어 있기 때문에 자식으로 나옴
    }
}
