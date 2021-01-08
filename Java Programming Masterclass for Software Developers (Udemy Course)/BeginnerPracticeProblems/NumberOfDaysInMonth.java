package BeginnerPracticeProblems;

public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        boolean returnValue;
        if ((year >= 1 && year <= 9999) && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            returnValue = true;
        }
        else {
            returnValue = false;
        }
        return returnValue;
    }
    public static int getDaysInMonth (int month, int year) {
        int returnValue;
        boolean isLeapYear = isLeapYear(year);
        if ((year >= 1 && year <= 9999) && (month == 1)) {
            returnValue = 31;
        }
        else if ((year >= 1 && year <= 9999) && (month == 2) && isLeapYear) {
            returnValue = 29;
        }
        else if ((year >= 1 && year <= 9999) && (month == 2)) {
            returnValue = 28;
        }
        else if ((year >= 1 && year <= 9999) && (month == 3)) {
            returnValue = 31;
        }
        else if ((year >= 1 && year <= 9999) && (month == 4)) {
            returnValue = 30;
        }
        else if ((year >= 1 && year <= 9999) && (month == 5)) {
            returnValue = 31;
        }
        else if ((year >= 1 && year <= 9999) && (month == 6)) {
            returnValue = 30;
        }
        else if ((year >= 1 && year <= 9999) && (month == 7)) {
            returnValue = 31;
        }
        else if ((year >= 1 && year <= 9999) && (month == 8)) {
            returnValue = 31;
        }
        else if ((year >= 1 && year <= 9999) && (month == 9)) {
            returnValue = 30;
        }
        else if ((year >= 1 && year <= 9999) && (month == 10)) {
            returnValue = 31;
        }
        else if ((year >= 1 && year <= 9999) && (month == 11)) {
            returnValue = 30;
        }
        else if ((year >= 1 && year <= 9999) && (month == 12)) {
            returnValue = 31;
        }
        else {
            returnValue = -1;
        }
        return returnValue;
    }
}
