public class SharedDigit {
    public static boolean hasSharedDigit(int x,int y)
    {
        int var_x;
        int var_y;
        if((x<10 || x>=100 )|| (y<10 || y>=100))
            return false;
        var_x=x%10;
        x/=10;
        var_y=y%10;
        y/=10;
        if(x==y||x==var_y||var_x==y||var_x==var_y)
            return true;
        else
            return false;

        }

}
