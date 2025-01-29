public class BitwiseShiftDemo {
    public static void main(String[] args) {
        int num = 8; // Binary: 1000

        System.out.println("Original: " + num);
        System.out.println("Left Shift (num << 1): " + (num << 1)); // 16
        System.out.println("Right Shift (num >> 1): " + (num >> 1)); // 4
    }
}
