package battleship;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

class Map {
    public static void setupCoordinateSys() {
        out.print("  ");
        for (int i = 1; i < 11; i++) {
            out.print(i + " ");
        }
        out.println();
        for (int i = 65; i < 75; i++) {
            out.print(((char) i) + " ");
            setupWaters();
        }
        HandleInput();
    }

    private static void setupWaters() {
        for (int i = 0; i < 10; i++) {
            out.print('~' + " ");
        }
        out.println();
    }
     private static void HandleInput() {
        String[] input;
        try (Scanner scanner = new Scanner(System.in)){
            do {
                input = scanner.nextLine().split(" ");
            } while (!isGoodInput(input));
        }
        System.out.println(Arrays.toString(input));
    }
    private static boolean isGoodInput(String[] array) {
        if (array.length != 2) {
            out.println("Not valid input");
            return false;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() != 2) {
                out.println("Not valid input");
                return false;
            }
        }
        return true;
    }
}
