package Homework2;

import java.util.Scanner;
import java.util.Random;

public class Shooting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int line = random.nextInt(4) + 1;
        int bar = random.nextInt(4) + 1;
        System.out.println("All set. Get ready to rumble!");
        String[][] shootingBar =
                {
                        { "| 0 |", "| 1 |", "| 2 |", "| 3 |", "| 4 |", "| 5 |" },
                        { "| 1 |", "| - |", "| - |", "| - |", "| - |", "| - |" },
                        { "| 2 |", "| - |", "| - |", "| - |", "| - |", "| - |" },
                        { "| 3 |", "| - |", "| - |", "| - |", "| - |", "| - |" },
                        { "| 4 |", "| - |", "| - |", "| - |", "| - |", "| - |" },
                        { "| 5 |", "| - |", "| - |", "| - |", "| - |", "| - |" },
                };

        System.out.println();

        checker(shootingBar);
        int inputLine = scanner.nextInt();
        while (inputLine > 5 || inputLine < 1) {
            System.out.println("Enter a line number between 1 - 5: ");
            inputLine = scanner.nextInt(); 
        }
        
        System.out.println("Enter a bar number between 1 - 5: ");
        int inputBar = scanner.nextInt();
        while (inputBar > 5 || inputBar < 1) {
            System.out.println("Enter a bar number between 1 - 5: ");
            inputBar = scanner.nextInt();
        }

        while (inputLine != line || inputBar != bar) {
            shootingBar[inputLine][inputBar] = "| * |";
            checker(shootingBar);
            inputLine = scanner.nextInt();

            while (inputLine > 5 || inputLine < 1 || !scanner.hasNextInt()) {
                System.out.println("Enter a line number between 1 - 5: ");
                inputLine = scanner.nextInt();
            }
            
            System.out.println("Enter a bar number between 1 - 5: ");
            inputBar = scanner.nextInt();

            while (inputBar > 5 || inputBar < 1 || !scanner.hasNextInt()) {
                System.out.println("Enter a bar number between 1 - 5: ");
                inputBar = scanner.nextInt();
            }
        }
        shootingBar[inputLine][inputBar] = "| X |";
        System.out.print("You have won!");
        for (   int i = 0; i < shootingBar.length; i++  )
        {
            System.out.println(" ");
            for (   int j = 0; j < shootingBar.length; j++  )
            {
                System.out.print(shootingBar[i][j] + " ");
            }
        }
    }

    public static void checker(String[][] shootingBar) {
        for (int i = 0; i < shootingBar.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < shootingBar.length; j++) {
                System.out.print(shootingBar[i][j] + " ");
            }
        }

        System.out.println();
        System.out.println("Enter a line number between 1 - 5: ");
    }
}
    
