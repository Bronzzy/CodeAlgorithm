package array;

import java.util.ArrayList;
import java.util.List;

/*
Given a string s, find the length of the longest
substring
without repeating characters.

Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

Constraints:
    0 <= s.length <= 5 * 104
    s consists of English letters, digits, symbols and spaces.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public String lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        List<Character> currentSubstring = new ArrayList<>();
        List<Character> longestSubstring = new ArrayList<>();

        for (int i = 0; i < chars.length; i++) {
            char currentChar = chars[i];
            if (!currentSubstring.contains(chars[i])) {
                currentSubstring.add(chars[i]);
            } else {
                int index = currentSubstring.indexOf(currentChar);
                currentSubstring.subList(0, index + 1).clear();
                currentSubstring.add(currentChar);
            }
            if (currentSubstring.size() > longestSubstring.size()) {
                longestSubstring = new ArrayList<>(currentSubstring);
            }
        }

        StringBuilder result = new StringBuilder();
        for (char c : longestSubstring) {
            result.append(c);
        }

        return result.toString();
    }

    public int lengthOfLongestSubstring1(String s) {
        char[] charsArr = s.toCharArray();
        List<Character> currentSubString = new ArrayList<>();
        List<Character> longestSubString = new ArrayList<>();

        for (int i = 0; i < charsArr.length; i++) {
            char currentChar = charsArr[i];
            if (!currentSubString.contains(charsArr)) {
                currentSubString.add(currentChar);
            } else {
                int index = currentSubString.indexOf(currentChar);
                currentSubString.subList(0, index + 1).clear();
                currentSubString.add(currentChar);
            }
            if(currentSubString.size() > longestSubString.size()){
                longestSubString = new ArrayList<>(currentSubString);
            }
        }
        return longestSubString.size();
        /*
        in case of return String instead:
        StringBuilder sb = new StringBuilder();
        for (Character character : longestSubString) {
            sb.append(character);
        }
         return sb.toString();
         */
    }
}
