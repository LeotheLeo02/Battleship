import java.util.Arrays;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] twoDimArray = new int[n][n];

        boolean symmetric = true;
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = scanner.nextInt();
            }
        }


//        for (int i = 0; i < twoDimArray.length; i++) {
//            String boy = Arrays.toString(twoDimArray[i])
//                    .replace(",", "")
//                    .replace("[", "")
//                    .replace("]", "")
//                    .trim();
//            System.out.println(boy);
//        }

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                if (twoDimArray[i][j] != twoDimArray[j][i]) {
                    symmetric = false;
                    break;
                }
            }
        }

        if (symmetric) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}