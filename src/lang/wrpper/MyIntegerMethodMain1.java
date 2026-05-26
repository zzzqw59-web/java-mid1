package lang.wrpper;

public class MyIntegerMethodMain1 {
    public static void main(String[] args) {
        int value = 10;

        int num = compareTo(value, 5);
        System.out.println(num);

        num = compareTo(value, 10);
        System.out.println(num);

        num = compareTo(value, 20);
        System.out.println(num);
    }

    public static int compareTo(int value, int target) {
        if (value < target) {
            return -1;
        } else if (value == target) {
            return 0;
        } else {
            return -1;
        }
    }
}
