package BeginnerPracticeProblems;

public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays (long minutes) {
        long hours;
        long days;
        long years;
        if (minutes >= 0) {
            hours = minutes / 60l;
            days = (hours / 24l) % 365;
            years = (hours/24l) / 365;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
        else if (minutes < 0) {
            System.out.println("Invalid Value");
        }
    }
}