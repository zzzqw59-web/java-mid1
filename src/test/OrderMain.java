package test;

public class OrderMain {
    public static void main(String[] args) {
        Order order1 = new Order("키보드", OrderStatus.READY);
        Order order2 = new Order("마우스", OrderStatus.SHIPPING);
        Order order3 = new Order("모니터", OrderStatus.COMPLETE);

        order1.printStatus();
        order2.printStatus();
        order3.printStatus();
    }
}
