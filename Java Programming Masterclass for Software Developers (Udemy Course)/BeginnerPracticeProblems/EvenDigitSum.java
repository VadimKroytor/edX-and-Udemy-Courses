package BeginnerPracticeProblems;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        int result = -1;
        if (number >= 0) {
            int temp = number;
            result = 0;

            while (temp > 0) {
                if (temp % 2 == 0) {
                    result += temp % 10;
                }
                temp /= 10;
            }

        }
        return result;
    }
}