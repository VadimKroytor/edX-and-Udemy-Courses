package BeginnerPracticeProblems;

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        int result = -1;

        if (width > 0 && height > 0 && areaPerBucket > 0 && extraBuckets >= 0) {


            double area = width * height;

            result = (int) Math.ceil(area / areaPerBucket);
            result -= extraBuckets;
        }

        return result;
    }
    /*Sample inputs:
    -3.4, 2.1, 1.5
    3.4, 2.1, 1.5
    7.25, 4.3, 2.35

    */
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        int result = -1;

        if (width > 0 && height > 0 && areaPerBucket > 0) {


            double area = width * height;
            result = (int) Math.ceil(area / areaPerBucket);

        }

        return result;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        int result = -1;

        if (area > 0 && areaPerBucket > 0) {
            result = (int) Math.ceil(area/areaPerBucket);
        }

        return result;
    }
}