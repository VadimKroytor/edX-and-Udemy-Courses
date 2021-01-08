package BeginnerPracticeProblems;

public class FactorPrinter {
    public static void printFactors(int number) {
        String result = "Invalid Value";
        if (number < 1) {
            System.out.println(result);
        }
        else {

            result = "";
            int arr[] = new int[number];
            int index = 0;
            int counter = 1;
            while (counter <= number) {
                if (number % counter == 0) {
                    arr[index++] = counter;
                }
                counter++;
            }
            --index;
            int i = 0;
            while (i <= index) {
                result += arr[i] + " ";
                i++;
            }
            System.out.println(result);
        }
    }
}
