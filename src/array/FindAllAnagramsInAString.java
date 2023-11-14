package array;

import java.util.ArrayList;
import java.util.List;

/*
Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:
Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".

Example 2:
Input: s = "abab", p = "ab"
Output: [0,1,2]
Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".

Constraints:
    1 <= s.length, p.length <= 3 * 104
    s and p consist of lowercase English letters.
 */
public class FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();

        //Record char freq
        int[] freq = new int[26];

        for (char c : p.toCharArray()) {
            freq[c - 'a']++;
        }

        //Window, charsleft, windowsize
        int left = 0;
        int right = 0;
        int charsleft = p.length();
        int windowsize = p.length() - 1; //-1 for inclusive arithmetic i.e. length of [1, 3] is 3, but 3 - 1 = 2.
        int strlen = s.length();

        //Slide window l-x-r and process charAt(right).
        while (right < strlen) {

            //Required character found
            if (freq[s.charAt(right) - 'a'] > 0) {
                charsleft--;

                if (charsleft == 0) {
                    //Anagram found
                    list.add(left);
                }
            }

            //Update character frequency
            freq[s.charAt(right) - 'a']--;

            //Slide window / Update charsleft and restore char frequency
            if (right - left == windowsize) {
                if (freq[s.charAt(left) - 'a'] >= 0) {
                    //if freq[s.charAt(left) - 'a'] >= 0 that means the left character was required so charsleft++
                    charsleft++;
                }

                freq[s.charAt(left) - 'a']++;
                left++;
                right++;
            } else {
                right++;
            }
        }

        return list;
    }
}