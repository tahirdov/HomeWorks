package Homework2;

import java.util.Random;
import java.util.Scanner;

public class Shooting {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    int randomLine = random.nextInt(4) + 1;
    int randomBar = random.nextInt(4) + 1;

        System.out.println("All set. get ready to rumble!");
        String[][] deck =
                {
                        { "| 0 |", "| 1 |", "| 2 |", "| 3 |", "| 4 |", "| 5 |" },
                        { "| 1 |", "| - |", "| - |", "| - |", "| - |", "| - |" },
                        { "| 2 |", "| - |", "| - |", "| - |", "| - |", "| - |" },
                        { "| 3 |", "| - |", "| - |", "| - |", "| - |", "| - |" },
                        { "| 4 |", "| - |", "| - |", "| - |", "| - |", "| - |" },
                        { "| 5 |", "| - |", "| - |", "| - |", "| - |", "| - |" },
                };
        deckPrinter(deck);

        System.out.println("Enter line between 1-5: ");
        int inputLine = scanner.nextInt();
        while (inputLine < 1 || inputLine > 5) {
                System.out.println("Please, enter line between 1-5: ");
                inputLine = scanner.nextInt();
        }

        System.out.println("Enter bar between 1-5: ");
        int inputBar = scanner.nextInt();
         {
            while (inputBar < 1 || inputBar > 5) {
                System.out.println("Please, enter bar between 1-5: ");
                inputBar = scanner.nextInt();
            }
        }


        while (inputBar != randomBar || inputLine != randomLine) {
            deck[inputLine][inputBar] = "| * |";
            deckPrinter(deck);

            System.out.println("Enter line between 1-5: ");
            inputLine = scanner.nextInt();

                while (inputLine < 1 || inputLine > 5) {
                    System.out.println("Please, enter line between 1-5: ");
                    inputLine = scanner.nextInt();

                }



            System.out.println("Enter bar between 1-5: ");
            inputBar = scanner.nextInt();
            while (inputBar < 1 || inputBar > 5) {
                System.out.println("Please, enter line between 1-5: ");
                inputBar = scanner.nextInt();
            }
        }

        if (inputBar == randomBar && inputLine == randomLine) {
            deck[inputLine][inputBar] = "| x |";
            System.out.println("You have won!");
            deckPrinter(deck);
        }

    }

    public static void deckPrinter (String[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
        System.out.println();
    }
}



