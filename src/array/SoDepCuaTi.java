package array;

import java.util.Scanner;

public class SoDepCuaTi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length1 = scanner.nextInt();
        int length2 = scanner.nextInt();

        int[] arr1 = new int[length1];
        int[] arr2 = new int[length2];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }

        int min1 = arr1[1];
        for (int number : arr1) {
            if (number < min1) {
                min1 = number;
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scanner.nextInt();
        }

        int min2 = arr2[0];
        for (int number : arr2) {
            if (number < min2) {
                min2 = number;
            }
        }

        System.out.println(min1 + "" + min2);
    }
}
