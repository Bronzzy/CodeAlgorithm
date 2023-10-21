package array;

import java.util.Scanner;

public class SoDepCuaTi {
    public void main(int[] arr1, int[] arr2) {

        int min1 = arr1[1];
        for (int number : arr1) {
            if (number < min1) {
                min1 = number;
            }
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
