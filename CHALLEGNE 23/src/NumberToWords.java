public class NumberToWords {
    public static void numberToWords(int number) {
        int count =getDigitCount(number);
        number=reverse(number);
        if (number < 0)
            System.out.println("Invalid Value");
        else {
            int var;
            while (number > 0) {
                var = number % 10;
                switch (var) {
                    case 0: {
                        System.out.println("Zero");
                        break;
                    }
                    case 1: {
                        System.out.println("One");
                        break;
                    }
                    case 2: {
                        System.out.println("Two");
                        break;
                    }
                    case 3: {
                        System.out.println("Three");
                        break;
                    }
                    case 4: {
                        System.out.println("Four");
                        break;
                    }
                    case 5: {
                        System.out.println("Five");
                        break;
                    }
                    case 6: {
                        System.out.println("Six");
                        break;
                    }
                    case 7: {
                        System.out.println("Seven");
                        break;
                    }
                    case 8: {
                        System.out.println("Eight");
                        break;
                    }
                    case 9: {
                        System.out.println("Nine");
                        break;
                    }


                }
                number /= 10;
                count--;
            }
            while(count>0)
            {
                System.out.println("Zero");
                count--;
            }

        }


    }

    public static int reverse(int number) {
        int var = 0;
        int sign=1;
        if(number<0)
        {
            sign=-1;
            number*=sign;
        }
        while (number > 0) {
            var *= 10;
            var += number % 10;
            number /= 10;
        }
        if(sign==-1)
            return var*-1;
        else
            return var;
    }

    public static int getDigitCount(int number) {
        if (number < 0)
            return -1;
        else {
            int count=0;
            while(number>0)
            {
                number/=10;
                count++;
            }
            return count;

        }


    }
}
