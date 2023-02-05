package battleship;

import battleship.ships.Ship;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

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
            for (int j = 0; j < 10; j++) {
                out.print('~' + " ");
            }
            out.println();
        }
        HandleInput();
    }

     private static void HandleInput() {
        String[] input;
        Object[][] list = {
                {"Aircraft Carrier", "Battleship", "Submarine", "Cruiser" , "Destroyer"},
                {5, 4, 3, 3, 2}
        };
        Ship[] ships = new Ship[5];
        try (Scanner scanner = new Scanner(System.in)){
                for (int j = 0; j < list[0].length; j++) {
                    do {
                        out.printf("Enter the coordinates of the %s ", list[0][j]);
                        input = scanner.nextLine().split(" ");
                        ships[j] = new Ship(input, (Integer) list[1][j]);
                    } while (!isGoodInput(input));
                }
        }
//        out.println(Arrays.toString(input));
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
