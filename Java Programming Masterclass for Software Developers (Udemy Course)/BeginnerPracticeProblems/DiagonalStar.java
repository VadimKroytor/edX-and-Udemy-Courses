package BeginnerPracticeProblems;

public class DiagonalStar {
    public static void printSquareStar(int number) {
        String result = "Invalid Value";

        if (number  >= 5) {
            result = "";

            for (int row = 1; row <= number; row++) {
                for (int col = 1; col <= number; col++) {
                    if (row == 1 || row == number || col == 1 || col == number || row == col || col == number - row + 1) {

                        result += "*";
                    }

                    else {
                        result += " ";
                    }
                }
                result += "\n";
            }
        }

        System.out.println(result);
    }
}