public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature)
    {
        if((summer==true && (temperature<=45&&temperature>=25)) || (summer==false && (temperature<=35&&temperature>=25)))
            return true;
        else
            return false;
    }
}
