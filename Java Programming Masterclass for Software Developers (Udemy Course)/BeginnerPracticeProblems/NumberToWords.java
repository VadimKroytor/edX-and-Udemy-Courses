package BeginnerPracticeProblems;

public class NumberToWords{

    public static void numberToWords(int number) {
        String result = "Invalid Value";
        String integers[] = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        if (number < 0) {
            System.out.println(result);
        }
        else if (getDigitCount(number) == 1) {
            System.out.println(integers[number]);
        }
        else {
            int numOfDigits = getDigitCount(number);
            result = "";
            int index = 0;
            String stringResult[] = new String[numOfDigits];
            while (number > 0) {
                stringResult[index++] = integers[number % 10] + "\n";
                number /= 10;
            }
            index--;
            while (index >= 0) {
                result += stringResult[index--];
            }
            System.out.println(result);
        }
    }


    public static int getDigitCount(int number) {
        int result = -1;
        if (number >= 0 && number <= 9) {
            result = 1;
        }
        else if (number >= 0){
            result = 0;
            while (number > 0) {
                result++;
                number /= 10;
            }
        }
        return result;
    }

    public static int reverse(int number) {
        boolean isNegative = false;
        if (number < 0) {
            isNegative = true;
            number *= -1;
        }
        int result = 0;
        int temp = number;
        int n = getDigitCount(number) - 1;
        int numOfOccur = 0;
        if (number >= 0) {
            while (temp > 0) {
                numOfOccur = n;
                int power = 1;
                if (numOfOccur == 0) {
                    power = 1;
                } else if (numOfOccur == 1) {
                    power = 10;
                } else {
                    while (numOfOccur >= 1) {
                        power *= 10;
                        numOfOccur--;

                    }
                }

                result += (temp % 10) * power;
                temp /= 10;
                n--;
            }
        }
        if (isNegative) {
            result *= -1;
        }

        return result;
    }
}
