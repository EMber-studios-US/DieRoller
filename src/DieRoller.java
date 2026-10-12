import java.util.Random;
import java.util.Scanner;

public class DieRoller {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        String playAgain;

        do {
            int rollCount = 0;
            int die1, die2, die3;

            System.out.printf("%-10s %-10s %-10s %-10s %-10s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("----------------------------------------------------------");

            do {
                rollCount++;
                die1 = rnd.nextInt(6) + 1;
                die2 = rnd.nextInt(6) + 1;
                die3 = rnd.nextInt(6) + 1;
                int sum = die1 + die2 + die3;

                System.out.printf("%-10d %-10d %-10d %-10d %-10d%n", rollCount, die1, die2, die3, sum);

            } while (!(die1 == die2 && die2 == die3));

            System.out.println("Triple achieved!\n");

            System.out.print("Do you want to roll again? [Y/N]: ");
            playAgain = in.nextLine().trim();
            System.out.println();

        } while (playAgain.equalsIgnoreCase("Y"));

        System.out.println("Program finished.");
    }
}