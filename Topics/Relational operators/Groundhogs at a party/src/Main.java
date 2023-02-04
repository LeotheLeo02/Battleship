import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int butterCups = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();

        boolean goodParty;
        goodParty = (!weekend && (butterCups >= 10 && butterCups <= 20) || (weekend && (butterCups >= 15 && butterCups <= 25)));
        System.out.println(goodParty);
    }
}