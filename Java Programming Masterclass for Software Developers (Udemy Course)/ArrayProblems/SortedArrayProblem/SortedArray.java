package ArrayProblems.SortedArrayProblem;

import java.util.Scanner;

public class SortedArray {
    public static int[] getIntegers(int sizeArr) {
        Scanner scan = new Scanner(System.in);
        int num;
        int[] retArr = new int[sizeArr];

        System.out.println("Enter " + sizeArr + " integers below: \r");
        for (int i = 0; i <= sizeArr - 1; i++) {
            num = scan.nextInt();
            retArr[i] = num;
        }

        return retArr;
    }

    //example: [5, 2, 6, 3, 8]
    public static int[] sortIntegers(int[] unsortedArr) {
        int[] sortedArr = new int[unsortedArr.length];

        int maxVal;
        int lastMaxValIndex = 0;
        for (int j = 0; j <= unsortedArr.length - 1; j++) {
            maxVal = Integer.MIN_VALUE;
            for (int i = 0; i <= unsortedArr.length - 1; i++) {
                if (unsortedArr[i] > maxVal) {
                    maxVal = unsortedArr[i];
                    lastMaxValIndex = i;
                }

                if (i == unsortedArr.length - 1) {

                    unsortedArr[lastMaxValIndex] = Integer.MIN_VALUE;
                }

            }

            sortedArr[j] = maxVal;
        }

        return sortedArr;
    }

    public static void printArray(int[] intArr) {
        for (int i = 0; i <= intArr.length - 1; i++) {
            System.out.println("Element " + i + " contents " + intArr[i]);
        }
    }


}