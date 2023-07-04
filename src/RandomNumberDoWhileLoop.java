import java.util.Random;
import java.util.Scanner;

public class RandomNumberDoWhileLoop {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(20) + 1;
        int guesses = 3;
        System.out.println("Guess a number between 1 to 20: ");
        Scanner scan = new Scanner(System.in);

        do {
            int guess = scan.nextInt();
            guesses--;

            if (guess == randomNumber) {
                System.out.println("Congrats!");
            } else if (guesses > 0) {
                System.out.println("Wrong guess.Only " + guesses + " guesses left!");
                System.out.println("Guess again: ");
            } else {
                System.out.println("Number was: " + randomNumber);
            }
        } while (guesses > 0);
    }
}
