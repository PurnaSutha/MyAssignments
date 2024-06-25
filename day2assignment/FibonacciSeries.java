package week1.day2assignment;

public class FibonacciSeries {

	public static void main(String[] args) 
	{
         int range=8;//Input range
         int a=0,b=1;//Initializing  the variables
         System.out.println("Fibonacci Series is");
         for (int i=0;i<range;i++)//for loop 
         {
        	 System.out.println(a);////Print statement to print the Fibonacci series
        	 int c=a+b;
        	 a=b;
        	 b=c;
         }
	}

}
