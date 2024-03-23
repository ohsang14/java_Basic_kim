package extends1.Super2;

public class ClassB extends  ClassA{
    public ClassB(int a ){
        super(); // 기본 생성자 생략 가능
        System.out.println("classB 생성자 a = " + a);
    }
    public ClassB(int a, int b){
        super();// 기본 생성자 생략 가능
        System.out.println("class B 생성자 = " + a + "b = " + b);
    }
}
