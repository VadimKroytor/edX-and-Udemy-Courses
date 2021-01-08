package BeginnerPracticeProblems;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        boolean returnVal = false;
        int numBackwards = 0;

        if (number < 0) {
            number *= -1;
        }
        int temp = number;
        while (temp > 0) {
            numBackwards *= 10;
            numBackwards += temp % 10;

            temp /= 10;
        }
        if (number == numBackwards) {
            returnVal = true;
        }

        return returnVal;
    }
}