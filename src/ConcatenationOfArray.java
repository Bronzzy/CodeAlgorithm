/*
Given an integer array nums of length n, you want to create an array ans of length 2n
where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
Specifically, ans is the concatenation of two nums arrays.
Return the array ans.
*/
public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums){
        int[] result = new int[nums.length * 2];
        for(int i=0;i<nums.length;i++)
            result[i + nums.length] = result[i] = nums[i];
        return result;
    }
}