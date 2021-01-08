package BeginnerPracticeProblems;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour)
    {
        long convertToMilesPerHour = Math.round(kilometersPerHour/1.609);
        long returnValue;
        if (kilometersPerHour < 0) {
            returnValue = -1;
        }
        else {
            returnValue = convertToMilesPerHour;
        }
        return returnValue;
    }

    public static void printConversion(double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        }
        else {

            System.out.println(kilometersPerHour + " km/h = " +(milesPerHour) + " mi/h");
        }
    }
}