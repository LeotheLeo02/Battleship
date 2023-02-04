import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        int max = scanner.nextInt();

        long multiply = 1;
        for (int i = min; i < max; i++) {
            multiply *= i;
        }
        System.out.println(multiply);
    }
}