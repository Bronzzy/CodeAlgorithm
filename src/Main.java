public class Main {
    public static void main(String[] args) {
        int[] ints = {1,2,3,4};
        int[] temp = ints.clone();
        for (int i : temp) {
            System.out.println(i);
        }
    }
}
