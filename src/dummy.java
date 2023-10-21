import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class dummy {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 5, 6, 5, 6, 7, 8, 9));
        List<Integer> subList = nums.subList(0, 4);

        for (Integer integer : subList) {
            System.out.println(integer);
        }
    }
}
