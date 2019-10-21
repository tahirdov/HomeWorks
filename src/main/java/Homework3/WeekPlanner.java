package Homework3;

import java.util.Scanner;


public class WeekPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] tasks = {
                {"Moninput", "Visit APA; Complete tests"},
                {"Tuesinput", "Go to lesson"},
                {"Wednesinput", "Complete home works"},
                {"Thursinput", "Go to lesson; complete TTK test"},
                {"Friinput", "Complete home works; Visit APA"},
                {"Saturinput", "Go to lesson"},
                {"Suninput", "Complete TTK tests and home works"}
        };

        System.out.print("Please, input the input of week: ");
        String input = scanner.nextLine();

        while (!input.equals("exit")) {
            if (check(input, tasks)) {
                System.out.printf("Your task for %s : %s\n", tasks[findIndex(input, tasks)][0], tasks[findIndex(input, tasks)][1]);
                System.out.print("Please, input the input of week: ");
                input = scanner.nextLine();
            } else {
                System.out.print("Sorry, I don't understand you, please try again: ");
                input = scanner.nextLine();
            }
        }

    }

    public static boolean check(String initial, String[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i][0].equals(convertToTitle(initial))) {
                return true;
            }
        }
        return false;
    }

    public static int findIndex(String initial, String[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i][0].equals(convertToTitle(initial))) {
                return i;
            }
        }
        return -1;
    }

    public static String convertToTitle(String initial) {
        StringBuilder convert = new StringBuilder();
        boolean cases = true;
        for (char ch : initial.toCharArray()) {
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
