public class SumDigit {
    public static int Sumalldigit(int number)
    {
        if(number<=0)
            return -1;
        else if(number/10==0)
            return number;
        else {
            int sum=0;
            while(number>0)
            {
                sum+=number%10;
                number/=10;
            }

            return sum;

        }

    }
}
