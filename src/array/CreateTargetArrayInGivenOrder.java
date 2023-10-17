package array;

public class CreateTargetArrayInGivenOrder {
    public static void main(String[] args) {
        createTargetArray(new int[]{0,1,2,3,4},new int[]{0,1,2,2,1});
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[index[i]] = nums[i];
        }
        return ans;
    }
}
