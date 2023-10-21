package array;

import java.util.ArrayList;
import java.util.List;

/*
Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.

Example 1:
Input: nums = [1,1,2]
Output:
[[1,1,2],
 [1,2,1],
 [2,1,1]]

Example 2:
Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

Constraints:
    1 <= nums.length <= 8
    -10 <= nums[i] <= 10
 */
public class Permutations2 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums);
        return list;
    }

    public void backtrack(List<List<Integer>> list, List<Integer> childList, int[] nums){
        if(childList.size() == nums.length){
            if(!list.contains(new ArrayList<>(childList)))
                list.add(new ArrayList<>(childList));
        }else{
            for (int num : nums) {
                childList.add(num);
                backtrack(list, childList, nums);
                childList.remove(childList.size() - 1);
            }
        }
    }
}
