import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] nums;
        nums = new int[length];
        for (int i = 0; i < length; i++) {
            nums[i] = scanner.nextInt();
        }
        int a = scanner.nextInt(), b = scanner.nextInt();
        boolean together = true;
        for (int i = 0; i < length; i++) {
            int ahead = i == length - 1 ? 0 : nums[i + 1];

            if (nums[i] == a && ahead == b || nums[i] == b && ahead == a) {
                together = false;
            }
        }

        System.out.println(together);
    }
}
