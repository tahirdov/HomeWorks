import java.util.Random;
import java.util.Scanner;

public class NumberGame {


    public static void main(String[] args) {
        System.out.println("Let the game begin!");
        int[] range = new int[101];
        int randomNumber = getRandom(range);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.next();

        System.out.print("Guess the number: ");
        int guess = scanner.nextInt();
        scanner.nextLine();

        boolean flag = true;

        while (flag) {
            if (guess < 0 || guess > 100) {
                System.out.println("Please, input number in the range of [0-100].");
                System.out.print("Guess the number again: ");
                guess = scanner.nextInt();
                scanner.nextLine();
            }
            else if (randomNumber > guess) {
                System.out.println("Your number is too small. Please, try again.");
                System.out.print("Guess the number again: ");
                guess = scanner.nextInt();
                scanner.nextLine();
            }
            else if (randomNumber < guess) {
                System.out.println("Your number is too big. Please, try again.");
                System.out.print("Guess the number again: ");
                guess = scanner.nextInt();
                scanner.nextLine();
            }
            if (randomNumber == guess) {
                System.out.println("Congratulations, " + name + "!");
                flag = false;
            }
        }



    }

    public static int getRandom (int[] array) {
        return new Random().nextInt(array.length);
    }

}
