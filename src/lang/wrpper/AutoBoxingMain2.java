package lang.wrpper;

public class AutoBoxingMain2 {
    public static void main(String[] args) {
        // primitive => Wrapper
        int value = 7;
        Integer boxedValue = value; // 오토박싱
        System.out.println(boxedValue);
        // Wrapper => primitive
        int unboxedValue = boxedValue; // 오토언박싱
        System.out.println(unboxedValue);
    }
}
