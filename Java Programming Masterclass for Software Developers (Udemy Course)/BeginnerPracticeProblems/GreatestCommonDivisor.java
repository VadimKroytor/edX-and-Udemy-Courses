package BeginnerPracticeProblems;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        int result = -1;
        if (first >= 10 && second >= 10) {
            result = 0;
            int mulFirst[] = new int[100];
            int mulSecond[] = new int[100];
            int indexFirst = 0;
            int indexSecond = 0;
            int counter = 1;
            int max = first >= second ? first : second;
            while (counter <= max) {
                if (first % counter == 0) {
                    mulFirst[indexFirst++] = counter;
                }
                if (second % counter == 0) {
                    mulSecond[indexSecond++] = counter;
                }
                counter++;
            }
            indexFirst--;
            int tempIndexSec = --indexSecond;
            boolean found = false;
            while (indexFirst >= 0 && found == false) {
                while (tempIndexSec >= 0 && found == false) {
                    if (mulFirst[indexFirst] == mulSecond[tempIndexSec]) {
                        found = true;
                        result = mulFirst[indexFirst];
                    }

                    tempIndexSec--;
                }
                indexFirst--;
                tempIndexSec = indexSecond;
            }

        }

        return result;
    }
}