package BeginnerPracticeProblems;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int numOne, int numTwo, int numThree) {
        boolean result = false;
        if (isValid(numOne) && isValid(numTwo) && isValid(numThree)) {
            if (numOne % 10 == numTwo % 10 || numOne % 10 == numThree % 10 || numTwo % 10 == numThree % 10) {
                result = true;
            }
        }
        return result;
    }

    public static boolean isValid(int number) {
        boolean result = false;
        if (number >= 10 && number <= 1000) {
            result = true;
        }
        return result;
    }
}