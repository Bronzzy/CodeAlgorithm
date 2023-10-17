package basicmath;

import java.util.Scanner;

public class CongHaiPhanSo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int lcm = (b > d) ? b : d;
        while (lcm % b != 0 || lcm % d != 0) {
            lcm++;
        }

        if (lcm == d)
            a *= (lcm / b);
        if (lcm == b)
            c *= (lcm / d);

        int gcd1 = gcd(a + c, lcm);
        System.out.println((a + c) / gcd1 + " " + lcm / gcd1);

    }

    private static int gcd(int num1, int num2) {
        if (num2 == 0)
            return num1;

        return gcd(num2, num1 % num2);
    }
}
