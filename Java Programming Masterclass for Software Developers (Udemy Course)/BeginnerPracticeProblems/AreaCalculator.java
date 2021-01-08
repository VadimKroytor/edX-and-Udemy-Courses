package BeginnerPracticeProblems;

public class AreaCalculator {
    public static double area(double radius) {
        double returnValue = 0;
        double area = radius*radius*Math.PI;
        if (radius > 0) {
            returnValue = area;
        }
        else if (radius < 0) {
            returnValue = -1.0;
        }
        return returnValue;
    }

    public static double area(double x, double y) {
        double returnValue = 0;
        double area = x*y;
        if (x > 0 && y > 0) {
            returnValue = area;
        }
        else if (x < 0 || y < 0) {
            returnValue = -1.0;
        }
        return returnValue;
    }
}

