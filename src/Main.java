import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in);

        //define object and its hints
        String object = "apple";
        String[] hints = {
            "I spy with my little eye, something that is red.",
                "It is round and can be found in a kitchen.",
                "You can eat it, and it's often associated with teachers."
        };

        System.out.println("Welcome to the 'I Spy' game!");
        System.out.println("Try to guess the object I'm thinking of.");

        for (int i = 0; i < hints.length; i++) {
            System.out.println("Hint" + (i + 1) + ":" + hints[i]);
            System.out.println("Your guess:");
            String guess = scanner.nextLine().trim().toLowerCase();

            if (guess.equals(object)) {
                System.out.println("Correct! The object was" + object);
                System.out.println("Congratulations, you won!");
                scanner.close();
                return;
            } else {
                System.out.println("Wrong guess. Try again!");
            }
        }

        //if player doesn't guess correctly
        System.out.println("Sorry, you're out of hints. The object was " + object + ".");
        System.out.println("Better luck next time");
        scanner.close();
    }
}