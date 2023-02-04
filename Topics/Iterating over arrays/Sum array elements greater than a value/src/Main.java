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

        int special_number = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] > special_number) {
                sum += nums[i];
            }
        }
        System.out.println(sum);
    }
}