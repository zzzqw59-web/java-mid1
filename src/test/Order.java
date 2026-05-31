package test;

public class Order {
    private String productName;
    private OrderStatus status;

    public Order(String productName, OrderStatus status) {
        this.productName = productName;
        this.status = status;
    }

    public void printStatus() {
        if (status == OrderStatus.READY) {
            System.out.println(productName + ": 주문 준비중");
        } else if (status == OrderStatus.SHIPPING) {
            System.out.println(productName + ": 배송중");
        } else if (status == OrderStatus.COMPLETE) {
            System.out.println(productName + ": 배송완료");
        } else if (status == OrderStatus.CANCEL) {
            System.out.println(productName + ": 주문취소");
        }
    }
}
