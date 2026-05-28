package enumeration;

public class StringGrade_Ex0_1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount("basic", price);
        int gold = discountService.discount("gold", price);
        int diamond = discountService.discount("diamond", price);

        System.out.println(basic);
        System.out.println(gold);
        System.out.println(diamond);
    }
}
