package basicmath;

public class GreatestCommonDivider {
    public static void main(String[] args) {

        int num1 = 15;
        int num2 = 22;

        System.out.println(gcd(num1, num2));
    }

    private static int gcd(int num1, int num2) {
        if (num2 == 0)
            return num1;
        return gcd(num2, num1 % num2);
    }
}
