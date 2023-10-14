import java.util.Scanner;

public class HieuChanLe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        if (length < 1 || length > 100000){
            System.exit(1);
        }
            scanner.nextLine();

        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            int input = scanner.nextInt();
            if(input < 1 || input > 1000000000){
                System.exit(1);;
            }
            array[i] = input;
        }

        int chan = 0;
        for (int i = 0; i < array.length; i += 2) {
            chan += array[i];
        }

        int le = 0;
        for (int i = 1; i < array.length; i += 2) {
            le += array[i];
        }

        System.out.println(le - chan);
    }
}
