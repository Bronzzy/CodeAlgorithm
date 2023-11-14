package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

Example 1:
Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

Example 2:
Input: digits = ""
Output: []

Example 3:
Input: digits = "2"
Output: ["a","b","c"]

Constraints:
    0 <= digits.length <= 4
    digits[i] is a digit in the range ['2', '9'].
 */
public class LetterCombinationOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return new ArrayList<>();
        }

        Map<Character, String[]> letterMap = new HashMap<>();
        letterMap.put('2', new String[]{"a", "b", "c"});
        letterMap.put('3', new String[]{"d", "e", "f"});
        letterMap.put('4', new String[]{"g", "h", "i"});
        letterMap.put('5', new String[]{"j", "k", "l"});
        letterMap.put('6', new String[]{"m", "n", "o"});
        letterMap.put('7', new String[]{"p", "q", "r", "s"});
        letterMap.put('8', new String[]{"t", "u", "v"});
        letterMap.put('9', new String[]{"w", "x", "y", "z"});

        List<String> result = new ArrayList<>();
        for (char digit : digits.toCharArray()) {
            String[] letters = letterMap.get(digit);
            List<String> newResult = new ArrayList<>();

            if (result.isEmpty()) {
                for (String letter : letters) {
                    newResult.add(letter);
                }
            } else {
                for (String prefix : result) {
                    for (String letter : letters) {
                        newResult.add(prefix + letter);
                    }
                }
            }

            result = newResult;
        }

        return result;
    }
}
