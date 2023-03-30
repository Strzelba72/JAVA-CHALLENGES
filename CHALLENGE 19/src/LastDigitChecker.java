public class LastDigitChecker {
    public static boolean isValid(int m)
    {
        if(m<10||m>1000)
            return false;
        else
            return true;
    }
    public static boolean hasSameLastDigit(int x,int y,int z)
    {
        if(isValid(x)&&isValid(y)&&isValid(z)&&(x%10==y%10||x%10==z%10||z%10==y%10))
            return true;

        else
            return false;
    }
}
