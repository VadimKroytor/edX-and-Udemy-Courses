package ArrayProblems.ReverseArrayProblem;
import java.util.Arrays;

public class ReverseArray {
    private static void reverse(int[] intArr) {
        int temp;
        System.out.println("Array = " + Arrays.toString(intArr));
        for (int i = 0; i < intArr.length/2; i++) {
            temp = intArr[i];
            intArr[i] = intArr[intArr.length - 1 - i];

            intArr[intArr.length - 1 - i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(intArr));
    }
}
