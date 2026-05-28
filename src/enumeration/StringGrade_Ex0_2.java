package enumeration;

public class StringGrade_Ex0_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        // 존재하지 않는 등급
        int vip = discountService.discount("vip", price);
        System.out.println(vip);

        // 오타
        int diamond = discountService.discount("DIAMOND", price);
        System.out.println(vip);

        // 대문자 입력
        int gold = discountService.discount("GOLD", price);
        System.out.println(gold);
    }
}
