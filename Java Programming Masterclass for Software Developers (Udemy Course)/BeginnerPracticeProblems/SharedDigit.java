package BeginnerPracticeProblems;

public class SharedDigit {
    public static boolean hasSharedDigit(int numOne, int numTwo) {
        boolean result = false;

        if (numOne >= 10 && numOne <= 99 && numTwo >= 10 && numTwo <= 99) {
            int tempOne = numOne;
            int tempTwo = numTwo;

            int digitOne = tempOne % 10;
            int  digitTwo = tempTwo % 10;

            while (tempOne > 0 && result == false) {
                digitOne = tempOne % 10;
                digitTwo = tempTwo % 10;
                while (tempTwo > 0 && result == false) {
                    if (digitOne == digitTwo) {
                        result = true;
                    }
                    else {
                        tempTwo /= 10;
                        digitTwo = tempTwo % 10;

                    }
                }
                tempOne /= 10;
                tempTwo = numTwo;
            }


        }
        return result;
    }
}