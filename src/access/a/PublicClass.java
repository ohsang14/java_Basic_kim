package access.a;

public class PublicClass { // public 클레스는 파일 명과 이름이 같아야됨.
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();
    }
}

class DefaultClass1 { // default 클레스 접근 제어자

}

class DefaultClass2 { // default 클레스 접근 제어자

}
