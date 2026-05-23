package lang.imutable.address;

public class RefMain1_2 {
    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address address1 = new Address("서울"); // x001
        Address address2 = new Address("서울"); // x002

        System.out.println("address1 = " + address1);
        System.out.println("address2 = " + address2);

        address2.setValue("부산"); // 부산으로 값 변경

        System.out.println("address1 = " + address1);
        System.out.println("address2 = " + address2);
    }
}
