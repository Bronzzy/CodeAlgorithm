package array;

import java.util.ArrayList;
import java.util.List;

/*
Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.

Example 1:
Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

Example 2:
Input: nums = [0,1]
Output: [[0,1],[1,0]]

Example 3:
Input: nums = [1]
Output: [[1]]

Constraints:
    1 <= nums.length <= 6
    -10 <= nums[i] <= 10
    All the integers of nums are unique.
 */
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums);
        return list;
    }

    public void backtrack(List<List<Integer>> list, List<Integer> childList, int[] nums) {
        if (childList.size() == nums.length) {
            list.add(new ArrayList<>(childList));
        } else {
            for (int num : nums) {
                if (childList.contains(num)) continue; //skip existed element
                childList.add(num);
                backtrack(list, childList, nums);
                childList.remove(childList.size() - 1);
            }
        }
    }
}
