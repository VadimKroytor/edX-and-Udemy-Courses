package BeginnerPracticeProblems;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature)
    {
        boolean returnStatement = false;
        if (temperature >= 25 && temperature <= 35
                || summer && temperature >= 35 && temperature <= 45)
        {
            returnStatement = true;
        }

        return returnStatement;
    }

}