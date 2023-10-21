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

    /*
    This code is to find Longest Substring Without Repeating Characters
    that takes ONLY SUBSEQUENCE characters
     */

    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        List<Character> list = new ArrayList<>();
        List<Character> childlist = new ArrayList<>();

        for (int i = 0; i < chars.length; i++) {
            if (i == 0 || !childlist.contains(chars[i])) {
                childlist.add(chars[i]);
            } else {
                if(childlist.size() > list.size()){
                    list = new ArrayList<>(childlist);
                }
                childlist.clear();
                childlist.add(chars[i]);
            }
        }
        if(childlist.size() > list.size()){
            list = new ArrayList<>(childlist);
        }
        return list.size();
    }

    /*
    This code is to find Longest Substring Without Repeating Characters
    that takes EVERY character
     */
    public String lengthOfLongestSubstring1(String s) {
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
}
