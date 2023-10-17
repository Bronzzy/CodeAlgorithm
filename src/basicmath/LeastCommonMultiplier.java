package basicmath;

import java.util.Scanner;

public class LeastCommonMultiplier {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a, b, bcnn;

        a = scanner.nextInt();

        b = scanner.nextInt();

        bcnn = (a > b) ? a : b;
        while (bcnn % a != 0 || bcnn % b != 0) {
            bcnn++;
        }
        System.out.println(bcnn);
    }
}
