package BeginnerPracticeProblems;

public class TeenNumberChecker {
    public static boolean hasTeen (int numOne, int numTwo, int numThree) {
        boolean returnStatement;
        if (numOne >= 13 && numOne <= 19) {
            returnStatement = true;
        }
        else if (numTwo >= 13 && numTwo <= 19) {
            returnStatement = true;
        }
        else if (numThree >= 13 && numThree <= 19) {
            returnStatement = true;
        }
        else {
            returnStatement = false;
        }
        return returnStatement;
    }
    public static boolean isTeen(int numOne) {
        if (numOne >= 13 && numOne <= 19) {
            return true;
        }
        else {
            return false;
        }
    }
}