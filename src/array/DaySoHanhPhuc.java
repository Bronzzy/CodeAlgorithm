package array;

import java.util.Scanner;

public class DaySoHanhPhuc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if(input < 1)
            System.exit(1);
        while (input != 1) {
            if (input % 2 == 0) {
                input = input / 2;
            } else {
                input = input * 3 + 1;
            }
        }
    }
}
