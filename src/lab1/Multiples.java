package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples(1000,3,5));
    }

    static int multiples(int n, int a, int b) {
        int countA = (n - 1) / a;
        int countB = (n - 1) / b;

        int x = a, y = b;
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        int gcd = x;
        int lcm = a / gcd * b;
        int countBoth = (n - 1) / lcm;

        return countA + countB - countBoth;
    }
    static int multiples() {
        int num = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                num++;
            }
        }
        return num;
    }
}
