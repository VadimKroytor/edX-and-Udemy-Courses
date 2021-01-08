package BeginnerPracticeProblems;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        int result = -1;



        if (number >= 2) {
            int index = 0;
            int arr[] = new int[number];
            int numOfFactors = 0;
            int temp = number;
            for (int i = 1; i <= number; i++) {
                if (temp % i == 0) {
                    for (int j = 1; j <= i; j++) {
                        if (i % j == 0) {
                            numOfFactors++;
                        }
                    }
                    if (numOfFactors == 2) {
                        arr[index++] = i;
                    }
                    numOfFactors = 0;
                }
            }
            int largestPrimeFactorIndex = 0;
            for (int i = 0; arr[i] != 0; i++) {
                largestPrimeFactorIndex++;
            }
            result = arr[--largestPrimeFactorIndex];
        }

        return result;
    }
}