public class est {
    public static void main(String[] args) {
        System.out.println(new est().reverse(123));
    }

    public int reverse(int x) {
        long result = 0;
        while (x != 0) {
            result = x % 10 + result * 10;
            x /= 10;
        }
        return (int) result == result ? (int) result : 0;


    }
}
