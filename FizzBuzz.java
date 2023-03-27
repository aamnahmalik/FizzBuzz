package FizzBuzz;

public class FizzBuzz
{
    public static void main(String[] args)
    {
        for(int i = 1; i <= 100; i++)
        {
            int currentNum = i;
            if((currentNum % 3 == 0) && (currentNum % 5 == 0))
            {
                System.out.println("FizzBuzz");
            }
            else if(currentNum % 3 == 0)
            {
                System.out.println("Fizz");
            }
            else if(currentNum % 5 == 0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(currentNum);
            }
        }
    }
}
