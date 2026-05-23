package lang.imutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        ImutableAddress address1 = new ImutableAddress("서울"); // x001
        ImutableAddress address2 = address1; // x001 , 참조값 대입을 막을 수 없다

        System.out.println("address1 = " + address1);
        System.out.println("address2 = " + address2);

        address2 = new ImutableAddress("부산");
        System.out.println("address1 = " + address1);
        System.out.println("address2 = " + address2);
    }
}
