import java.util.Arrays;

public class LongestCommonPrefix {
    public static String findLongestCommonPrefix(String[] strings) {
        Arrays.sort(strings);

        String s1 = strings[0];
        String s2 = strings[strings.length - 1];

        int index = 0;

        while (index < s1.length() && index < s2.length()) {
            if (s1.charAt(index) == s2.charAt(index)) {
                index++;
            } else
                break;
        }
        return s1.substring(0, index);
    }
}
