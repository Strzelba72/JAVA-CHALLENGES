public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number)
    {
        int sum=0;

        if(number<0)
            return -1;
        else if(number < 10)
            return number*2;
        else {

            sum += number % 10;
            number /= 10;
            while (number > 0) {
                if (number < 10)
                    sum += number;
                number /= 10;
            }
            return sum;
        }
    }
}
