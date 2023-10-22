public class Main {
    public static void main(String[] args) {
        String s = "123abc123";
        char[] arrs = s.toCharArray();
        int count = 0;
        for (char arr : arrs) {
            if(Character.isDigit(arr)){
                count++;
            }
        }
        System.out.println(count);
    }
}
