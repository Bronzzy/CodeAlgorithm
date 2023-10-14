/*
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 */
public class ShuffleTheArray {
    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        for (int i = 0, j = n, index = 0; i < ans.length; i++, j++) {
            ans[index++] = nums[i];
            ans[index++] = nums[j];
        }
        return ans;
    }
}
