package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an integer array nums that may contain duplicates, return all possible
subsets
(the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

Example 1:
Input: nums = [1,2,2]
Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]

Example 2:
Input: nums = [0]
Output: [[],[0]]

Constraints:
    1 <= nums.length <= 10
    -10 <= nums[i] <= 10
 */
public class Subsets2 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, list, new ArrayList<>(), 0);
        return list;
    }

    public void backtrack(int[] nums, List<List<Integer>> list, List<Integer> childList, int start) {
        list.add(new ArrayList<>(childList));
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i - 1] == nums[i]) continue;
            childList.add(nums[i]);
            backtrack(nums, list, childList, i + 1);
            childList.remove(childList.size() - 1);
        }
    }
}
