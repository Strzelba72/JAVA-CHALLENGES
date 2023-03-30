public class EvenDigitSum {
    public static boolean isEven(int x)
    {
        if(x%2==0)
            return true;
        else
            return false;
    }
    public static int getEvenDigitSum(int number)
    {
        int sum=0;
        int digit;
        if(number<0)
            return -1;
        else
        {
            while(number>0)
            {
                digit=number%10;

                if(isEven(digit))
                {
                    sum+=digit;
                }
                number/=10;
            }

        }
        return sum;
    }
}
