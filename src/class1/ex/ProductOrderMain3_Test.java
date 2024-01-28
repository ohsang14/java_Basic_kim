package class1.ex;

import java.util.Scanner;

public class ProductOrderMain3_Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 여러 상품의 주문 정보를 담는 배열 생성

        System.out.println("입력할 주문의 개수를 입력하세요: " );
        int n = sc.nextInt();
        sc.nextLine();

        ProductOrder[] orders = new ProductOrder[n];

        for (int i = 0; i < orders.length; i++) {
            System.out.println((i+1)+ "번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String productName = sc.nextLine();

            System.out.print("가격: " );
            int price = sc.nextInt();

            System.out.print("수량: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            orders[i] = createOrder(productName,price,quantity);
        }


        // 총 결제 금액 출력


        printOrders(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액:  " + totalAmount);
    }

    // createOrder()를 여러번 사용해서 상품 주문 정보들을 생성하고 배열에 저장
    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    // printOrders()를 사용해서 상품 주문 정보 출력
    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }

    }

    // getTotalAmount()를 사용해서 총 결제 금액 계산
    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}
