import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class RandomNumberForLoop {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(20) + 1;
        int guesses = 3;

        System.out.print("Guess a number between 1 to 20: ");
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            try {
                int guess = scan.nextInt();
                guesses--;

                if (guess == randomNumber) {
                    System.out.println("Congrats!");
                    break;
                } else if (guesses > 0) {
                    System.out.println("Wrong guess. Only " + guesses + " guesses left!");
                    System.out.print("Guess again: ");
                } else {
                    System.out.println("Number was: " + randomNumber);
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Only integer values are accepted. Guess again: ");
                scan.nextLine();
                i--; // We take back the right to try for wrong value
            }
        }
    }
}
