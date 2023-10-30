package array;

import java.util.ArrayList;
import java.util.List;

/*
Given an array of integers temperatures represents the daily temperatures,
return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature.
If there is no future day for which this is possible, keep answer[i] == 0 instead.

Example 1:
Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]

Example 2:
Input: temperatures = [30,40,50,60]
Output: [1,1,1,0]

Example 3:
Input: temperatures = [30,60,90]
Output: [1,1,0]

Constraints:
    1 <= temperatures.length <= 105
    30 <= temperatures[i] <= 100
 */
public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        List<Integer> list = new ArrayList<>();
        backtrack(temperatures, list, 0, false);
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

    public void backtrack(int[] temperatures, List<Integer> temp, int current, boolean satisfied) {
        if (current >= temperatures.length) return;
        int num = temperatures[current];
        for (int i = current; i < temperatures.length; i++) {
            if (temperatures[i] > num) {
                satisfied = true;
                temp.add(i - current);
                break;
            }
        }
        if (!satisfied) {
            temp.add(0);
        }
        backtrack(temperatures, temp, current + 1, false);
    }
}
