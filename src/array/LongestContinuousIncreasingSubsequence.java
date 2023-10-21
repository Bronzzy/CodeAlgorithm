package array;

import java.util.ArrayList;
import java.util.List;

/*
You are given an array of integers, and your task is to find the longest continuous increasing subarray in which every element is part of a subsequence.
A subarray is considered continuous if it consists of consecutive elements from the input array.

Example 1:
Input: int[] nums = {1, 2, 4, 5, 3, 8, 7, 9}
Output: [1, 2, 4, 5]
Explanation: In the input array, the longest continuous increasing subarray is [1, 2, 4, 5], and every element is part of a subsequence.

Example 2:
Input: int[] nums = {1, 2, 3, 0, 3, 7, 8, 9}
Output: [3, 7, 8, 9]
Explanation: The longest continuous increasing subarray is [3, 7, 8, 9]

Example 3:
Input: int[] nums = {5, 4, 3, 2, 1}
Output: [5]
Explanation: In this case, there are no continuous increasing subarrays, so the function returns the longest individual element, which is [5].

Constraints:
    All elements of nums are distinct.
    -1000 <= nums[i] <= 1000
    The input array may contain up to 50 elements.
    The input is guaranteed to have at least one element.
 */
public class LongestContinuousIncreasingSubsequence {
    public List<Integer> findLCIS(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<Integer> childList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] > nums[i - 1]) {
                childList.add(nums[i]);
            } else {
                if (childList.size() > list.size()) {
                    list = new ArrayList<>(childList);
                }
                childList.clear();
                childList.add(nums[i]);
            }
        }
        if (childList.size() > list.size()) {
            list = new ArrayList<>(childList);
        }
        return list;
    }
}
