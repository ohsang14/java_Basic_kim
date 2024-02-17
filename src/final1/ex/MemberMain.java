package final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myid", "Kim");
        member.print();
        member.changeData("myid2", "seo");
        member.print();
    }
}
