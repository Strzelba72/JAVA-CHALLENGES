public class LargestPrime {
    public static int getLargestPrime(int number)
    {
        if(number<=1)
            return -1;
        else {
            int max_prime=1;
            for(int i=2;i<=number;i++)
            {
                boolean isPrime=false;
                for(int j=2;j<i;j++)
                {
                    if(i%j==0)
                        isPrime=true;
                }
                if(!(isPrime) &&number%i==0)
                {
                    max_prime=i;
                }
            }
            return max_prime;
        }
    }
}
