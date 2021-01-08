package ArrayProblems.MinimumElementProblem;

import java.util.Scanner;
public class MinimumElement {

    private static int readInteger() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    private static int[] readElements(int numElem) {
        int[] intArr = new int[numElem];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i <= numElem - 1; i++) {
            intArr[i] = input.nextInt();
        }
        return intArr;
    }

    private static int findMin(int[] intArr) {
        int minVal = Integer.MAX_VALUE;

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] < minVal) {
                minVal = intArr[i];
            }
        }
        return minVal;
    }

}
