public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second)
    {
        if(first<10||second<10)
            return -1;
        int smaller_value;
        int max=0;
        if(first>=second)
            smaller_value=second;
        else
            smaller_value=first;
        for(int i=1;i<=smaller_value;i++)
        {
            if(first%i==0&& second%i==0)
                max=i;
        }
        return max;
    }
}
