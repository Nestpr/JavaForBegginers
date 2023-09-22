public class HundredthPrime
{
   public static void main(String[] args)
   {
      int count = 1;
      int num = 0;
      while (count < 100)
      {
         num += 1;
          for(int div = num - 1; div > 1; div--) //div is the number currently acting as the divisor, which starts as one less than the current number
               {
                  if (num % div == 0) //if the divisor divides the number exactly
                  {
                     break; //then this is not a prime, keep looking
                  }
                  else if (div == 2) //if all the divisors down to 2 have been evaluated without success, then this is a prime
                  {
                     count++; //increase the prime count by one
                  }
               }
            }
            System.out.println(num); //print the 100th prime
         }
      }