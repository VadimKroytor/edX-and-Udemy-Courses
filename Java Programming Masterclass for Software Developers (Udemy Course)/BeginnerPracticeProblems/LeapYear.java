package BeginnerPracticeProblems;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        boolean returnStatement;
        if (year < 1 || year > 9999) {
            returnStatement = false;
        }
        else if (year % 4 == 0 && year % 100 != 0) {
            returnStatement = true;
        }
        else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            returnStatement = true;
        }

        else {
            returnStatement = false;
        }
        return returnStatement;
    }
}
