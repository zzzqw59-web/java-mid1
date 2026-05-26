package lang.wrpper;

public class AutoBoxingMain1 {
    public static void main(String[] args) {
        // primitive => Wrapper
        int value = 7;
        Integer boxedValue = Integer.valueOf(7);
        System.out.println(boxedValue);
        // Wrapper => primitive
        int unboxedValue = boxedValue.intValue();
        System.out.println(unboxedValue);
    }
}
