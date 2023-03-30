public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double x,double y)
    {
        x*=1000;
        y*=1000;
        x=(int)x;
        y=(int)y;
        if (x==y)
            return true;
        else
            return false;
    }
}
