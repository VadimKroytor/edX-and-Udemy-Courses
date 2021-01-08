package BeginnerPracticeProblems;

public class SumOddRange {
    public static boolean isOdd(int number) {
        boolean returnStatement = false;
        if (number > 0 && number % 2 != 0) {
            returnStatement = true;
        }
        return returnStatement;
    }

    public static int sumOdd(int start, int end) {
        int returnValue = -1;
        boolean forCondition = false;
        for (int i = start; i <= end && start > 0 && end > 0 && end >= start; i++) {
            if (!forCondition) {
                returnValue = 0;
                forCondition = true;
            }
            if (isOdd(i)) {
                returnValue += i;
            }
        }
        return returnValue;
    }
}
