package BeginnerPracticeProblems;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        int avg = 0;
        int counter = 0;
        int input;

        Scanner scanner = new Scanner(System.in);
        boolean isValidInput = true;

        while (isValidInput) {
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                sum += input;
                counter++;
            }

            else {
                isValidInput = false;
                scanner.nextLine();
            }

        }

        double average = Math.round((double) sum / counter + 0.0);
        if (counter == 0) {
            System.out.println("SUM = " + sum + " AVG = " + 0);
        }
        else {
            System.out.println("SUM = " + sum + " AVG = " + (int) average);
        }
        scanner.close();
    }
}