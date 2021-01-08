package BeginnerPracticeProblems;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean returnStatement;
        if (hourOfDay >= 0 && hourOfDay < 8 && barking == true) {
            returnStatement = true;
        }
        else if (hourOfDay >22 && hourOfDay <= 23 && barking == true) {
            returnStatement = true;
        }
        else if (hourOfDay < 0 || hourOfDay > 23) {
            returnStatement = false;
        }
        else {
            returnStatement = false;
        }
        return returnStatement;
    }
}