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
     static void HandleInput() {
         String[] input = new String[2];
        try (Scanner scanner = new Scanner(System.in)){
            input = scanner.nextLine().split(" ");
            if (input.length > 2 ) throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            out.println("Only two coordinates in the format of (A#) ");
            HandleInput();
        }

        System.out.println(Arrays.toString(input));
    }
}
