/*
Given a String str with length n, int a with a < n, int b with b < n.
Cut the str with a length a and add to the end of the str. Do the same with length b.
How many times will the str return to the original state.
 */
public class WhenStringReturnToFirstChar {
    public int Solution(String str, int a, int b) {

        int count = 0;
        char target = str.charAt(0);

        do {
            str = str.substring(a) + str.substring(0, a);
            count++;

            str = str.substring(b) + str.substring(0, b);
            count++;
        } while (str.charAt(0) != target);

        return count;
    }
}
