package week1.day2assignment;

public class PalindromeNumber {

	public static void main(String[] args)
	{
		int input=121 ;//input Number 
		int i=input;
		int rem;// to store the reminder
		int output=0;//intializing the variable output 
	   
		for (output=0;i>0;i=i/10)  //logic to reverse the number using for loop
		{
			rem=i%10;
			output=(output*10)+ rem;
		}
		System.out.println("Reverse of the input number is "+ output);
		
		//check the given input number is Palindrome or not
		 if(input==output)
		 {
			 System.out.println("The Input number "+ input +" is a Palindrome");
		 }
		 else
		 {
			 System.out.println("The Input number "+ input +" is not a Palindrome");
			 
		 }
	}

}
