package BeginnerPracticeProblems;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        int result = -1;
        int temp = number;
        if (temp >= 0) {
            int lastDigit = temp % 10;
            int firstDigit = 0;

            while (temp > 0) {
                if (temp / 10 == 0) {
                    firstDigit = temp % 10;
                }
                temp /= 10;
            }
            if (number / 10 == 0) {
                result = 2 * number;
            }
            else {
                result = firstDigit + lastDigit;
            }
        }
        return result;
    }
}
