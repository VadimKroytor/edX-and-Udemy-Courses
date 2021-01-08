package BeginnerPracticeProblems;

public class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo) {
        boolean returnStatement = false;
        double numberOneToThreeDecimalPlaces =  numberOne*1000;
        double numberTwoToThreeDecimalPlaces = numberTwo*1000;
        if ((int)numberOneToThreeDecimalPlaces==(int)numberTwoToThreeDecimalPlaces) {
            returnStatement = true;
        }
        return returnStatement;

    }
}
