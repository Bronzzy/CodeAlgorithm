package array;

/*
Given an array of distinct integers. Find the third-largest element using one for loop

Example 1:
Input: int[] arr = [4,2,5,1,9,7,8,3,6]
Output: 7
 */

public class FindThirdLargestElement {
    public static void main(String[] args) {
        int[] arr= {4,2,5,1,9,7,8,3,6};

        System.out.println(findThirdLargestElemnt(arr));
    }
    public static int findThirdLargestElemnt(int[] arr){
        int largest = 0, large2nd = 0, large3rd = 0;
        for (int i : arr) {
            if(i > largest){
                large3rd = large2nd;
                large2nd = largest;
                largest = i;
            } else if (i > large2nd) {
                large3rd = large2nd;
                large2nd = i;
            } else if (i > large3rd) {
                large3rd = i;
            }
        }
        return large3rd;
    }
}
