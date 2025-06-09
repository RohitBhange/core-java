public class AddBinary {
    public static void main(String[] args) {
        String b1 = "1010";
        String b2 = "1101";

        String sum = Integer.toBinaryString(
            Integer.parseInt(b1, 2) + Integer.parseInt(b2, 2)
        );

        System.out.println("Sum = " + sum);
    }
}

