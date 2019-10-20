package Homework3;

import java.awt.*;
import java.util.Scanner;
import java.util.Locale;

public class WeekPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] schedule = {
                {"Monday", "Visit APA; Complete tests"},
                {"Tuesday", "Go to lesson"},
                {"Wednesday", "Complete home works"},
                {"Thursday", "Go to lesson; complete TTK test"},
                {"Friday", "Complete home works; Visit APA"},
                {"Saturday", "Go to lesson"},
                {"Sunday", "Complete TTK tests and home works"}
        };

        System.out.print("Please, input the day of week: ");
        String input = scanner.nextLine();

        while (!input.equals("exit")) {
            if (checker(input, schedule)) {
                System.out.println("Your tasks for " + schedule[findIndex(input, schedule)][0] + " : " + schedule[findIndex(input, schedule)][1]);
                System.out.print("Please, input the day of week: ");
                input = scanner.nextLine();
            }
            else {
                System.out.print("Sorry, I don't understand you, please try again: ");
                input = scanner.nextLine();
            }
        }

        }

        public static boolean checker (String initial, String [][] array) {
            for (int i = 0; i < array.length; i++) {
                    if (array[i][0].equals(convertToTitle(initial))) {
                        return true;
                    }
            }
        return false;
    }

        public static int findIndex (String initial, String [][] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i][0].equals(convertToTitle(initial))) {
                return i;
            }
        }
        return -1;
        }

        public static String convertToTitle (String initial) {
        StringBuilder convert = new StringBuilder();
        boolean cases = true;
         for (char ch: initial.toCharArray()) {
             if (cases) {
                 ch = Character.toTitleCase(ch);
                 cases = false;
             } else {
                 ch = Character.toLowerCase(ch);
             }

             convert.append(ch);
         }

            return convert.toString();
        }





}
